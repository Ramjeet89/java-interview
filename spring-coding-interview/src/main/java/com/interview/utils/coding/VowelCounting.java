package com.interview.utils.coding;


import java.util.HashMap;
import java.util.Map;

public class VowelCounting {
    public static void main(String[] args) {
      /*  String str = "IloveIndia";
        long vowelCount = str.chars().mapToObj(c -> (char) c).filter(c -> "AEIOUaeiou".indexOf(c) > 0).count();
        System.out.println(vowelCount);

        String inputString = "Hello, how are you?";
        long vowelCount1 = countVowels(inputString);
        System.out.println("Number of vowel letters: " + vowelCount1);
*/

        String inputString = "Hello, how are you?";
        Map<Character, Long> vowelCounts = countVowels(inputString);

        for (Map.Entry<Character, Long> entry : vowelCounts.entrySet()) {
            System.out.println("Vowel: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static Map<Character, Long> countVowels(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .collect(
                        HashMap::new,
                        (map, c) -> map.merge(c, 1L, Long::sum),
                        HashMap::putAll
                );
    }
  /*  public static long countVowels(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }*/
}
