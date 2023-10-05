package org.FarmerFroilen;

import org.FarmerFroilen.Interface.Botanist;
import org.FarmerFroilen.Interface.Eater;
import org.FarmerFroilen.Interface.Rider;
import org.FarmerFroilen.Person.Farmer;
import org.FarmerFroilen.Person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FarmerTest {
    Farmer farmer;

    @BeforeEach

    public void setup(){
        farmer = new Farmer("Froiland");
    }

    // checks if the farmer is a Eater
    @Test
    void isEater(){
        assertTrue(farmer instanceof Eater);
    }
    // checking the rider implementation
    @Test
    void isRider(){
        assertTrue( farmer instanceof Rider);
    }
    // checking botanist implementation
    @Test
    void isBotanist(){
        assertTrue(farmer instanceof Botanist);
    }

    // checking the person inheritence
    @Test
    void isPerson(){
        assertTrue(farmer instanceof Person);
    }

//    @Test

//    void plant(){
//        farmer.plant();
//    }

}
