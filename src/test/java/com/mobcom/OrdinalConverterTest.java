package com.mobcom;

import com.mobcom.fintech.OrdinalConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrdinalConverterTest {

    private OrdinalConverter ordinalConverter = new OrdinalConverter();

    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("0", ordinalConverter.numberToOrdinal(0));
        assertEquals("1st", ordinalConverter.numberToOrdinal(1));
        assertEquals("2nd", ordinalConverter.numberToOrdinal(2));
        assertEquals("3rd", ordinalConverter.numberToOrdinal(3));
        assertEquals("5th", ordinalConverter.numberToOrdinal(5));
    }

    @Test
    public void shouldHandleEdgeCases() {
        assertEquals("11th", ordinalConverter.numberToOrdinal(11));
        assertEquals("12th", ordinalConverter.numberToOrdinal(12));
        assertEquals("13th", ordinalConverter.numberToOrdinal(13));
        assertEquals("103rd", ordinalConverter.numberToOrdinal(103));
        assertEquals("113th", ordinalConverter.numberToOrdinal(113));
    }

    @Test
    public void shouldHandleMultipleDigits() {
        assertEquals("21st", ordinalConverter.numberToOrdinal(21));
        assertEquals("22nd", ordinalConverter.numberToOrdinal(22));
        assertEquals("23rd", ordinalConverter.numberToOrdinal(23));
        assertEquals("75th", ordinalConverter.numberToOrdinal(75));
        assertEquals("455th", ordinalConverter.numberToOrdinal(455));
    }
}
