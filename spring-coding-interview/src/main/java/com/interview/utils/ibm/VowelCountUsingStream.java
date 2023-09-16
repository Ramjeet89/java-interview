package com.interview.utils.ibm;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelCountUsingStream {
    public static void main(String[] args) {
        String str = "ramjeet";
        str = str.toLowerCase();
        String vowels = "aeiou";

        Map<Character, Long> vowelCounts = str.chars().mapToObj(ch -> (char) ch).filter(c -> vowels.contains(String.valueOf(c)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //printing
        vowelCounts.forEach((vowel, count) -> System.out.println(vowel + ": " + count));
    }
}
