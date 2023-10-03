package org.FarmerFroilen;
import org.FarmerFroilen.Person.Person;
import org.FarmerFroilen.Person.Pilot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PilotTest {

    @Test
    void isPerson(){
        var ace = new Pilot("Froilinda");

        assertTrue(ace instanceof Person);
    }

}
