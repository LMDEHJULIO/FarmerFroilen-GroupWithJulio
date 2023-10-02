package org.FarmerFroilen;

import jdk.jshell.execution.Util;

import java.util.List;

public class Farm {
    private Utility.MaxableArrayList<Stable> stables;
    private Utility.MaxableArrayList<ChickenCoop> coops;
    private FarmHouse farmHouse;
    private Field field;
    private Utility.MaxableArrayList farmVehicles = new Utility.MaxableArrayList<FarmVehicle>(2);
    private CropDuster cropDuster;

    public Farm(){
        this.stables = new Utility.MaxableArrayList<Stable>(3);
        this.coops = new Utility.MaxableArrayList<ChickenCoop>(4);
        this.farmHouse = new FarmHouse();
        this.field = new Field();
    }

    public boolean addStable(Stable stable){
        return stables.add(stable);
    }

    public boolean addCoop(ChickenCoop coop){
        return coops.add(coop);
    }

    public Utility.MaxableArrayList<Stable> getStables(){
        return this.stables;
    }

    public Stable getStableAtIndex(int i){
        return this.stables.get(i);
    }

    public FarmHouse getFarmHouse(){
        return this.farmHouse;
    }

    public Utility.MaxableArrayList getChickenCoops(){
        return this.coops;
    }

    public void addStableAtIndex(int index, Stable newStable){
        stables.add(index, newStable);
    }

    public boolean addStables(List<Stable> newStables){
        return stables.addAll(newStables);
    }

    public boolean removeStable(Stable removeableStable){
        return stables.remove(removeableStable);
    }

    public void setFarmHouse(FarmHouse newFarmhouse){
        farmHouse = newFarmhouse;
    }

    public void buyCropDuster(CropDuster newDuster){
        this.cropDuster = newDuster;
    }

    public CropDuster getDuster(){
        return this.cropDuster;
    }

    public int getChickenCount(){
        int total = 0;

        for(ChickenCoop coop : coops){
            total += coop.getChickenCount();
        }

        return total;
    }

    public int getStableCount(){
        return this.stables.size();
    }

    public boolean addFarmVehicle(FarmVehicle newFarmVehicle){
        return this.farmVehicles.add(newFarmVehicle);
    }

    public void addFarmVehicleAt(int i, FarmVehicle newFarmVehicle){
        this.farmVehicles.add(i, newFarmVehicle);
    }

    public Utility.MaxableArrayList getFarmVehicles() {
        return farmVehicles;
    }

    public boolean removeFarmVehicle(FarmVehicle farmVehicle){
        return farmVehicles.remove(farmVehicle);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", coops=" + coops +
                ", farmHouse=" + farmHouse +
                '}';
    }
}
