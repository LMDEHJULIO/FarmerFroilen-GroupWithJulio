package org.FarmerFroilen;

import jdk.jshell.execution.Util;

import java.util.List;
import java.util.Optional;

public class FarmHouse extends FarmReceptacle {

    private Utility.MaxableArrayList<Person> farmHands;
    private String houseName;

     public FarmHouse(){
         super(5, Person.class);
         this.farmHands = new Utility.MaxableArrayList<Person>(this.getMaxSize());
         this.setStorageType(Person.class);
     }

     public FarmHouse(String houseName){
         super(5, Person.class);
         this.houseName = houseName;
     }

     public String getName(){
         return houseName;
     }

    public Utility.MaxableArrayList<Person> getFarmHands() {
        return farmHands;
    }

    public void addFarmHand(Person farmer){
         farmHands.add(farmer);
    }

    public void addFarmHands(Utility.MaxableArrayList<Person> farmHands) {
        farmHands.addAll(farmHands);
    }

    public void removeFarmHand(Person farmer){
         farmHands.remove(farmer);
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "maxSize=" + getMaxSize() +
                ", storageType=" + getStorageType() +
                ", maxSize=" + getMaxSize() +
                '}' + getName();
    }
}
