package org.FarmerFroilen;
import org.FarmerFroilen.Crop.Crop;
import org.FarmerFroilen.Crop.CropRow;
import org.FarmerFroilen.Interface.FarmVehicle;
import org.FarmerFroilen.Vehicle.Aircraft;

import java.util.*;
public class CropDuster extends Aircraft implements FarmVehicle {
    public CropDuster(String name, String noise, boolean rideable) {
        super(name, noise, rideable);
    }
    // test error


/*
Iterate through the cropRow arrayList and check if each crop hasBeenFertilized, if not then fertilize the crop.
 */  public void fertilize(CropRow cropRow) {

       for(int i = 0; i < cropRow.returnCropRow().size(); i++){
            Crop currentCrop = cropRow.getCropAt(i);
            if(!currentCrop.getHasBeenFertilized()){
                currentCrop.setHasBeenFertilized(true);
            }
        }
    }

    @Override
    public void operate() {

    }

    @Override
    public String toString() {
        return "CropDuster{" +
                "name='" + getName() + '\'' +
                ", noise='" + getNoise() + '\'' +
                ", rideable=" + isRideable() +
                '}';
    }

    @Override
    public void makeNoise() {

    }
}
