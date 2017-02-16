package com.airg.android.countries.sample;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;

/**
 * Created by mahramf.
 */

class DetailedCountryView extends SimpleCountryView {

    @BindView(android.R.id.summary)
    TextView latinName;

    DetailedCountryView(View view) {
        super(view);
    }
}
