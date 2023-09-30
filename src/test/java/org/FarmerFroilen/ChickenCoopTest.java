package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    @Test
    void  NullaryCoopConstructor() {
        ChickenCoop coop1 = new ChickenCoop();

        System.out.println(coop1.chicken[0]);
    }
}