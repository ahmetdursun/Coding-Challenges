# Coding Challenges


#### String Masking

_"Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. 
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it. 
Your task is to write a function maskify, which masks all but the first and last four characters with '#'. 
Non-digits should never be masked."_

* Implemented in [CreditCard](/src/main/java/com/mobcom/fintech/CreditCard.java)

#### Calculator

_"Your job is to create a calculator which evaluates expressions given to you in string format. The expressions are numbers and operators. Go through the expression left to right, keep track of the numbers, and when you come to an operator, apply it to the previous two numbers, and replace them with the result."_

* Implemented in [Calculator](/src/main/java/com/mobcom/fintech/Calculator.java)

### Number to Ordinal Conversion

<em>"Finish the function numberToOrdinal, which should take a number and return it as a string with the correct ordinal indicator suffix (in English).

That is:

* numberToOrdinal(1) ==> '1st'
* numberToOrdinal(2) ==> '2nd'
* numberToOrdinal(3) ==> '3rd'
* numberToOrdinal(4) ==> '4th' ... and so on.

For the purposes of this challenge, you may assume that the function will always be passed a non-negative integer. If the function is given 0 as an argument, it should return '0' (as a string).

To help you get started, here is an excerpt from Wikipedia's page on Ordinal Indicators:

* st is used with numbers ending in 1 (e.g. 1st, pronounced first)
* nd is used with numbers ending in 2 (e.g. 92nd, pronounced ninety-second)
* rd is used with numbers ending in 3 (e.g. 33rd, pronounced thirty-third)
* th is used for all other numbers (e.g. 9th, pronounced ninth)."</em>

Implemented in [OrdinalConverter](/src/main/java/com/mobcom/fintech/OrdinalConverter.java)