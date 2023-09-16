package com.interview.utils.ibm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateElementsJava8 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 4, 4, 4};
        long count = countDuplicate(numbers);
        System.out.println("Number of non-unique elements: " + count); // Output: 2
    }
    public static long countDuplicate(int[] numbers) {
        // Use Java 8 stream to count non-unique elements
        Map<Integer, Long> frequencyMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Count the elements with a count greater than 1
        return frequencyMap.values().stream()
                .filter(count -> count > 1)
                .count();
    }
}
