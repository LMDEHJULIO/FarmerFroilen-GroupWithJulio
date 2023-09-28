package org.FarmerFroilen;

public class EdibleEgg implements Edible{
    private String description="I am packed with protein!";

    /**
     * No constructor for the EdibleEgg class
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
    public String toString(){
        return "I'm a delicious egg!\n"+description;
    }
}
