package org.FarmerFroilen;

import org.FarmerFroilen.Animal.Chicken;
import org.FarmerFroilen.Receptacle.ChickenCoop;
import org.FarmerFroilen.Utility.Utility;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    }

    @Test
    void add(){
        ChickenCoop coop1 = new ChickenCoop();

        coop1.getChicken().add(new Chicken());

        assertTrue(coop1.getChicken().size() == 1);
    }

    @Test
    void addAll(){
        ChickenCoop coop1 = new ChickenCoop();

        coop1.addChickens(List.of(new Chicken(), new Chicken()));

        assertTrue(coop1.getChicken().size() == 2);
    }

    @Test
    void remove(){
        ChickenCoop coop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        coop1.addChickens(List.of(chicken1, chicken2));

        assertTrue(coop1.getChicken().size() == 2 );
        coop1.removeChicken(chicken1);
        assertTrue(coop1.getChicken().size() == 1);

    }
}