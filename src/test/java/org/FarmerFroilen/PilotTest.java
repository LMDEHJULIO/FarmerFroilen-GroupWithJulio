package org.FarmerFroilen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PilotTest {

    @Test
    void isPerson(){
        var ace = new Pilot("Froilinda");

        assertTrue(ace instanceof Person);
    }

}
