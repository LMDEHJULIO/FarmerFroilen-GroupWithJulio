package org.FarmerFroilen;


public abstract class Crop implements Produce{
    private boolean hasBeenHarvested=false;
    private boolean hasBeenFertilized=false;

    /**
     * Crop will accept a parameter if it hasn't been fertilized
     * Crop when planted will always have hasBeenHarvested as false since it hasn't been harvested
     * @param hasBeenFertilized will start false if it doesn't receive any parameters, or it accepts if it has been fertilized
     */

    public Crop(){}
    public Crop(boolean hasBeenFertilized){
        this.hasBeenFertilized=hasBeenFertilized;
    }

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

}
