package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stable extends FarmReceptacle {
//    private ArrayList<Horse> horses;
    private Utility.MaxableArrayList<Horse> horses;
    // Pseudo-array max-size to support max capacity while still allowing ArrayList functionality
    private int maxHorses;

//    public void throwIfMaxedOut(){
//        if(this.horses.size() == maxHorses) {
//            throw new IndexOutOfBoundsException(maxHorses + " horses max. You have two options remove a horse (somehow) or wait for nature to take its course.");
//        }
//    }

    public Stable(){
        super(10, Horse.class);
        this.horses = new Utility.MaxableArrayList<Horse>(this.getMaxSize());
    }

    public boolean addHorse(Horse newHorse){
        return horses.add(newHorse);
    }

    public void addHorseAtIndex(int index, Horse horse){
        horses.add(index, horse);
    }

    public boolean addHorses(List<Horse> addHorseList){
        return horses.addAll(addHorseList);
    }

    public boolean removeHorse(Horse removedHorse){
        return horses.remove(removedHorse);
    }

    public Utility.MaxableArrayList<Horse> getHorses(){
        return this.horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "maxSize=" + getMaxSize() +
                ", storageType=" + getStorageType() +
                '}';
    }
}
