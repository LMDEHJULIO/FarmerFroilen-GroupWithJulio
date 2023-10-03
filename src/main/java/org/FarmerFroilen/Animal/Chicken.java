package org.FarmerFroilen.Animal;

import org.FarmerFroilen.Crop.EdibleEgg;
import org.FarmerFroilen.Interface.Edible;
import org.FarmerFroilen.Interface.Produce;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animals")
// extends animal
public class Chicken extends Animal implements Produce {


    /* ***** IVARS ***** */

    // hasBeenFertilized - boolean as to whether chicken has/has not been fertilized
    private boolean hasBeenFertilized;

    /* ***** GETTERS | SETTERS ***** */

    /**
     * getFertilizationStatus
     * @return boolean - return hasBeenFertilized value of true or false
     */

    public boolean getFertilizationStatus() {
        return hasBeenFertilized;
    }

    /**
     * setHasBeenFertilized
     * @param hasBeenFertilized boolean representing new fertilization state
     * @return void
     */

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    /**
     * Nullary Constructor of Chicken
     * @params - null
     * @return Edible - edible object yielded by animal
     */

    public Chicken() {
        this.hasBeenFertilized = false;
    }


    /**
     * Multiparam Constructor of Chicken
     * @params String name, boolean hasBeenFertilized
     * @return Chicken - new chicken object
     */

    public Chicken(String name, boolean hasBeenFertilized) {
        super(name, "Buh-buh-ba-kaaaaaa");
        this.hasBeenFertilized = hasBeenFertilized;
    }



    /* ***** OVERRIDES ***** */

    /**
     * yield
     * @params - null
     * @return Edible - edible object yielded by animal
     */

    @Override
    public Edible yield() {
        if(!hasBeenFertilized){
            return new EdibleEgg();
        }

        return null;
    }

    /**
     * Override - toString
     * @return String - stringified version of Chicken
     */

    @Override
    public String toString() {
        return "Chicken{" +
                ", fertilizationStatus=" + getFertilizationStatus() +
                '}';
    }
}
