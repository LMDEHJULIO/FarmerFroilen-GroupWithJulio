package org.FarmerFroilen;

public abstract class Aircraft extends Vehicle {
    public Aircraft(String name, String noise, boolean rideable) {
        super(name, noise, rideable);
    }
    // added this bc of a test error in FarmerTest



    public void fly(){

    }


}
