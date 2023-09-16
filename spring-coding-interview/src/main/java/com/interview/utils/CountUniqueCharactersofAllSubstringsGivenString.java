package com.interview.utils;

import java.util.stream.IntStream;

public class CountUniqueCharactersofAllSubstringsGivenString {
    public static void main(String[] args) {
        String s = "ABC";
        int result = countSubstringsUniqueChars(s);
        System.out.println(result);
    }

    public static int countUniqueChars(String s) {
        return (int) s.chars()
                .distinct()
                .count();
    }

    public static int countSubstringsUniqueChars(String s) {
        return IntStream.range(0, s.length())
                .flatMap(i -> IntStream.rangeClosed(i, s.length())
                        .map(j -> countUniqueChars(s.substring(i, j))))
                .sum();
    }
}
