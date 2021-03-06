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

public class MonumentsFragment extends android.support.v4.app.Fragment {

    public static final String ARG_PAGE = tourguide.getAppContext().getString(R.string.argname);

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
        locations.add(new Location(getString(R.string.mon1), getString(R.string.mon1ad), R.drawable.colosseo));
        locations.add(new Location(getString(R.string.mon2), getString(R.string.mon2ad), R.drawable.tempiodeldivoclaudio));
        locations.add(new Location(getString(R.string.mon3), getString(R.string.mon3ad), R.drawable.sixtinischekapelle));
        locations.add(new Location(getString(R.string.mon4), getString(R.string.mon4ad), R.drawable.old_town));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

