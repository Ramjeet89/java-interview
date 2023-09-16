package com.interview.utils.coding;

import java.util.HashSet;

public class TwoSumExample {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 17};
        int target = 9;
        findTwoSumPairs(arr, target);
    }

    public static void findTwoSumPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair: " + num + ", " + complement);
            }
            set.add(num);
        }
    }
}

