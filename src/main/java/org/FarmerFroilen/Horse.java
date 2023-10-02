package org.FarmerFroilen;


import org.springframework.data.mongodb.core.mapping.Document;

// extend animal / maybe implement Rideable
@Document(collection = "horse")

public class Horse extends Animal {
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
