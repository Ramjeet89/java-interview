package com.interview.utils;

import java.util.Arrays;
public class ClosestToNineExample {
    public static void main(String[] args) {
        int[] numbers = { 8, 14, 16, 10};
        int closestToNine = Arrays.stream(numbers).filter(n -> n > 9)
                .reduce((a, b) -> Math.abs(9 - a) < Math.abs(9 - b) ? a : b).orElse(-1);
        System.out.println("No number greater then 9:: " + closestToNine);
    }
}
