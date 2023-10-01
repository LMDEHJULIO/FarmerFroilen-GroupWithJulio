package org.FarmerFroilen;

import java.util.*;
public class CropRow {
    private ArrayList<Crop> crops;
    public CropRow(){
        crops=new ArrayList<>();
    }

    /**
     * adds a crop at the end of the row
     * @param crop
     */
    public void addCrop(Crop crop){
        crops.add(crop);
    }

    /**
     *
     * @param x
     * @return returns the crop at x index
     */
    public Crop getCropAt(int x){
        return crops.get(x);
    }

    /**
     *
     * @param x gives the index of the Crop wanted to be removed
     */
    public void removeCropAt(int x){
        crops.remove(x);
    }
}
