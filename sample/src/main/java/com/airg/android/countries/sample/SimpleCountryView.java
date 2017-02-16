package com.airg.android.countries.sample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mahramf.
 */

class SimpleCountryView extends RecyclerView.ViewHolder {
    @BindView(android.R.id.icon)
    ImageView flag;

    @BindView(android.R.id.title)
    TextView localName;

    SimpleCountryView(final View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
