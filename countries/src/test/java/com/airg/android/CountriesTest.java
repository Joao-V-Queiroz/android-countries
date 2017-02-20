package com.airg.android;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mahramf.
 */
public class CountriesTest {
    @Test
    public void byAlpha2() throws Exception {
        assertEquals(Country.CA, Countries.byAlpha2("CA"));
        assertEquals(Countries.byAlpha2("ca"), Countries.byAlpha2("CA"));
    }

    @Test
    public void byAlpha3() throws Exception {

    }

}