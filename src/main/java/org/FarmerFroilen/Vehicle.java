package org.FarmerFroilen;

public abstract class Vehicle {
    //instance variable for data type String called name
    private String name;

    //default constructor

    public Vehicle(String name) {
        this.name = name;
    }

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
