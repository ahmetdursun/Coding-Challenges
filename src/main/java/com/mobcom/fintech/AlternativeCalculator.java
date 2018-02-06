package com.mobcom.fintech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class AlternativeCalculator {
    private Set<String> operators = new HashSet<>(Arrays.asList("/", "+","-","*"));
    private Stack<Double> bucket = new Stack<>();

    public double evaluate(String expr) {

        if(expr == null || expr.isEmpty()){
            return 0.0;
        }

        Arrays.stream(expr.split(" ")).forEach(input->{
            if (operators.contains(input)) {
                Double operand2 = bucket.pop();
                Double operand1 = bucket.pop();
                Double result = applyOperator(input,operand1,operand2);
                bucket.push(result);
            }else{
                bucket.push(Double.parseDouble(input));
            }

        });
        return bucket.pop();
    }

    private double applyOperator(String operator, Double operand1, Double operand2){
        Double result = null;
        switch (operator){
            case "/":
                result = operand1 / operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "+":
                result = operand1 + operand2;
                break;
        }

        return result;
    }
}