package org.FarmerFroilen;

public class Farmer extends Person implements Botanist, Rider{
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop crop) {
      if(crop == null){
        System.out.println("Cant plant");
    }
        System.out.println("***Planting***");
    }



    @Override
    public void eat(Edible edible) {
        // implement Something
        if(edible == null){
            System.out.println("I can't eat air -pilot");
        }
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
