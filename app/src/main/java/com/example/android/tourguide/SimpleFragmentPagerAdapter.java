package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by vanessawanner on 18.07.18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    // Set position of fragments

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();}
        else if (position == 1) {
            return new HotelsFragment();}
        else if (position == 2) {
            return new MonumentsFragment();}
        else {
            return new ShopsFragment(); }


    }


    // Set Titles for Tabs

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return context.getString(R.string.category_restaurants);}
        else if (position == 1) {
            return context.getString(R.string.category_hotels);}
        else if (position == 2) {
            return context.getString(R.string.category_monuments);}
        else {
            return context.getString(R.string.category_shops); }

    }
}