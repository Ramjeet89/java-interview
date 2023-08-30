package com.coding.interview.javacodes;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfEachCharacter {
    public static void main(String[] args) {
      //  String str = "I love india";
    /*    Map<String, Long> occurnceOfEachChar = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        occurnceOfEachChar.forEach((ch, count) -> System.out.print(ch + ":" + count));
*/
        String input = "I love india I love food";
        Map<Character, Long> characterCount = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),//c->c
                        Collectors.counting()
                ));
        characterCount.forEach((character, count) -> System.out.println("'" + character + "' occurs " + count + " times."));

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = str1 + str2; // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
        str1 = str1.substring(str2.length()); // Extract original str2

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}

