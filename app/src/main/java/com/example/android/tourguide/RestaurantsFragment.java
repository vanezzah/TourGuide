package com.example.android.tourguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanessawanner on 18.07.18.
 */

public class RestaurantsFragment extends Fragment {

    public static final String ARG_PAGE = tourguide.getAppContext().getString(R.string.argname);

    public RestaurantsFragment() {
    }

    public static RestaurantsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        RestaurantsFragment fragment = new RestaurantsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of location objects
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.rest1), getString(R.string.rest1ad)));
        locations.add(new Location(getString(R.string.rest2), getString(R.string.rest2ad)));
        locations.add(new Location(getString(R.string.rest3), getString(R.string.rest3ad)));
        locations.add(new Location(getString(R.string.restaurant4), getString(R.string.rest4ad)));
        locations.add(new Location(getString(R.string.rest5), getString(R.string.rest5ad)));

        //Create Adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Find the listvView object
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

