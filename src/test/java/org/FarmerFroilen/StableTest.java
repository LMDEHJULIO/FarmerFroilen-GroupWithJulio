package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StableTest {
    Stable stable1 = new Stable();
    @Test
    void getMaxSize() {
        assertTrue(stable1.getMaxSize() == 10);
    }

    @Test
    void getStorageType() {


    }

    @Test
    void addHorse() {
        stable1.addHorse(new Horse());

        assertTrue(stable1.getHorses().size() == 1);
    }

    @Test
    void addHorseAtIndex() {
        Horse horse1 = new Horse();

        stable1.addHorseAtIndex(0, horse1);

        assertTrue(stable1.getHorses().size() == 1);

//        assertTrue(stable1.getHorses().get(0) == horse1);
    }

    @Test
    void addHorses() {
    }

    @Test
    void removeHorse() {
    }
}