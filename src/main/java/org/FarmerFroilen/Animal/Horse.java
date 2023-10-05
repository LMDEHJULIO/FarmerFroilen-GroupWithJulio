package org.FarmerFroilen.Animal;


import org.FarmerFroilen.Animal.Animal;
import org.FarmerFroilen.Interface.Rideable;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "horse")

public class Horse extends Animal implements Rideable {

    public Horse(){
        this.setNoise("Neiigghhhhh");
    }

    public Horse(String name) {
        super(name, "Neiigggghhhhhh");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + getName() + '\'' +
                ", noise='" + getNoise() + '\'' +
                '}';
    }
}

