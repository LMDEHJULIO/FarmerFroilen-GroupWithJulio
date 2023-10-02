package org.FarmerFroilen;

public class Farm {
//    Stable[] stables;
//    ChickenCoop[] coops;
//    FarmHouse farmHouse;

    Utility.MaxableArrayList<Stable> stables;
    Utility.MaxableArrayList<ChickenCoop> coops;
    FarmHouse farmHouse;

    public Farm(){
        this.stables = new Utility.MaxableArrayList<>(3);
        this.coops = new Utility.MaxableArrayList<>(4);
        this.farmHouse = new FarmHouse();
    }
}
