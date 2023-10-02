package org.FarmerFroilen;

public class Tractor extends Vehicle implements FarmVehicle{
    /**
     * Tractor should have a name which is a String
     * Tractor will harvest a crop object
     * Tractor will implement FarmVehicle interface
     *
     * String name
     * @method1- harvest()
     * @param- crop
     * @return- VOID
     */


    //instance variable for type String called name
    private String name;
    private String noise;
    private boolean rideable;

    //default constructor for tractor

    public Tractor(String name, String noise, boolean rideable) {
        super(name, noise, rideable);
    }

    //getter method for tractor name
    @Override
    public String getName() {
        return name;
    }

    //setter method for tractor name
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public boolean isRideable() {
        return rideable;
    }

    @Override
    public void setRideable(boolean rideable) {
        this.rideable = rideable;
    }

    //harvest crop method
    public void harvest(Crop crop){
        /*
        Have to check if Crop is harvestable to be able to harvest
        Crop is only harvestable if hasBeenHarvested = false and if hasBeenFertilized = false
        Check for hasBeenFertilized value
        hasBeenHarvested should be initialized to false at first
        Once crop is harvested, change hasBeenHarvested value to true
         */

        //initializes hasBeenHarvested to false
        boolean hasBeenHarvested = crop.getHasBeenHarvested();
        //loop to check fertilized value of crop and if it has been harvested or not yet.
        if ((crop.getHasBeenFertilized() == false) && hasBeenHarvested == true) {
            //changes harvested value to true to signify that the crop was harvested
            hasBeenHarvested = true;
        } else {
            System.out.println("This crop cannot be harvested");
        }

    }

    @Override
    public String toString(){
        return "Tractor{" +
                " Name:'" + name + '\'' +
                ", Noise:'" + noise + '\'' +
                ", Rideable='" + rideable + '\'' +
                '}';
    }

    //override for FarmVehicle operate() method
    @Override
    public void operate() {
        System.out.println("Tractors gonna tractor");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.noise);
    }
}
