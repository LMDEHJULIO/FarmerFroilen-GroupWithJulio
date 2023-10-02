package org.FarmerFroilen;

public class Tomato extends Crop {
    private String description="I'm juicy!";

    /**
     * There isn't really a need to have a constructor other than this default one in place
     *
     */

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return just says how delicious it is
     */
    @Override
    public String toString(){
        return "I'm a delicious tomato!\n"+description;
    }

    @Override
    public Edible yield() {
        return null;
    }
}
