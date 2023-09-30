package org.FarmerFroilen;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ChickenTest {

    @BeforeEach
    void setUp() {
//        Chicken nullaryChicken = new Chicken();
//        Chicken paramChicken = new Chicken("Bob", false);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isHasBeenFertilized() {
    }

    @Test
    void setHasBeenFertilized() {
    }

    @Test
    void yield() {
        Chicken chicken1 = new Chicken("Bob", false);

        Edible edibleEgg = chicken1.yield();

        assertTrue(edibleEgg instanceof EdibleEgg);
    }

    @Test

    void NullaryChicken(){
        Chicken chicken1 = new Chicken();

        assertEquals("Baby animal noises", chicken1.getNoise());
    }

    @Test
    void ParameterizedChicken(){
        Chicken chicken1 = new Chicken("Bob", false);

        assertEquals("Bob", chicken1.getName());
        assertEquals(false, chicken1.getFertilizationStatus());
    }
}