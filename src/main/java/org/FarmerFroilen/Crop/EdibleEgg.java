package org.FarmerFroilen.Crop;
import org.FarmerFroilen.Interface.Edible;

import java.time.LocalDate;


public class EdibleEgg implements Edible {
    private String description="I am packed with protein!";
    

    // W3 Date classes -  https://www.w3schools.com/java/java_date.asp

    private final LocalDate hatchDate;
    private final LocalDate expirationDate;

    /**
     *  Nullary EdibleEgg constructor - hatchDate set to current day - expiration date 30 days from the hatch date.
     */

    public EdibleEgg(){
        this.hatchDate = LocalDate.now();
        this.expirationDate = hatchDate.plusDays(30);
    }

    /**
     * Gets the hatch date of the EdibleEgg.
     * @return LocalDate the hatch date of the EdibleEgg
     */

    public LocalDate getHatchDate() {
        return hatchDate;
    }

    /**
     * Gets the expiration date of the EdibleEgg.
     * @return LocalDate the expiration date of the EdibleEgg
     */

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

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
    @Override
    public String toString(){
        return "I'm a delicious egg!\n"+description;
    }
}
