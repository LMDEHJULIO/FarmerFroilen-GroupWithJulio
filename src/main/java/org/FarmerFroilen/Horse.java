package org.FarmerFroilen;


// extend animal / maybe implement Rideable

public class Horse extends Animal {



    // ivars
    String noise;

    // getters/setters

    //constructors - nullary and multiparam

    public Horse() {
        String noise = "Nee-saw";
    }

    public Horse(String name) {
        super(name);
    }


    // @overide make noise / eat / maybe toString


}
