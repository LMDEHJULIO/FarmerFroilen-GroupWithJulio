package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    @Test
    void  NullaryCoopConstructor() {
        ChickenCoop coop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();

        coop1.addChicken(chicken1);

        Utility.MaxableArrayList<Chicken> chickenList = coop1.getChicken();

        assertTrue(coop1.getMaxSize() == 15);
        assertTrue(coop1.getMaxSize() == coop1.getChicken().getMaxSize());

////        System.out.println(chicken1);
//        System.out.println(coop1.getChicken().size());
//
//        for(Chicken chicken : chickenList) {
//            System.out.println(chicken.toString());
//            System.out.println(coop1);
//        }
    }
//
//    @Test
//    void add(){
//        ChickenCoop coop1 = new ChickenCoop();
//
//        coop1.getChicken().addAll(
//                Collection(new Chicken())
//                );
//    }
}