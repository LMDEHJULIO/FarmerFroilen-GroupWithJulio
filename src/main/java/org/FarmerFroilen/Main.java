package org.FarmerFroilen;
import org.FarmerFroilen.Animal.Chicken;
import org.FarmerFroilen.Animal.Horse;
import org.FarmerFroilen.Crop.*;
import org.FarmerFroilen.Person.Farmer;
import org.FarmerFroilen.Person.Person;
import org.FarmerFroilen.Person.Pilot;
import org.FarmerFroilen.Receptacle.ChickenCoop;
import org.FarmerFroilen.Receptacle.Farm;
import org.FarmerFroilen.Receptacle.FarmHouse;
import org.FarmerFroilen.Receptacle.Stable;
import org.FarmerFroilen.Utility.Utility;
import org.FarmerFroilen.Vehicle.CropDuster;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // New Farm

        Farm froilandsFarm = new Farm();

        // new Farmer/Pilots - Froiland Froilanda

        Farmer froiland = new Farmer("Froiland");
        Pilot froilanda = new Pilot("Froilanda");

        // Get Farmhouse

        FarmHouse farmhouse = froilandsFarm.getFarmHouse();

        // Add farmhands

        farmhouse.addFarmHands(List.of(froiland, froilanda));


        // Get farmhands

        Utility.MaxableArrayList<Person> farmHands = froilandsFarm.getFarmHouse().getFarmHands();


        // Get Stables

        Utility.MaxableArrayList<Stable> stables = froilandsFarm.getStables();

        // Add multiple stables

        froilandsFarm.addStables(List.of(new Stable(), new Stable()));

        // Get # of stables

        System.out.println("Number of Stables: " + froilandsFarm.getStables().size());

        // Add ChickenCoop
        froilandsFarm.addCoop(new ChickenCoop());

        // Get Coops

        Utility.MaxableArrayList<ChickenCoop> chickenCoops = froilandsFarm.getChickenCoops();

        // Get # of chicken coops
        System.out.println("Number of coops " + chickenCoops.size());


        // Print field
        froilandsFarm.viewField();

        // Get overview of field

        froilandsFarm.getField();

        Field froilandsField = froilandsFarm.getField();

        // Get Crop Rows
        Utility.MaxableArrayList froilandsCropRows = froilandsFarm.getField().getCropRows();

        System.out.println("Crop Rows: " + froilandsCropRows);

        // Add Crop Rows
        froilandsCropRows.add(new CropRow());

        // Get last row and add tomato plant

        froilandsField.getLastRow().addCrop(new TomatoPlant());

        // Get & print last row
        System.out.println(froilandsField.getLastRow().toString());

        // Set row to be fertilized
        froilandsField.getLastRow().getCropAt(0).setHasBeenFertilized(true);

        // Yield first crop in last row

        froilandsField.getLastRow().getCropAt(0).yield();

        // Create or "buy" new crop duster

        froilandsFarm.buyCropDuster(new CropDuster("CropStunna9000", "Sprissst-sprisst-fertile-fertile", true));


        CropRow lastRow = froilandsField.getLastRow();

        // Add a cornstalk (currently unfertilized) to lastRow
        lastRow.addCrop(new Cornstalk());

        // Fertilize last row

        froilandsFarm.getDuster().fertilize(lastRow);

        // Yield that thang

        lastRow.getCropAt(1).yield();

        // Get chicken coops

        Utility.MaxableArrayList<ChickenCoop> coops = froilandsFarm.getChickenCoops();

        // Get first coop
        ChickenCoop firstCoop = coops.get(0);

        System.out.println(coops.get(0));

        // Add a chicken to that thang

        firstCoop.addChicken(new Chicken());

        // Print the number of chickens
        System.out.println("Number of chickens: " + firstCoop.getChickenCount());

        firstCoop.addChickens(List.of(new Chicken(), new Chicken()));

        System.out.println("Number of chickens: " + firstCoop.getChickenCount());


        // Get first stable
        Stable firstStable = stables.get(0);

        System.out.println(firstStable);

        // Add a horsie to that thang

        firstStable.addHorse(new Horse());

        // Print the number of horsies
        System.out.println("Number of horses: " + firstStable.getHorses().size());

        // Add multiple Horsies

        firstStable.addHorses(List.of(new Horse(), new Horse()));

        // Print number of horses

        System.out.println("Number of horses: " + firstStable.getHorses().size());

    }

}