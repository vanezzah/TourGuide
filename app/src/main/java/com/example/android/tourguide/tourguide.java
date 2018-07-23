package com.example.android.tourguide;

import android.app.Application;
import android.content.Context;

/**
 * Created by vanessawanner on 23.07.18.
 */

public class tourguide extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        tourguide.context = getApplicationContext();

        }

        public static Context getAppContext() {
        return tourguide.context;

        }
}
