package com.interview.utils;

import java.util.Arrays;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5,6,7,9,10};
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int expectedSum = (10 * (10 + 1)) / 2; // Sum of numbers from 1 to 10
        int actualSum = Arrays.stream(array).sum(); // Sum of the elements in the array
        return expectedSum - actualSum;
    }
}
