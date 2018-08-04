package com.launchcode.routebuilder.Model;

import javax.validation.constraints.NotNull;

public class Location {

    @NotNull
    private String address;

    private int locationId;
    private static int nextLocationId = 1;


    //constructors
    public Location(String address) {
        this();
        this.address = address;
    }
    //constructor that gives each address an ID
    public Location() {
        locationId = nextLocationId;
        nextLocationId++;
    }

    //getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
