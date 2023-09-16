package com.interview.utils.ust;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

Declare collection of Strings

Use stream API

Remove everything that starts with ‘C’

convert to uppercase

sort

print
 */
public class StreamExample {
    public static void main(String[] args) {
        String str = "abac";

        List<Character> list = str.chars()       // Get an IntStream of characters
                .mapToObj(c -> (char) c)        // Convert each int to a character
                .toList();

        List<Character> value = list.stream().filter(s -> !s.toString().startsWith("c")).sorted().toList();
        System.out.println(value);

        List<String> values = Arrays.asList("go work", "have fun", "cdo well", "hello");
        values.stream().filter(s -> !s.startsWith("c")).sorted().map(String::toUpperCase).forEach(System.out::println);
    }

}
