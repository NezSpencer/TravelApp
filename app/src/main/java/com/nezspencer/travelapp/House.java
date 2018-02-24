package com.nezspencer.travelapp;

/**
 * Created by nezspencer on 10/30/17.
 */

public class House {

    private String name;
    private int image;

    public House(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
