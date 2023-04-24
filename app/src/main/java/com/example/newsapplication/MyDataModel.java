package com.example.newsapplication;

import android.media.Image;

public class MyDataModel {

    Image image;
    String name, preview;

    public MyDataModel(Image image, String name, String preview) {
        this.image = image;
        this.name = name;
        this.preview = preview;
    }

    public Image getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPreview() {
        return preview;
    }
}