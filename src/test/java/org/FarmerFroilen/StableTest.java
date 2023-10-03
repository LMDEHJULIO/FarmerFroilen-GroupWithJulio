package org.FarmerFroilen;

import org.FarmerFroilen.Animal.Horse;
import org.FarmerFroilen.Receptacle.Stable;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    void addHorses(){
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable1.addHorses(List.of(horse1, horse2));

        assertTrue(stable1.getHorses().size() == 2);

    }


    @Test
    void removeHorse() {
        Horse horse1 = new Horse();
        stable1.addHorse(horse1);
        assertTrue(stable1.getHorses().size() == 1);

        stable1.removeHorse(horse1);

        assertTrue(stable1.getHorses().size() == 0);

    }
}