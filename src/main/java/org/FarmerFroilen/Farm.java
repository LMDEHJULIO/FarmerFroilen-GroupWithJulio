package org.FarmerFroilen;

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



    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", coops=" + coops +
                ", farmHouse=" + farmHouse +
                '}';
    }
}
