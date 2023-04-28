package com.example.newsapplication;

import android.graphics.Bitmap;

public class MyDataModel {

    int imageID;
    String name, preview;

    public MyDataModel(int imageID, String name, String preview) {
        this.imageID = imageID;
        this.name = name;
        this.preview = preview;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getPreview() {
        return preview;
    }
}