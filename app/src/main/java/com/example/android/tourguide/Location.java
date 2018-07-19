package com.example.android.tourguide;

import android.location.Address;

/**
 * Created by vanessawanner on 18.07.18.
 */

public class Location {


    // String for the name of the location
    private String mLocationName;

    // String for the address of the location

    private String mLocationAddress;

    // Resource-ID for the image of the location

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    // constructor for the class ( Takes in two strings, which get their input through the variables above

    public Location(String Name, String Address) {
        mLocationName = Name;
        mLocationAddress = Address;
    }

    // Second constructor for the class (takes in two strings and an integer)

    public Location(String Name, String Address, int resourceID) {
        mLocationName = Name;
        mLocationAddress = Address;
        mImageResourceID = resourceID;

    }




    public String getLocationName() {
        return mLocationName;
    }



    public String getLocationAddress() {
        return mLocationAddress;
    }



    public int getImageResourceID() {
        return mImageResourceID;
    }



    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;



    }



}

