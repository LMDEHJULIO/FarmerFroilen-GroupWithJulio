package org.FarmerFroilen;

import java.util.List;

public class Farm {
    private Utility.MaxableArrayList<Stable> stables;
    private Utility.MaxableArrayList<ChickenCoop> coops;
    private FarmHouse farmHouse;

    public Farm(){
        this.stables = new Utility.MaxableArrayList<>(3);
        this.coops = new Utility.MaxableArrayList<>(4);
        this.farmHouse = new FarmHouse();
    }

    public boolean addStable(Stable stable){
        return stables.add(stable);
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
}
