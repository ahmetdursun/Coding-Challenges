package com.mobcom;

import com.mobcom.fintech.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }
}
