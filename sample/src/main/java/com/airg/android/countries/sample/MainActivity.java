package com.airg.android.countries.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Spinner;
import android.widget.TextView;

import com.airg.android.Country;
import com.airg.android.logging.Logger;
import com.airg.android.logging.TaggedLogger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class MainActivity extends AppCompatActivity {
    private final TaggedLogger LOG = Logger.tag("Countries");

    @BindView(R.id.latin_name)
    TextView latinName;

    @BindView(R.id.local_name)
    TextView localName;

    @BindView(R.id.alpha2)
    TextView alpha2;

    @BindView(R.id.alpha3)
    TextView alpha3;

    @BindView(R.id.intl_prefix)
    TextView internationalPrefix;

    @BindView(R.id.spinner)
    Spinner countrySpinner;

    @BindView(R.id.list)
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final CountrySpinnerAdapter spinnerAdapter = new CountrySpinnerAdapter(this);
        countrySpinner.setAdapter(spinnerAdapter);

        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        list.setAdapter(new CountryRecyclerAdapter(this));
    }

    @OnItemSelected(R.id.spinner)
    void onCountrySelected(final int position) {
        final Country country = (Country) countrySpinner.getSelectedItem();
        LOG.d("Selected: %s (%d)", country, position);

        latinName.setText(country.latinName);
        localName.setText(country.localizedName());
        alpha2.setText(country.alpha2);
        alpha3.setText(country.alpha3);
        internationalPrefix.setText(String.valueOf(country.code));
    }


}
