package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    Farm farm1 = new Farm();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();


    @Test
    void addStable() {
        farm1.addStable(new Stable());

        assertTrue(farm1.getStables().size() == 1);
    }

    @Test
    void addStableAtIndex() {
        farm1.addStable(stable1);
        farm1.addStableAtIndex(1, stable2);

        assertTrue(farm1.getStables().size() == 2);
        assertTrue(farm1.getStableAtIndex(1) == stable2);
    }

    @Test
    void addStables() {
        farm1.addStables(List.of(stable1, stable2));

        assertTrue(farm1.getStables().size() == 2);
    }

    @Test
    void removeStable() {

        farm1.addStables(List.of(stable1, stable2));

        farm1.removeStable(stable2);

        assertTrue(farm1.getStables().size() == 1);
    }

    @Test
    void setFarmHouse() {
        FarmHouse newFarmhouse = new FarmHouse("Froilen's crib");

        System.out.println(farm1.getFarmHouse());

        farm1.setFarmHouse(newFarmhouse);

        System.out.println(farm1.getFarmHouse());

        assertTrue(farm1.getFarmHouse() == newFarmhouse);
    }


}