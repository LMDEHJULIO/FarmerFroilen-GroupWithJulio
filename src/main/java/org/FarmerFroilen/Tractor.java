package org.FarmerFroilen;

public class Tractor extends Vehicle implements FarmVehicle{
    /**
     * Tractor should have a name which is a String
     * Tractor will have noise and rideable from vehicle class
     * Tractor will harvest a crop object
     * Tractor will implement FarmVehicle interface
     */

    /**
     * instance variable for type String called name, noise, and boolean rideable
     */
    private String name;
    private String noise;
    private boolean rideable;

    /**
     * Default constructor for tractor
     * @param name
     * @param noise
     * @param rideable
     */
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

    //getter for tractor noise
    @Override
    public String getNoise() {
        return noise;
    }

    //setter for tractor noise
    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }

    //getter for rideable boolean
    @Override
    public boolean getIsRideable() {
        return rideable;
    }

    //setter for rideable boolean
    @Override
    public void setRideable(boolean rideable) {
        this.rideable = rideable;
    }

    /**
     * Harvest method sets hasBeenHarvested value to true/false
     * @param crop
     */
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
        if ((crop.getHasBeenFertilized() == false) && hasBeenHarvested == false) {
            //changes harvested value to true to signify that the crop was harvested
            System.out.println("You have successfully harvested your crop!");
            hasBeenHarvested = true;
            crop.setHasBeenHarvested(hasBeenHarvested);
        } else {
            System.out.println("This crop cannot be harvested");
        }

    }

    /**
     * override tostring() method to print out descriptor of vehicle
     * @return string value ivars for Tractor class
     */
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

    //override for NoiseMaker makeNoise() method
    @Override
    public void makeNoise() {
        System.out.println(this.noise);
    }
}
