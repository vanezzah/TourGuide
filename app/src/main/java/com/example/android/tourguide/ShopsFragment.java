package com.example.android.tourguide;

import android.app.Fragment;
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
    public static final String ARG_PAGE = "ARG_PAGE";


    public ShopsFragment() {
    }


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
        locations.add(new Location("Prada", "Via Flavia 130"));
        locations.add(new Location("Louis Vuitton", "Via Palestro 5"));
        locations.add(new Location("Women's Secret", "Via Boncompagni 2"));
        locations.add(new Location("Zara", "Via Piemonte 90"));
        locations.add(new Location("Bershka", "Via il Latte"));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}


