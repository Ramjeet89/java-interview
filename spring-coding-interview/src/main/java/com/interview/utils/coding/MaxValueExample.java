package com.interview.utils.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxValueExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalInt max = numbers.stream().mapToInt(Integer::valueOf).max();
        System.out.println(max);

        IntSummaryStatistics summary = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max:: " + summary.getMax());
        System.out.println("Min:: " + summary.getMin());
        System.out.println("Avg:: " + summary.getAverage());
        System.out.println("Sum:: " + summary.getSum());
        System.out.println("Count:: " + summary.getCount());

        numbers.stream().map(number -> number * 2).forEach(System.out::println);


        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(s -> s.stream())
                .toList();
        System.out.println(namesFlatStream);
        //

        //String s = "ironman";
        // Using Java 8 Stream to count character occurrences
       /* Map<Character, Long> occurrenceMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print character occurrence
        System.out.println("Character Occurrence in the string:");
        occurrenceMap.forEach((character, count) -> System.out.println(character + ": " + count));

        //or

        String s1 = "ironman";

        // Create a map to store character occurrences
        Map<Character, Integer> charOccurrences = new HashMap<>();
        // Using Java 8 stream to iterate through the characters and count occurrences
        s1.chars().forEach(c -> charOccurrences.put((char) c, charOccurrences.getOrDefault((char) c, 0) + 1));
        // Print the character occurrences
        charOccurrences.forEach((character, count) -> {
            System.out.println("Character: " + character + ", Occurrences: " + count);
        });*/

        //or
        String input = "i love india i love food";
        Map<String, Long> mapCount = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapCount.forEach((character, count) -> System.out.println(character + ":" + count));
    }
}
