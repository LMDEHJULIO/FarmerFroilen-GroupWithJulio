package org.FarmerFroilen;

import java.util.List;

public class Field {
    Utility.MaxableArrayList<CropRow> cropRows = new Utility.MaxableArrayList<>(5);

    public Field(){
        this.cropRows.addAll(List.of(new CropRow(), new CropRow()));
        this.cropRows.get(0).addCrop(new Cornstalk());
        this.cropRows.get(1).addCrop(new TomatoPlant());
    }

    public Utility.MaxableArrayList<CropRow> getCropRows(){
        return cropRows;
    }

    public int getRowCount() {
        return this.cropRows.size();
    }

    public CropRow getLastRow(){return this.cropRows.get(cropRows.size() - 1);}

    public void printRows(){
        System.out.println(cropRows);
    }

    @Override
    public String toString() {
        return "Field{" +
                "cropRows=" + cropRows +
                ", rowCount=" + getRowCount() +
                '}';
    }
}
