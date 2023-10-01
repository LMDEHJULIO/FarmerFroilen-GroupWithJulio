package org.FarmerFroilen;

import java.util.*;
public class CropRow {
    private ArrayList<Crop> crops;
    public CropRow(){
        crops=new ArrayList<>();
    }
    private void addCrop(Crop crop){
        crops.add(crop);
    }
    private Crop getCropAt(int x){
        return crops.get(x);
    }
    private void removeCropAt(int x){
        crops.remove(x);
    }
}
