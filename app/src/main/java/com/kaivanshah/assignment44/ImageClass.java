package com.kaivanshah.assignment44;

/**
 * Created by kaivanrasiklal.s on 12-02-2017.
 */

public class ImageClass {

    private String name;
    private int imageURL;

    public ImageClass(String Name,int ImageURL)
    {
        name = Name;
        imageURL =  ImageURL;
    }


    public String getName() {
        return name;
    }

    public void setName( String Name) {
        name = Name;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL( int ImageURL) {
        imageURL = ImageURL;
    }

}
