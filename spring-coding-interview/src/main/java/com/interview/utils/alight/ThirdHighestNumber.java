package com.interview.utils.alight;

import java.util.Arrays;

public class ThirdHighestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 9, 3, 5, 19};
        int rdHighest = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a).skip(2)
                .findFirst()
                .orElse(-1);
        System.out.println(rdHighest);
    }
}
