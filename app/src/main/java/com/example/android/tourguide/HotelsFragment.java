package com.example.android.tourguide;

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

    public static final String ARG_PAGE = "ARG_PAGE";


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
        locations.add(new Location("Four Seasons Rome", "Via Corona 1", R.drawable.hotel1));
        locations.add(new Location("Marriott Rome", "Via Grande 33", R.drawable.hotel2));
        locations.add(new Location("Iberostar Rome", "Via de Italia 4", R.drawable.hotel3));
        locations.add(new Location("Holiday Inn Rome", "Colosseo 1", R.drawable.hotel4));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}


