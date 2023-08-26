package com.coding.interview.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1));  // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3));  // Output: [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndexMap.containsKey(complement)) {
                return new int[]{numToIndexMap.get(complement), i};
            }
            numToIndexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}
