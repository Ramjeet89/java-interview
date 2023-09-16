package com.interview.utils;

import java.util.function.BiFunction;

public class SquareRootUsingFunction {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiplyFunction = (a, b) -> a * b;
        System.out.println(multiplyFunction.apply(2, 4));

//        Function < Integer, Integer > function4 = (number) -> number * number;
//        System.out.println(function4.apply(4));
    }
}
