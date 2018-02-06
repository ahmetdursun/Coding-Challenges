package com.mobcom;

import com.mobcom.fintech.CreditCard;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForDifferentLengths() {
        assertEquals("6######5616", CreditCard.maskify("64607935616"));
    }


    @Test
    public void shouldMaskDigitsForCreditCardsWithDashes() {
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskString() {
        assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }

    @Test
    public void shouldHandleEmptyString() {
        assertEquals("", CreditCard.maskify(""));
        assertEquals("", CreditCard.maskify(null));
    }

    @Test
    public void shouldNotMaskIfShorterThanDesiredLength() {
        assertEquals("12345asdf", CreditCard.maskify("12345asdf"));
        assertEquals("12345", CreditCard.maskify("12345"));
        assertEquals("123", CreditCard.maskify("123"));
    }
}