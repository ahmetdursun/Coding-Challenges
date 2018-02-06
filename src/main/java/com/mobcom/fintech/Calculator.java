package com.mobcom.fintech;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;


/*
Your job is to create a calculator which evaluates expressions given to you in string format.

The expressions are numbers and operators. Go through the expression left to right, keep track of the numbers, and when
you come to an operator, apply it to the previous two numbers, and replace them with the result.

 */
public class Calculator {

    private HashMap<String, ToDoubleBiFunction<Double, Double>> operations = new HashMap<>();
    private Stack<Double> bucket = new Stack<>();


    public Calculator() {
        populateOperations();
    }

    private void populateOperations() {
        operations.put("/", (arg1, arg2) -> (arg1 / arg2));
        operations.put("*", (arg1, arg2) -> (arg1 * arg2));
        operations.put("+", (arg1, arg2) -> (arg1 + arg2));
        operations.put("-", (arg1, arg2) -> (arg1 - arg2));
    }

    public double evaluate(String expr) {

        if (expr == null || expr.isEmpty()) {
            return 0.0;
        }

        Arrays.stream(expr.split(" ")).forEach(input -> {
            if (operations.containsKey(input)) {
                Double operand2 = bucket.pop();
                Double operand1 = bucket.pop();
                Double result = operations.get(input).applyAsDouble(operand1, operand2);
                bucket.push(result);
            } else {
                bucket.push(Double.parseDouble(input));
            }

        });
        return bucket.pop();
    }

}
