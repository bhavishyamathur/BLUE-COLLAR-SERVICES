package com.example.neeraj.mark3.activities;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;

/**
 * Created by NEERAJ on 17-May-15.
 */
public class Parseuseractivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "mYAIHbvplhwmWwpmPu9zvrtGfcXvCJRXTAgordbD", "AdlhSRvi3C0fLdrNyA5ZMmntHvyOyM8ktW14zPVI");

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
