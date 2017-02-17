package com.airg.android.countries;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;

import com.airg.android.Country;
import com.airg.android.device.Device;

import java.util.Comparator;
import java.util.Locale;

/**
 * A few useful Comparator implementations
 *
 * @author Mahram Z. Foadi
 */

public final class Comparators {
    private Comparators() {
    }// no instances.

    /**
     * Compare countries by their latin names, but the local country is always first.
     */
    public static class MyCountryFirstComparator implements Comparator<Country> {
        private final String localAlpha2;
        private final Comparator<Country> backupComparator;

        /**
         * Constructor. Uses a {@link LatinNameComparator} as backup if no local country could be determined or neither country is the local country.
         *
         * @param context to determine the device country.
         */
        public MyCountryFirstComparator(final Context context) {
            this(context, null);
        }

        /**
         * Constructor. Provide a backup {@link Comparator} if no local country could be determined or neither country is the local country.
         *
         * @param context to determine the device country.
         */
        public MyCountryFirstComparator(final Context context, final Comparator<Country> backup) {
            localAlpha2 = getDeviceCountryAlpha2Code(context);
            backupComparator = null == backup ? new LatinNameComparator() : backup;
        }

        /**
         * See {@link Comparator#compare(Object, Object)}
         */
        @Override
        public int compare(final Country left, final Country right) {
            if (left == right) return 0;

            if (null != localAlpha2) {
                if (localAlpha2.equals(left.name())) return -1;
                if (localAlpha2.equals(right.name())) return 1;
            }

            return backupComparator.compare(left, right);
        }
    }

    /**
     * Compare countries by their latin names
     */
    public static class LatinNameComparator implements Comparator<Country> {
        /**
         * See {@link Comparator#compare(Object, Object)}
         */
        @Override
        public int compare(Country left, Country right) {
            return left.latinName.compareToIgnoreCase(right.latinName);
        }
    }

    /**
     * Compare countries by their alpha 2 iso codes
     */
    public static class Alpha2Comparator implements Comparator<Country> {
        /**
         * See {@link Comparator#compare(Object, Object)}
         */
        @Override
        public int compare(Country left, Country right) {
            return left.alpha2.compareToIgnoreCase(right.alpha2);
        }
    }

    /**
     * Compare countries by their alpha 3 iso codes
     */
    public static class Alpha3Comparator implements Comparator<Country> {
        /**
         * See {@link Comparator#compare(Object, Object)}
         */
        @Override
        public int compare(Country left, Country right) {
            return left.alpha3.compareToIgnoreCase(right.alpha3);
        }
    }

    private static String getDeviceCountryAlpha2Code(final Context context) {
        try {
            if (Device.hasSystemFeature(context, PackageManager.FEATURE_TELEPHONY)) {
                return ((TelephonyManager) Device.getSystemService(context, Context.TELEPHONY_SERVICE))
                        .getSimCountryIso().toUpperCase(Locale.ENGLISH);
            } else {
                return Device.getLocale(context).getCountry().toUpperCase(Locale.ENGLISH);
            }
        } catch (Exception e) {
            // don't want no trouble
            return null;
        }
    }

}
