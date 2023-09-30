package org.FarmerFroilen;

public class Farm {
    Stable[] stables;
    ChickenCoop[] coops;
    FarmHouse farmHouse;

    public Farm(){
        this.stables = new Stable[3];
        this.coops = new ChickenCoop[4];
        this.farmHouse = new FarmHouse();
    }
}
