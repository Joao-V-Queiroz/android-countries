package com.airg.android;

import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;

import com.airg.android.countries.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * Created by mahramf.
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public final class Countries {
    private Countries() {
    } // no instance for you

    private static final int CACHE_SIZE = 50;

    private static LruCache<String, Country> alpha3Lookup = new LruCache<>(CACHE_SIZE);
    private static LruCache<Integer, Country> prefixLookup = new LruCache<>(CACHE_SIZE);

    /**
     * Get a list of all countries sorted according to the provided {@link Comparator}
     *
     * @return sorted list
     */
    public static Country[] sorted(final Comparator<Country> comparator) {
        final Country[] countries = Country.values();
        Arrays.sort(countries, comparator);
        return countries;
    }

    /**
     * Get a list of all countries sorted by their latin names
     *
     * @return sorted list
     */
    public static Country[] sortedByLatinName() {
        return sorted(new Comparators.LatinNameComparator());
    }

    /**
     * Get a list of all countries sorted by their Alpha2 code
     *
     * @return sorted list
     */
    public static Country[] sortedByAlpha2() {
        return sorted(new Comparators.Alpha2Comparator());
    }

    /**
     * Get a list of all countries sorted by their Alpha3 code
     *
     * @return sorted list
     */
    public static Country[] sortedByAlpha3() {
        return sorted(new Comparators.Alpha3Comparator());
    }

    /**
     * Find a country by it's alpha2 iso code
     *
     * @param alpha2 alpha 2 code. Must not be <code>null</code>.
     * @return The {@link Country} if found, or <code>null</code> if not found.
     */
    public static Country byAlpha2(@NonNull final String alpha2) {
        try {
            return Country.valueOf(key(alpha2));
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Find a country by it's alpha3 iso code
     *
     * @param alpha3 alpha 3 code. Must not be <code>null</code>.
     * @return The {@link Country} if found, or <code>null</code> if not found.
     */
    public static Country byAlpha3(@NonNull final String alpha3) {
        final String key = key(alpha3);
        Country country = alpha3Lookup.get(key);

        if (null != country) return country;

        country = new Finder<>(new Alpha3SearchFilter()).find(key);

        if (null == country) return null;

        alpha3Lookup.put(key, country);
        return country;
    }

    interface SearchFilter<KEY> extends Comparator<Country> {
        // 0 : equal
        // - : key > country
        // + : key < country
        int getDirection(final Country country, final KEY key);
    }

    static class Alpha3SearchFilter extends Comparators.Alpha3Comparator
            implements SearchFilter<String> {

        @Override
        public int getDirection(final Country country, final String s) {
            return country.alpha3.compareToIgnoreCase(s);
        }
    }

    static class Finder<KEY> {
        final SearchFilter<KEY> filter;
        final Country[] countries = Country.values();

        private Finder(final SearchFilter<KEY> searchFilter) {
            filter = searchFilter;
        }

        private Country find(final KEY key) {
            Arrays.sort(countries, filter);
            return find(key, 0, countries.length);
        }

        private Country find(final KEY key, final int start, final int len) {
            if (0 == len) return null;

            final int mid = start + (len / 2);

            final int dir = filter.getDirection(countries[mid], key);

            if (0 == dir) return countries[mid];

            return dir > 0
                    ? find(key, mid, len - mid)
                    : find(key, start, mid - start);
        }
    }

    private static String key(final String in) {
        return null == in
                ? null
                : in.toUpperCase(Locale.ENGLISH);
    }
}
