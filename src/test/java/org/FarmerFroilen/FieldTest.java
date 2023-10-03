package org.FarmerFroilen;

import org.FarmerFroilen.Crop.*;
import org.FarmerFroilen.Crop.Field;
import org.FarmerFroilen.Crop.TomatoPlant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test

    void NullaryConstructor(){
        Field field1 = new Field();

        assertTrue(field1.getCropRows().get(0).getCropAt(0) instanceof Cornstalk);

        assertTrue(field1.getCropRows().get(1).getCropAt(0) instanceof TomatoPlant);

        assertTrue(field1.getRowCount() == 2);

        assertTrue(field1.getCropRows().getMaxSize() == 5);
    }

    @Test
    void printRows() {
    }
}