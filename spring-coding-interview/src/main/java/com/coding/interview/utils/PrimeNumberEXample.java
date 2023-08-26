package com.coding.interview.utils;

import java.util.stream.IntStream;

public class PrimeNumberEXample {
    public static void main(String[] args) {

        System.out.println("Prime numbers in the range from 1 to 100:");
        IntStream.rangeClosed(1, 10)
                .filter(PrimeNumberEXample::isPrime)
                .forEach(System.out::println);
        int sumOfPrimeNumbers = IntStream.rangeClosed(1, 10).filter(PrimeNumberEXample::isPrime).sum();
        System.out.println("Sum of all prim number:: " + sumOfPrimeNumbers);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
