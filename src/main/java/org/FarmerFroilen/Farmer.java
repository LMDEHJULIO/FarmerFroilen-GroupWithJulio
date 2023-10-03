package org.FarmerFroilen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "farmer")
@Data
//@AllArgsConstructor
//@NoArgsConstructor


public class Farmer extends Person implements Botanist, Rider{

    @Id
    private ObjectId id;

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop crop) {
        // implement something
        System.out.println("***Planting***");
    }



    @Override
    public void eat(Edible edible) {
        // implement Something
        System.out.println("***munching***");
    }

    @Override
    public void makeNoise() {
        System.out.println("Farming is life");
    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("***Mounting***" );
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("***Dismounting***");
    }
}
