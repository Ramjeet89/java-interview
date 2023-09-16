package com.interview.utils.code;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 9, 10};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums)
            numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}
