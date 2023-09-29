package org.FarmerFroilen;

/**
 * Just a produce that can be grouped with the Edible class
 */
public class EarCorn implements Edible{
    private String description="I'm yummy!";

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
        return "I'm a delicious ear of corn!\n"+description;
    }
}
