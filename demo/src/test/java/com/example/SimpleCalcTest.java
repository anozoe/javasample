package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleCalcTest {
    @Test
    public void testAdd() {
        SimpleCalc simpleCalc = new SimpleCalc();
        int result = simpleCalc.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        SimpleCalc simpleCalc = new SimpleCalc();
        int result = simpleCalc.subtract(10, 5);
        assertEquals(5, result);
    }
}
