package org.FarmerFroilen;

public abstract class Vehicle implements Noisemaker, Rideable {

    //instance variable for data type String called name
    private String name;

    private String noise;

    private boolean rideable;

    //default constructor for name/noise string
    public Vehicle(String name, String noise, boolean rideable) {
        this.name = name;
        this.noise = noise;
        this.rideable = rideable;
    }

    //getter method for name of vehicle
    public String getName() {
        return name;
    }

    //setter method for name of vehicle
    public void setName(String name) {
        this.name = name;
    }

    //getter method for noise of vehicle
    public String getNoise() {
        return noise;
    }

    //setter method for noise of vehicle
    public void setNoise(String noise) {
        this.noise = noise;
    }

    //setter method for rideability of a vehicle
    public void setRideable(boolean rideable) {
        this.rideable = rideable;
    }

    public boolean getIsRideable() {
        boolean canIRideIt = this.rideable;
        if (canIRideIt) {
            System.out.println("You can ride this vehicle");
        } else {
            System.out.println("You cannot ride this vehicle");
        }
        return canIRideIt;
    }

    //override Java Object method to return vehicle name and noise values
    @Override
    public String toString() {
        return "Vehicle{" +
                "Name:'" + name + '\'' +
                ", Noise:'" + noise + '\'' +
                ", Rideable='" + rideable + '\'' +
                '}';
    }

    //override NoiseMaker method to return value inside vehicle
    @Override
    public void makeNoise() {
        System.out.println(this.noise);
    }

}
