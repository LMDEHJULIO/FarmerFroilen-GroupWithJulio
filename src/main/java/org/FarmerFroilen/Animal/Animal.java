package org.FarmerFroilen.Animal;

import org.FarmerFroilen.Interface.Eater;
import org.FarmerFroilen.Interface.Edible;
import org.FarmerFroilen.Interface.Noisemaker;

public abstract class Animal implements Noisemaker, Eater {


    /*INSTANCE VARIABLES*/

    private String name;
    //Maybe make noise final - animal noises only evolve once every several million years
    private String noise;

    public Animal(String name) {
    }

   /*GETTERS | SETTERS*/

    /**
     * getName - getter for name of Animal
     * @return String name of Animal
     */

    public String getName() {
        return name;
    }

    /**
     * setName - setter for name of Animal
     * @return void
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getNoise - getter for noise of Animal
     * @return String noise of Animal
     */

    public String getNoise() {
        return noise;
    }

    /**
     * setNoise - setter for noise of Animal
     * @return void
     */

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
