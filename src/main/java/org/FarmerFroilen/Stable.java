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
        super(10, Optional.of(Horse.class));
        this.horses = new Utility.MaxableArrayList<Horse>(15);
    }

    public boolean addHorse(Horse newHorse){

        return horses.add(newHorse);
//        try{
//            throwIfMaxedOut();
//            horses.add(newHorse);
//            return true;
//        } catch (Exception e){
//            e.printStackTrace();
//            return false;
//        }
    }

}
