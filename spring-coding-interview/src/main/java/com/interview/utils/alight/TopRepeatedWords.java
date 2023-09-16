package com.interview.utils.alight;

import java.util.*;
import java.util.stream.Collectors;

public class TopRepeatedWords {
    public static void main(String[] args) {
        String s = "ram is working in abc company, ram is from bangalore, ram is good in algorithm";
        // Tokenize the string into words
        String[] words = s.toLowerCase().split("\\W+");

        // Create a map to store word occurrences
        Map<String, Long> wordOccurrences = Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        // Sort the words based on occurrences in descending order
        List<String> sortedWords = wordOccurrences.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .toList();

        // Print the top three repeated words
        System.out.println("Top 3 repeated words:");
        for (int i = 0; i < Math.min(3, sortedWords.size()); i++) {
            String word = sortedWords.get(i);
            long occurrences = wordOccurrences.get(word);
            System.out.println("Word: " + word + ", Occurrences: " + occurrences);
        }
    }
}
