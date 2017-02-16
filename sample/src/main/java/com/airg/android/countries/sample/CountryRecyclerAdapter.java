package com.airg.android.countries.sample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airg.android.Country;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by mahramf.
 */

final class CountryRecyclerAdapter extends RecyclerView.Adapter<DetailedCountryView> {
    private final LayoutInflater inflater;
    private final Country[] countries;

    CountryRecyclerAdapter(final Context context) {
        inflater = LayoutInflater.from(context);

        countries = Country.values();
        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(final Country left, final Country right) {
                return left.latinName.compareToIgnoreCase(right.latinName);
            }
        });
    }

    @Override
    public DetailedCountryView onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return new DetailedCountryView(inflater.inflate(R.layout.item_country_list, parent, false));
    }

    @Override
    public void onBindViewHolder(final DetailedCountryView holder, final int position) {
        final Country country = countries[position];

        holder.flag.setImageResource(country.flag);
        holder.localName.setText(country.localizedName());

        if (country.hasLocalizedName()) {
            holder.latinName.setText(country.latinName);
            holder.latinName.setVisibility(View.VISIBLE);
        } else {
            holder.latinName.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return countries.length;
    }
}
