package org.FarmerFroilen;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {
    @Test
     void validAdd(){
        Utility.MaxableArrayList<Horse> list = new Utility.MaxableArrayList<>(1);
        Horse horse1 = new Horse();

        //Assert true because add returns a boolean
        assertTrue(list.add(horse1));
    }

    @Test
    void badAdd(){
        Utility.MaxableArrayList<Horse> list = new Utility.MaxableArrayList<>(1);
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        list.add(horse1);

        //Assert true because add returns a boolean
        assertFalse(list.add(horse2));
    }
}