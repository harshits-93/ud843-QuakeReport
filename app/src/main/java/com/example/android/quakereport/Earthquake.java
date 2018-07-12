package com.example.android.quakereport;

/**
 * Created by Harshit on 01-02-2018.
 */

public class Earthquake {
    private Double magnitude;
    private String place;
    private Long mTimeInMilliSeconds;
    private String mURL;

    public Earthquake(Double magnitude, String place, Long mTimeInMilliSeconds, String mURL) {
        this.magnitude = magnitude;
        this.place = place;
        this.mTimeInMilliSeconds = mTimeInMilliSeconds;
        this.mURL = mURL;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public Long getmTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getmURL() {
        return mURL;
    }
}
