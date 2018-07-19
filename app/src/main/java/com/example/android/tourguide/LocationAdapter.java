package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanessawanner on 18.07.18.
 */

public class LocationAdapter extends ArrayAdapter<Location>{



    public LocationAdapter(Activity context, List<Location> Locations) {
        super(context, 0, Locations);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }


        Location currentLocation = getItem(position);


        TextView NameTextView = (TextView) listItemView.findViewById(R.id.TextView1);

        NameTextView.setText(currentLocation.getLocationName());


        TextView AddressTextView = (TextView)  listItemView.findViewById(R.id.TextView2);


        AddressTextView.setText(currentLocation.getLocationAddress());

        ImageView drawableView = (ImageView) listItemView.findViewById(R.id.picture);

        if(currentLocation.hasImage()) {
            drawableView.setImageResource(currentLocation.getImageResourceID());

        }
        else {
            drawableView.setVisibility(View.GONE);

        }


        return listItemView;

    }
}
