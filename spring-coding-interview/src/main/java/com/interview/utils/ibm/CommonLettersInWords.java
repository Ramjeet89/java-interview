package com.interview.utils.ibm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonLettersInWords {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("fly", "flow", "flight");
        List<Character> commonLetters = findCommonLetters(list);
        System.out.println("Common letters: " + commonLetters);
    }

    private static List<Character> findCommonLetters(List<String> list) {
        return list.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
                .stream().filter(entry -> entry.getValue() == list.size()).map(Map.Entry::getKey).toList();
    }
}
