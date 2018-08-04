package com.launchcode.routebuilder.Model;

import java.util.ArrayList;

public class locationData {

    static ArrayList<String> locationList = new ArrayList<>();

    //adds address
    public static void add(String address) {
        locationList.add(address);
    }

    //gets all locations added
    public static ArrayList<String> getAll() {
        return locationList;
    }

}
