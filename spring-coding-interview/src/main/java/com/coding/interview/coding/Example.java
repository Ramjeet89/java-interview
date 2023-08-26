package com.coding.interview.coding;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        //Declarative approach
        int num = 4;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number)
                .noneMatch(index -> number % index == 0);
    }
}
