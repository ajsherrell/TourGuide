package com.example.android.tourguide;

public class Tour {

    // attraction name
    private String mAttractionName;

    // description of attraction
    private String mDescription;

    // location of attraction
    private String mlocation;

    // image of attraction (resource ID)
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Tour object
     * @param attractionName is the name of the attraction/shop
     * @param description is the description of the attraction
     * @param location is the location of the attraction
     */
    public Tour(String attractionName, String description, String location) {
        mAttractionName = attractionName;
        mDescription = description;
        mlocation = location;
    }

    /**
     * Create a new Tour object
     * @param attractionName is the name of the attraction/shop
     * @param description is the description of the attraction
     * @param location is the location of the attraction
     * @param imageResourceId is the image of attraction
     */
    public Tour(int imageResourceId, String attractionName, String description, String location) {
        mImageResourceId = imageResourceId;
        mAttractionName = attractionName;
        mDescription = description;
        mlocation = location;
    }

    // get attraction name
    public String getAttractionName() {
        return mAttractionName;
    }

    // get description of attraction
    public String getDescription() {
        return mDescription;
    }

    // get location of attraction
    public String getLocation() {
        return mlocation;
    }

    // get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // returns whether or not there is an image for this attraction
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
