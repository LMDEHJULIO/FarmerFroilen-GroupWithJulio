package org.FarmerFroilen;

import org.FarmerFroilen.Person.Farmer;
import org.FarmerFroilen.Person.Person;
import org.FarmerFroilen.Receptacle.FarmHouse;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FarmHouseTest {
    static FarmHouse farmHouse1 = new FarmHouse();

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

        assertTrue(farmHouse1.getFarmHands().size() == 1);
    }

//    @Test
//    void addFarmHands() {
//        Farmer dave = new Farmer("Dave");
//        Farmer lilJim = new Farmer("Lil Jim");
//
//        Utility.MaxableArrayList<Farmer> farmRecruits = new Utility.MaxableArrayList<>(5);
//
//        farmRecruits.add(dave);
//        farmRecruits.add(lilJim);
//
//        farmRecruits.forEach(hand -> System.out.println(hand.getName()));
//
//        farmHouse1.addFarmHands(farmRecruits);
//
//        System.out.println(farmHouse1.getFarmHands().size());
//
//        assertTrue(farmHouse1.getFarmHands().size() == farmRecruits.size());
//    }
//
//    @Test
//    void removeFarmHand() {
//        farmHouse1.addFarmHand(new Farmer("Stewart"));
//
//        farmHouse1.remove("Stewart");
//    }
//
//    @Test
//    void testToString() {
//    }
}