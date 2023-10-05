package org.FarmerFroilen;

import org.FarmerFroilen.Person.Farmer;
import org.FarmerFroilen.Person.Person;
import org.FarmerFroilen.Receptacle.FarmHouse;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FarmHouseTest {
    static FarmHouse farmHouse1 = new FarmHouse();
    static Farmer farmer1 = new Farmer("Froiland");

    @Test
    void getMaxSize() {
        assertTrue(farmHouse1.getMaxSize() == 5);
    }

    @Test
    void getStorageType() {
        assertTrue(farmHouse1.getStorageType().equals(Optional.of(Person.class)));
    }

    @Test
    void getFarmHandsDefault() {
        assertTrue(farmHouse1.getFarmHands().size() == 0);
    }

    @Test
    void addFarmHand() {
        farmHouse1.addFarmHand(new Farmer("John"));

        assertEquals(1, farmHouse1.getFarmHands().size());
    }

    @Test

    void addFarmHands(){
        farmHouse1.addFarmHands(List.of(new Farmer("Jim"), new Farmer("Jon")));

        assertEquals(2, farmHouse1.getFarmHands().size());
    }


    @Test
    void removeFarmHand() {
        farmHouse1.addFarmHand(farmer1);
        assertEquals(1, farmHouse1.getFarmHands().size());

        farmHouse1.removeFarmHand(farmer1);

        assertEquals(0, farmHouse1.getFarmHands().size());
    }
}