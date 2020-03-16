package com.example.newstoday;

public class TourSpot {

    private String mSpotName;
    private int mSpotImage = -1;
    private String mSpotDescription;

    public TourSpot(String spotName, String spotDescription, int spotImage) {
        this.mSpotDescription = spotDescription;
        this.mSpotImage = spotImage;
        this.mSpotName = spotName;
    }

    public TourSpot(String spotName, String spotDescription) {
        this.mSpotDescription = spotDescription;
        this.mSpotName = spotName;
    }

    public String getSpotName() {
        return this.mSpotName;
    }

    public String getSpotDescription() {
        return this.mSpotDescription;
    }

    public int getSpotImage() {
        return this.mSpotImage;
    }

    public boolean hasImage() {
        return mSpotImage != -1;
    }
}
