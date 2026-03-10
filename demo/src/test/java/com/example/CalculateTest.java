package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void testAdd() {
        Calculate calculate = new Calculate();
        Calc2IntDto input = new Calc2IntDto(10, 5);

        CalcResult result = calculate.calc(input, CalcInstructionType.ADD);

        assertEquals(15, result.getResult());
    }

    @Test
    public void testSubtract() {
        Calculate calculate = new Calculate();
        Calc2IntDto input = new Calc2IntDto(10, 5);

        CalcResult result = calculate.calc(input, CalcInstructionType.SUBTRACT);

        assertEquals(5, result.getResult());
    }

    @Test
    public void testMultiply() {
        Calculate calculate = new Calculate();
        Calc2IntDto input = new Calc2IntDto(10, 5);

        CalcResult result = calculate.calc(input, CalcInstructionType.MULTIPLY);

        assertEquals(50, result.getResult());
    }

    @Test
    public void testDivide() {
        Calculate calculate = new Calculate();
        Calc2IntDto input = new Calc2IntDto(10, 5);

        CalcResult result = calculate.calc(input, CalcInstructionType.DIVIDE);

        assertEquals(2, result.getResult());
    }
}
