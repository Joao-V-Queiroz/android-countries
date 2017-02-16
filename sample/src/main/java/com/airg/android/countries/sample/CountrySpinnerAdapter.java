package com.airg.android.countries.sample;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;

import com.airg.android.Country;
import com.airg.android.device.Device;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * Created by mahramf.
 */

final class CountrySpinnerAdapter extends BaseAdapter implements SpinnerAdapter {
    private final LayoutInflater inflater;
    private final Country[] countries;

    CountrySpinnerAdapter(final Context context) {
        inflater = LayoutInflater.from(context);

        final String cc = getDeviceCountryAlpha2Code(context);

        final Comparator<Country> comparator = TextUtils.isEmpty(cc)
                ? new CountryComparator()
                : new MyCountryFirstComparator(cc);

        countries = Country.values();
        Arrays.sort(countries, comparator);
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

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Country getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private View newView(final ViewGroup parent) {
        final View view = inflater.inflate(R.layout.item_country_dropdown, parent, false);
        view.setTag(new SimpleCountryView(view));
        return view;
    }

    private View getItemView(final int position, final View convertView, final ViewGroup parent, final boolean showName) {
        final View view = null == convertView ? newView(parent) : convertView;
        final Country country = getItem(position);
        final SimpleCountryView item = (SimpleCountryView) view.getTag();

        item.flag.setImageResource(country.flag);

        if (showName) {
            item.localName.setText(country.localizedName());
            item.localName.setVisibility(View.VISIBLE);
        } else {
            item.localName.setText(null);
            item.localName.setVisibility(View.GONE);
        }

        return view;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItemView(position, convertView, parent, false);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getItemView(position, convertView, parent, true);
    }

    private class MyCountryFirstComparator implements Comparator<Country> {

        private final String myCountry;

        MyCountryFirstComparator(final String cc) {
            myCountry = cc;
        }

        @Override
        public int compare(final Country left, final Country right) {
            if (left == right) return 0;
            if (myCountry.equals(left.name())) return -1;
            if (myCountry.equals(right.name())) return 1;
            return left.latinName.compareToIgnoreCase(right.latinName);
        }
    }

    private class CountryComparator implements Comparator<Country> {

        @Override
        public int compare(final Country left, final Country right) {
            return left.latinName.compareToIgnoreCase(right.latinName);
        }
    }
}
