package org.FarmerFroilen;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

    @Test
    void addAll(){
        Utility.MaxableArrayList<String> list = new Utility.MaxableArrayList<>(1);
        assertFalse(list.addAll(Arrays.asList("1", "2", "3", "3")));
        System.out.println(list);
        System.out.println(list.getMaxSize());
        System.out.println(list.size() > list.getMaxSize());
    }

    @Test
    void addOne(){
        Utility.MaxableArrayList<String> list = new Utility.MaxableArrayList<>(1);
        list.add("Hi");
//        list.add(2, "Wassup");

//        assertThrows(IndexOutOfBoundsException.class,() -> list.add(2,"Wassup"), "Out of bounds should be thrwn");
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(2, "Wassup"), "Expected an IndexOutOfBoundsException to be thrown");
//        assertTrue(exception.getMessage().contains(" Max size reached "), "Max size reached should be included");

    }

    @Test
    void removeOne(){
        Utility.MaxableArrayList<String> list = new Utility.MaxableArrayList<>(2);
        list.addAll(List.of("Hi", "Sup"));

//        list.remove(0);
        list.remove("Hi");
        list.remove(0);
        assertTrue(list.size() == 0);
//        System.out.println(list.size());
    }
}