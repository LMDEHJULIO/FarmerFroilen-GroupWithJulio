package org.FarmerFroilen;

public class Tractor {
    /**
     * Tractor should have a name which is a String
     * Tractor will harvest a crop object
     *
     * String name
     * @method1- harvest()
     * @param- crop
     * @return- VOID
     */


    //instance variable for type String called name
    private String name;

    //default constructor
    public Tractor(String name) {
        this.name = name;
    }

    //getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    //harvest crop method
    public void harvest(Crop crop){
    }

}
