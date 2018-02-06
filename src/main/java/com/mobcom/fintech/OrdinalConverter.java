package com.mobcom.fintech;

/*
Finish the function numberToOrdinal, which should take a number
and return it as a string with the correct ordinal indicator suffix (in English).

That is:

numberToOrdinal(1) ==> '1st'
numberToOrdinal(2) ==> '2nd'
numberToOrdinal(3) ==> '3rd'
numberToOrdinal(4) ==> '4th'
... and so on
For the purposes of this challenge, you may assume that the function will always
be passed a non-negative integer. If the function is given 0 as an argument, it should return '0' (as a string).

To help you get started, here is an excerpt from Wikipedia's page on Ordinal Indicators:

st is used with numbers ending in 1 (e.g. 1st, pronounced first)
nd is used with numbers ending in 2 (e.g. 92nd, pronounced ninety-second)
rd is used with numbers ending in 3 (e.g. 33rd, pronounced thirty-third)
th is used for all other numbers (e.g. 9th, pronounced ninth).

Documentation
numberToOrdinal(number)
Parameters:
number: Integer
The number to be converted to a string ordinal.

Constraints:
0 <= number <= 10000
Returns: String
Returns a string ordinal based off of the number.

 */

public class OrdinalConverter {
    private final int EDGE_CASES = 10;

    public String numberToOrdinal(Integer number) {
        String ordinal, ordinalSuffix;

        if (number.equals(0)) {
            return number.toString();
        }

        if(isEdgeCase(number)){
            ordinalSuffix = "th";
        }else{
            ordinalSuffix = determineOrdinalSuffix(number);
        }

        ordinal = number.toString();
        return ordinal.concat(ordinalSuffix);

    }

    private boolean isEdgeCase(Integer number){
        int modeToTen = number % 10;
        int modeToHundred = number % 100;
        return ((modeToHundred - modeToTen) == EDGE_CASES);
    }

    private String determineOrdinalSuffix(Integer number){
        String ordinalSuffix;
        number = number % 10;
        switch (number){
            case 1:
                ordinalSuffix = "st";
                break;
            case 2:
                ordinalSuffix = "nd";
                break;
            case 3:
                ordinalSuffix = "rd";
                break;
            default:ordinalSuffix = "th";
        }
        return ordinalSuffix;
    }
}
