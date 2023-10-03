package org.FarmerFroilen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test

    void NullaryConstructor(){
        Field field1 = new Field();

        assertTrue(field1.cropRows.get(0).getCropAt(0) instanceof Cornstalk);

        assertTrue(field1.cropRows.get(1).getCropAt(0) instanceof TomatoPlant);

        assertTrue(field1.getRowCount() == 2);

        assertTrue(field1.cropRows.getMaxSize() == 5);
    }

    @Test
    void printRows() {
    }
}