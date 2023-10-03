package org.FarmerFroilen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    
    @Test
    void testInheritance(){
        // farmer is a person
        var farmer =new Farmer("frolian");

        assertTrue(farmer instanceof Noisemaker);

    }
}
