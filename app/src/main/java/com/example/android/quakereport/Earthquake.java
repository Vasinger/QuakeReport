package com.example.android.quakereport;

/**
 * Created by Mateusz Ławniczak on 19.03.2017.
 */

public class Earthquake {

    private double mMag;
    private String mLocation;
    private long mTime;
    private String mUrl;

    public Earthquake (double mag, String location, long time, String url) {
        mMag = mag;
        mLocation = location;
        mTime = time;
        mUrl = url;
    }

    public double getMag() {
        return mMag;
    }

    public String getTitle() {
        return mLocation;
    }

    public long getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
