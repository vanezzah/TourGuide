package com.example.android.tourguide;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanessawanner on 18.07.18.
 */

public class ShopsFragment extends android.support.v4.app.Fragment {

    public ShopsFragment() {

    }

    public static final String ARG_PAGE = tourguide.getAppContext().getString(R.string.argname);

    public static ShopsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ShopsFragment fragment = new ShopsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.shop1), getString(R.string.shop1ad)));
        locations.add(new Location(getString(R.string.shop2), getString(R.string.shop2ad)));
        locations.add(new Location(getString(R.string.shop3), getString(R.string.shop3ad)));
        locations.add(new Location(getString(R.string.shop4), getString(R.string.shop4ad)));
        locations.add(new Location(getString(R.string.shop5), getString(R.string.shop5ad)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}