package org.FarmerFroilen;

import java.time.LocalDate;
import java.util.Date;

public class EdibleEgg implements Edible{

    // W3 Date classes -  https://www.w3schools.com/java/java_date.asp

    private LocalDate hatchDate;
    private LocalDate expirationDate;

    public EdibleEgg(){
        this.hatchDate = LocalDate.now();
        this.expirationDate = hatchDate.plusDays(30);
    }


}
