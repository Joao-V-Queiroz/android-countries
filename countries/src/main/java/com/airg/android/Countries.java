package com.airg.android;

import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * Created by mahramf.
 */

public final class Countries {
    private Countries() {
    } // no instance for you

    private static final int CACHE_SIZE = 50;

    private static LruCache<String,Country> alpha3Lookup = new LruCache<>(CACHE_SIZE);
    private static LruCache<Integer, Country> prefixLookup = new LruCache<>(CACHE_SIZE);

    /**
     * Find a country by it's alpha2 iso code
     * @param alpha2 alpha 2 code. Must not be <code>null</code>.
     * @return The {@link Country} if found, or <code>null</code> if not found.
     */
    public static Country byAlpha2(@NonNull final String alpha2) {
        try {
            return Country.valueOf(alpha2.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
