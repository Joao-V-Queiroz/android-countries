package com.airg.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import com.airg.android.countries.Comparators;
import com.airg.android.device.ApiLevel;
import com.airg.android.device.Device;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import static android.os.Build.VERSION_CODES.N;

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
    public static Country byAlpha2(final String alpha2) {
        try {
            return TextUtils.isEmpty(alpha2)
                    ? null
                    : Country.valueOf(key(alpha2));
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
    public static Country byAlpha3(final String alpha3) {
        if (TextUtils.isEmpty(alpha3)) return null;

        final String key = key(alpha3);
        Country country = alpha3Lookup.get(key);

        if (null != country) return country;

        country = new Finder<>(new Alpha3SearchFilter()).find(key);

        if (null == country) return null;

        alpha3Lookup.put(key, country);
        return country;
    }

    /**
     * Gets the country code corresponding to the device (via {@link #getDeviceCountry(Context)}. If country cannot be determined, the default country is returned.
     *
     * @param context context through which to access resources.
     * @return The current device country if found, or <code>defaultCountry</code> if none found.
     */
    public static Country getDeviceCountry(@NonNull final Context context, final Country defaultCountry) {
        final Country country = getDeviceCountry(context);
        return null == country ? defaultCountry : country;
    }

    /**
     * Gets the country code corresponding to the device. The country detection is done in the following order:
     * <ol>
     * <li>If the device has telephony features and a SIM card is available, the country alpha2 is obtained via {@link TelephonyManager#getSimCountryIso()}</li>
     * <li>The country alpha2 is extracted from the device Locale via {@link Locale#getCountry()}. On Android-{@link android.os.Build.VERSION_CODES#N} and newer, all enabled device locales are checked for a match.</li>
     * </ol>
     *
     * @param context context through which to access resources.
     * @return The current device country if found, or <code>null</code> if none found.
     */
    public static Country getDeviceCountry(@NonNull final Context context) {
        try {
            if (Device.hasSystemFeature(context, PackageManager.FEATURE_TELEPHONY)) {
                final String a2 = ((TelephonyManager) Device.getSystemService(context, Context.TELEPHONY_SERVICE))
                        .getSimCountryIso();

                final Country country = null == a2 ? null : byAlpha2(a2.toUpperCase(Locale.ENGLISH));

                if (null != country)
                    return country;
            }

            return countryFromLocales(context);
        } catch (Exception e) {
            // don't want no trouble
            return null;
        }
    }

    private static Country getCountry(@NonNull final Locale locale) {
        return byAlpha2(locale.getCountry().toUpperCase(Locale.ENGLISH));
    }

    @TargetApi(N)
    static Country countryFromLocales(@NonNull final Context context) {
        final Configuration config = context.getResources().getConfiguration();

        if (ApiLevel.below(N))
            //noinspection deprecation
            return getCountry(config.locale);

        LocaleList locales = config.getLocales();

        final int len = locales.size();

        for (int i = 0; i < len; ++i) {
            final Country country = getCountry(locales.get(i));

            if (null != country) return country;
        }

        return null;
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
