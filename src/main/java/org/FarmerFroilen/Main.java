package org.FarmerFroilen;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Crop tomato = new TomatoPlant();
//        Crop tomato2 = new TomatoPlant();
//        Crop corn = new Cornstalk();
//        Crop corn2 = new Cornstalk();
//        CropRow cropRow = new CropRow();
//        cropRow.addCrop(tomato);
//        cropRow.addCrop(tomato2);
//        cropRow.addCrop(corn2);
//        cropRow.addCrop(corn);
//        System.out.println("Wu tang forever");
//        CropDuster cropDuster = new CropDuster("Plane","Nyoom",true);
//        cropDuster.fly();
//        cropDuster.fertilize(cropRow);
//        System.out.println(cropRow.getCropAt(3));

        // New Farm

        Farm froilandsFarm = new Farm();

        // new Farmer/Pilots
        Farmer froiland = new Farmer("Froiland");
        Pilot froilanda = new Pilot("Froilanda");

        // Get Farmhouse

        System.out.println(froilandsFarm.getFarmHouse());

        // Add farmhands - have to edit the addAll functionality
        froilandsFarm.getFarmHouse().addFarmHand(froiland);
        froilandsFarm.getFarmHouse().addFarmHand(froilanda);

        // Get farmhands

        System.out.println(froilandsFarm.getFarmHouse().getFarmHands());

        // Get Stables
        System.out.println(froilandsFarm.getStables());

        // Add multiple stables
        froilandsFarm.addStables(List.of(new Stable(), new Stable()));


        // Get stables

        System.out.println(froilandsFarm.getStables().size());

        // Add ChickenCoop
        froilandsFarm.addCoop(new ChickenCoop());

        System.out.println(froilandsFarm.getChickenCoops().size());


        // Print field
        froilandsFarm.viewField();

        // Get overview of field

        froilandsFarm.getField();

        Field froilandsField = froilandsFarm.getField();

        // Get Crop Rows
        Utility.MaxableArrayList froilandsCropRows = froilandsFarm.getField().getCropRows();

        // Add Crop Rows
        froilandsCropRows.add(new CropRow());

        // Get last row and add tomato plant
        froilandsField.getLastRow().addCrop(new TomatoPlant());

        // get & print last row
        System.out.println(froilandsField.getLastRow().toString());

        // set row to be fertilized
        froilandsField.getLastRow().getCropAt(0).setHasBeenFertilized(true);


        froilandsField.getLastRow().getCropAt(0).yield();

        froilandsFarm.buyCropDuster(new CropDuster("CropStunna9000", "Sprissst-sprisst-fertile-fertile", true));

        CropRow lastRow = froilandsField.getLastRow();

        lastRow.addCrop(new Cornstalk());

        froilandsFarm.getDuster().fertilize(lastRow);

        lastRow.getCropAt(1).yield();








    }

}