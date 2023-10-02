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
     * @param crop
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
    public int getRowNumber(){
        return rowNumber;
    }
}
