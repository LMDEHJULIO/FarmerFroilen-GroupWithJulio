package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    Farm farm1 = new Farm();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();


    @Test
    void addStable() {
        farm1.addStable(new Stable());

        assertTrue(farm1.getStables().size() == 1);
    }

    @Test
    void addStableAtIndex() {
        farm1.addStable(stable1);
        farm1.addStableAtIndex(1, stable2);

        assertTrue(farm1.getStables().size() == 2);
        assertTrue(farm1.getStableAtIndex(1) == stable2);
    }

    @Test
    void addStables() {
        farm1.addStables(List.of(stable1, stable2));

        assertTrue(farm1.getStables().size() == 2);
    }

    @Test
    void removeStable() {

        farm1.addStables(List.of(stable1, stable2));

        farm1.removeStable(stable2);

        assertTrue(farm1.getStables().size() == 1);
    }

    @Test
    void setFarmHouse() {
        FarmHouse newFarmhouse = new FarmHouse("Froilen's crib");

        System.out.println(farm1.getFarmHouse());

        farm1.setFarmHouse(newFarmhouse);

        System.out.println(farm1.getFarmHouse());

        assertTrue(farm1.getFarmHouse() == newFarmhouse);
    }

    @Test
    void getChickenCount(){
        farm1.getChickenCoops().add(new ChickenCoop());
//        System.out.println(farm1.getChickenCoops().size());
        ChickenCoop coop1 = (ChickenCoop) farm1.getChickenCoops().get(0);
        coop1.addChicken(new Chicken());
        assertTrue(farm1.getChickenCount() == 1);
    }

    @Test
    void buyDuster(){
        farm1.buyCropDuster(new CropDuster("Zoom-o-matic", "ring-a-ding-ding", true));

        assertTrue(farm1.getDuster() instanceof CropDuster);
    }

    @Test
    void addFarmVehicles(){
        FarmVehicle farmVehicle1 = new Tractor("Tracto", "Brp-brp-brp-brp-brp", true);
        farm1.addFarmVehicle(farmVehicle1);

        System.out.println(farm1.getFarmVehicles().size());
        assertTrue(farm1.getFarmVehicles().size() == 1);

        farm1.removeFarmVehicle(farmVehicle1);

        assertTrue(farm1.getFarmVehicles().size() == 0);
    }

    @Test
    void getStableCount(){
        System.out.println(farm1.getStableCount());
        farm1.addStable(new Stable());
        System.out.println(farm1.getStableCount());

    }


}