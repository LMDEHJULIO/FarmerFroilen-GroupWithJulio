package org.FarmerFroilen;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animals")
// extends animal
public class Chicken extends Animal implements Produce {


    // ivars like hasBeenFertilized

    private boolean hasBeenFertilized;

    // getters/setters

    public boolean getFertilizationStatus() {
        return hasBeenFertilized;
    }

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


    // @overide yield / make noise / eat / maybe toString

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

    @Override
    public String toString() {
        return "Chicken{" +
                ", fertilizationStatus=" + getFertilizationStatus() +
//                ", yield=" + yield() +
                '}';
    }
}
