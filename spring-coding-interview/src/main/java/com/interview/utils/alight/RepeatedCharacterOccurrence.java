package com.interview.utils.alight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacterOccurrence {
    public static void main(String[] args) {
        String s = "I love india I love food";

        Map<String, Long> occ = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        occ.entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(entry -> System.out.println("Char: " + entry.getKey() + ", Occu: " + entry.getValue()));

        System.out.println("====================other way==============================");
        List<String> strList = Arrays.asList("a", "b", "c", "a", "b", "d");
        Map<String, Long> characterOccurrences = strList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        characterOccurrences.entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(entry -> {
                    System.out.println("Character: " + entry.getKey() + ", Occurrences: " + entry.getValue());
                });
    }
}
