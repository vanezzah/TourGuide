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

public class MonumentsFragment extends android.support.v4.app.Fragment{

    public static final String ARG_PAGE = "ARG_PAGE";


    public MonumentsFragment() {

    }


    public static MonumentsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MonumentsFragment fragment = new MonumentsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of locations
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Colosseo", "Villa Balestra 2", R.drawable.colosseo));
        locations.add(new Location("Tempio del Divo Claudio", "Via francesco 60", R.drawable.tempiodeldivoclaudio));
        locations.add(new Location("Sistine Chapel", "Via Luigi 1", R.drawable.sixtinischekapelle));
        locations.add(new Location("Old Town", "Via Mario 2", R.drawable.old_town));



        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }

}


