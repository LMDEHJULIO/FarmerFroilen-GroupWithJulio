package org.FarmerFroilen;

public class Pilot extends Person{

    public Pilot(String name) {
        super(name);
    }
    public void Flies(Aircraft aircraft){

        System.out.println("I can't fly yet");
    }

    @Override
    public void eat(Edible edible) {
       if(edible == null){
           System.out.println("I can't eat air -pilot");
       }

        System.out.println("EATING...");
    }

    @Override
    public void makeNoise() {
        System.out.println("I can fly");
    }
}
