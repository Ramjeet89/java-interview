package com.interview.utils;

import java.util.function.Function;

public class CalculateSquareRoot {
    public static void main(String[] args) {
        double number1 = 25.0;
        double number2 = 30.0;

        calculateSquareRoot(number1);
        calculateSquareRoot(number2);
    }

    private static void calculateSquareRoot(double number) {
        Function<Double, Double> squareRootFunction = Math::sqrt;
        double squareRoot = squareRootFunction.apply(number);
        if (Math.pow(Math.floor(squareRoot), 2) == number) {
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}