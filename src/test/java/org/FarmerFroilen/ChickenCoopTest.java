package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    @Test
    void  NullaryCoopConstructor() {
        ChickenCoop coop1 = new ChickenCoop();

        Utility.MaxableArrayList<Chicken> chickenList = coop1.getChicken();


        for(Chicken chicken : chickenList) {
            System.out.println(chicken);
        }
    }
}