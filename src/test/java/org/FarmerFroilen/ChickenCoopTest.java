package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    @Test
    void  NullaryCoopConstructor() {
        ChickenCoop coop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();

        coop1.addChicken(chicken1);

        Utility.MaxableArrayList<Chicken> chickenList = coop1.getChicken();

////        System.out.println(chicken1);
//        System.out.println(coop1.getChicken().size());
//
//        for(Chicken chicken : chickenList) {
//            System.out.println(chicken.toString());
//            System.out.println(coop1);
//        }
    }
}