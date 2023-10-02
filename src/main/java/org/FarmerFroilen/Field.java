package org.FarmerFroilen;

import java.util.List;

public class Field {
    Utility.MaxableArrayList<CropRow> cropRows = new Utility.MaxableArrayList<>(5);

    public Field(){
        this.cropRows.addAll(List.of(new CropRow(), new CropRow()));
        this.cropRows.get(0).addCrop(new Cornstalk());
        this.cropRows.get(1).addCrop(new TomatoPlant());
    }

    public int getRowCount() {
        return this.cropRows.size();
    }

    public void printRows(){
        System.out.println(cropRows);
    }
}
