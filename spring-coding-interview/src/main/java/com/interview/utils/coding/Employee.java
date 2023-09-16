package com.interview.utils.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        String s = "ram is working in abc company, ram is from bangalore, ram is good i algorithum";
        Map<String, Long> countWords = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countWords.forEach((words, count) -> System.out.println(words + ":" + count));

        System.out.println("Other ways");

        // String s = "ram is working in abc company, ram is from bangalore, ram is good in algorithm";

        Map<String, Long> countOfWords = Arrays.stream(s.split("\\W+")) // Split by non-word characters
                .map(String::toLowerCase) // Convert to lowercase
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countOfWords.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
