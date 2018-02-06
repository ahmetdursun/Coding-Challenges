package com.mobcom.fintech;


/*
Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which masks all but the first and last four characters with '#'.
Non-digits should never be masked.

 */

public class CreditCard {
    private static final int SIZE = 6;
    private static final int NUMBER_OF_LASTCHARS_NOTTO_MASK = 4;

    /**
     * It is assumed that creditCardNumber starts with a digit and ends with 4 digits.
     * @param creditCardNumber
     * @return masked creditCardNumber
     */
    public static String maskify(String creditCardNumber) {

        if (creditCardNumber == null || creditCardNumber.isEmpty()) {
            return "";
        }

        if (creditCardNumber.length() < SIZE) {
            return creditCardNumber;
        }

        if (creditCardNumber.replaceAll("\\D", "").length() < SIZE) {
            return creditCardNumber;
        }

        int cardLength = creditCardNumber.length();

        String inner = creditCardNumber.substring(1, cardLength - NUMBER_OF_LASTCHARS_NOTTO_MASK);
        inner = inner.replaceAll("[0-9]", "#");

        creditCardNumber = creditCardNumber.charAt(0) + inner + creditCardNumber.substring(cardLength - NUMBER_OF_LASTCHARS_NOTTO_MASK);
        return creditCardNumber;

    }
}
