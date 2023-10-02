package org.FarmerFroilen;

import jdk.jshell.execution.Util;

import java.util.List;
import java.util.Optional;

public class FarmHouse extends FarmReceptacle {

    private Utility.MaxableArrayList<Farmer> farmHands;

     public FarmHouse(){
         super(5, Optional.of(Person.class));
         this.farmHands = new Utility.MaxableArrayList<Farmer>(this.getMaxSize());
     }

    public Utility.MaxableArrayList<Farmer> getFarmHands() {
        return farmHands;
    }

    public void addFarmHand(Farmer farmer){
         farmHands.add(farmer);
    }

    public void addFarmHands(Utility.MaxableArrayList<Farmer> farmHands) {
        farmHands.addAll(farmHands);
    }

    public void removeFarmHand(Farmer farmer){
         farmHands.remove(farmer);
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "maxSize=" + getMaxSize() +
                ", storageType=" + getStorageType() +
                ", maxSize=" + getMaxSize() +
                '}';
    }
}
