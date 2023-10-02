package org.FarmerFroilen;


// extend animal / maybe implement Rideable

public class Horse extends Animal implements Rideable {
    // ivars

    // getters/setters

    //constructors - nullary and multiparam

    public Horse(){
        this.setNoise("Neiigghhhhh");
    }

    public Horse(String name) {
        super(name, "Neiigggghhhhhh");
    }


    // @overide make noise / eat / maybe toString


}
