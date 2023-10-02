package org.FarmerFroilen;

import java.util.Optional;

public class ChickenCoop extends FarmReceptacle {
    private Utility.MaxableArrayList<Chicken> chicken;

    public ChickenCoop() {
        super(15, Optional.of(Chicken.class));
        this.chicken = new Utility.MaxableArrayList<>(this.maxSize);
    }

    public boolean addChicken(Chicken newChicken){
        return chicken.add(newChicken);
    }

    public Utility.MaxableArrayList<Chicken> getChicken(){
        return chicken;
    }
}
