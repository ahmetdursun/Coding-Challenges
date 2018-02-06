package com.mobcom;

import com.mobcom.fintech.CreditCard;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard = new CreditCard();

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", creditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForDifferentLengths() {
        assertEquals("6######5616", creditCard.maskify("64607935616"));
    }


    @Test
    public void shouldMaskDigitsForCreditCardsWithDashes() {
        assertEquals("4###-####-####-5616", creditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskString() {
        assertEquals("Skippy", creditCard.maskify("Skippy"));
    }

    @Test
    public void shouldHandleEmptyString() {
        assertEquals("", creditCard.maskify(""));
        assertEquals("", creditCard.maskify(null));
    }

    @Test
    public void shouldNotMaskIfShorterThanDesiredLength() {
        assertEquals("12345asdf", creditCard.maskify("12345asdf"));
        assertEquals("12345", creditCard.maskify("12345"));
        assertEquals("123", creditCard.maskify("123"));
    }
}