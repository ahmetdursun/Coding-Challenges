package com.mobcom;

import com.mobcom.fintech.OrdinalConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalConverterTest {

    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("0", OrdinalConverter.numberToOrdinal(0));
        assertEquals("1st", OrdinalConverter.numberToOrdinal(1));
        assertEquals("2nd", OrdinalConverter.numberToOrdinal(2));
        assertEquals("3rd", OrdinalConverter.numberToOrdinal(3));
        assertEquals("5th", OrdinalConverter.numberToOrdinal(5));
    }

    @Test
    public void shouldHandleEdgeCases() {
        assertEquals("11th", OrdinalConverter.numberToOrdinal(11));
        assertEquals("12th", OrdinalConverter.numberToOrdinal(12));
        assertEquals("13th", OrdinalConverter.numberToOrdinal(13));
        assertEquals("103rd", OrdinalConverter.numberToOrdinal(103));
        assertEquals("113th", OrdinalConverter.numberToOrdinal(113));
    }

    @Test
    public void shouldHandleMultipleDigits() {
        assertEquals("21st", OrdinalConverter.numberToOrdinal(21));
        assertEquals("22nd", OrdinalConverter.numberToOrdinal(22));
        assertEquals("23rd", OrdinalConverter.numberToOrdinal(23));
        assertEquals("75th", OrdinalConverter.numberToOrdinal(75));
        assertEquals("455th", OrdinalConverter.numberToOrdinal(455));
    }
}
