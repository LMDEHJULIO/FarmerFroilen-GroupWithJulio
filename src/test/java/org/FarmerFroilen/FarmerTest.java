package org.FarmerFroilen;

import org.FarmerFroilen.Interface.Botanist;
import org.FarmerFroilen.Interface.Eater;
import org.FarmerFroilen.Interface.Rider;
import org.FarmerFroilen.Person.Farmer;
import org.FarmerFroilen.Person.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FarmerTest {

    // checks if the farmer is a Eater
    @Test
    void isEater(){
        var farmer = new Farmer("Mikaila");
        assertTrue(farmer instanceof Eater);
    }
    // checking the rider implementation
    @Test
    void isRider(){
        var farmer = new Farmer("Foilian");
        assertTrue( farmer instanceof Rider);
    }
    // checking botanist implementation
    @Test
    void isBotanist(){
        var farmer = new Farmer("Ki");
        assertTrue(farmer instanceof Botanist);
    }

    // checking the person inheritence
    @Test
    void isPerson(){
        var farmer = new Farmer("Tanzir");

        assertTrue(farmer instanceof Person);
    }

}
