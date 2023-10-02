package org.FarmerFroilen;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Crop tomato = new TomatoPlant();
//        Crop tomato2 = new TomatoPlant();
        Crop corn = new Cornstalk();
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
//        Tractor bgTractor = new Tractor("Big Green Tractor", "Choo choo", true);
//        //checks output to confirm successful harvest
//        bgTractor.harvest(corn);
//        //checks output to confirm you cannot harvest this crop again
//        bgTractor.harvest(corn);


        Farm froilandsFarm = new Farm();

        Farmer froiland = new Farmer("Froiland");
        Pilot froilanda = new Pilot("Froilanda");

        System.out.println(froilandsFarm.getFarmHouse());

        froilandsFarm.getFarmHouse().addFarmHand(froiland);
        froilandsFarm.getFarmHouse().addFarmHand(froilanda);

        System.out.println(froilandsFarm.getFarmHouse().getFarmHands());



    }

}