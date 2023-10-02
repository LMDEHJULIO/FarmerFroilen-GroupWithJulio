package org.FarmerFroilen;

import java.util.*;
public class CropRow {
    private static int totalRows;
    private int rowNumber;
    private ArrayList<Crop> crops;
    public CropRow(){
        crops=new ArrayList<>();
        rowNumber=totalRows;
        totalRows++;
    }

    /**
     * adds a crop at the end of the row
     * checks if crop isn't null so it is a valid add
     * if the rowNumber is 0, only cornstalks are allowed, if its 1 only tomato plants are allowed
     * @param crop takes a Crop object and adds it accordingly
     */
    public void addCrop(Crop crop){
        if(rowNumber==0) {
            if (crop != null) {
                crops.add(crop);
            } else if(crop==null){
                System.out.println("You're not adding anything!");
            }
            else{
                System.out.println("This crop is not a Corn Stalk");
            }
        }else if (rowNumber==1){
            if (crop != null) {
                crops.add(crop);
            } else if(crop==null){
                System.out.println("You're not adding anything!");
            }
            else{
                System.out.println("This crop is not a Tomato Plant");
            }
        }else{
            if (crop != null) {
                crops.add(crop);
            } else {
                System.out.println("You're not adding anything!");
            }
        }
    }

    /**
     *
     * @param x
     * @return returns the crop at x index
     */
    public Crop getCropAt(int x){
        if(x<crops.size()) {
            return crops.get(x);
        }else{
            System.out.println("Invalid Index");
            return null;
        }
    }

    /**
     *
     * @param x gives the index of the Crop wanted to be removed
     */
    public void removeCropAt(int x){
        if(x<crops.size()) {
            crops.remove(x);
        }else{
            System.out.println("Invalid Index");
        }
    }
    public ArrayList<Crop> returnCropRow(){
        return crops;
    }
    public void setCropRow(ArrayList<Crop> x){
        this.crops=x;
    }
    public int getRowNumber(){
        return rowNumber;
    }
    public String toString(){
        String s = "";
        for(Crop a : crops){
            s+=a.toString()+"\n";
        }
        return s;
    }
}
