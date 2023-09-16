package com.interview.utils.alight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class WordLengthExample {
    public static void main(String[] args) {

        String s = "this a is java interview";

        Stream<String> words1 = Arrays.stream(s.split(" "));
        Optional<Integer> smallestLength = words1.map(String::length).min(Comparator.naturalOrder());
        smallestLength.ifPresent(smallest -> System.out.println("Smallest word length: " + smallest));

        Stream<String> words2 = Arrays.stream(s.split(" "));
        Optional<Integer> largestLength = words2.map(String::length).max(Comparator.naturalOrder());
        largestLength.ifPresent(largest -> System.out.println("Largest word length: " + largest));
    }
}

