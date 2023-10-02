package org.FarmerFroilen;

import java.util.List;
import java.util.Optional;

public class ChickenCoop extends FarmReceptacle {
    private Utility.MaxableArrayList<Chicken> chicken;

    public ChickenCoop() {
        super(15, Optional.of(Chicken.class));
        this.chicken = new Utility.MaxableArrayList<>(this.getMaxSize());
    }

    public boolean addChicken(Chicken newChicken){
        return chicken.add(newChicken);
    }

    public void addChickens(List<Chicken> newChickens){
        chicken.addAll(newChickens);
    }

    public void removeChicken(Chicken removableChicken){
        chicken.remove(removableChicken);
    }

    public int getChickenCount(){
        return this.chicken.size();
    }


    public Utility.MaxableArrayList<Chicken> getChicken(){
        return chicken;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "maxSize=" + getMaxSize() +
                ", storageType=" + getStorageType() +
                ", maxSize=" + getMaxSize() +
                '}';
    }
}
