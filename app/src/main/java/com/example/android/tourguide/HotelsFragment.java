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

public class HotelsFragment extends Fragment {

    public static final String ARG_PAGE = tourguide.getAppContext().getString(R.string.argname);

    public HotelsFragment() {
    }

    public static HotelsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        HotelsFragment fragment = new HotelsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of words
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.hotel1), getString(R.string.hotel1ad), R.drawable.hotel1));
        locations.add(new Location(getString(R.string.hotel2), getString(R.string.hotel2ad), R.drawable.hotel2));
        locations.add(new Location(getString(R.string.hotel3), getString(R.string.hotel3ad), R.drawable.hotel3));
        locations.add(new Location(getString(R.string.hotel4), getString(R.string.hotel4ad), R.drawable.hotel4));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
