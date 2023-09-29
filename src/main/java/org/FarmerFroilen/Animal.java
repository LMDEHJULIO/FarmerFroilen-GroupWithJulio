package org.FarmerFroilen;

// Animal should implement NoiseMaker and Eater
//
public abstract class Animal implements Noisemaker, Eater{


    // Instance Variables

    private String name;
    //Maybe make noise final - animal noises only evolve once every several million years
    private String noise;

    public Animal(String name) {
    }

    // Getters/Setters for ivars

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    /**
     * Nullary Animal Constructor
     * @param null
     * @return - Animal w default noise
     */

    public Animal(){
        this.noise = "Baby animal noises";
    }

    /**
     * Parameterized Animal Constructor
     * @param String name
     * @return - Animal w default name
     */

    public Animal(String name, String noise){
        this.name = name;
        this.noise = noise;
    }


    /**
     * toString
     * @param null
     * @return - Stringified Animal Object
     */

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }

    /**
     * makeNoise
     * @returns void - Print statement of noise
     */

    @Override
    public void makeNoise() {
        System.out.println(this.noise);
    }

    /**
     * eat
     * @param Edible - edible object (EarCorn, Tomato)
     * @returns void - Print statement of eat
     */

    @Override
    public void eat(Edible edible) {
        System.out.println(name + " is eating " + edible);
    }
}
