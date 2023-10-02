package org.FarmerFroilen;

import java.util.*;
public class CropRow {
    private ArrayList<Crop> crops;
    public CropRow(){
        crops=new ArrayList<>();
    }

    /**
     * adds a crop at the end of the row
     * checks if crop isn't null so it is a valid add
     * @param crop
     */
    public void addCrop(Crop crop){
        if(crop!=null) {
            crops.add(crop);
        }else{
            System.out.println("There's no crop here!");
        }
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
    public ArrayList<Crop> returnCropRow(){
        return crops;
    }
    public void setCropRow(ArrayList<Crop> x){
        this.crops=x;
    }
}
