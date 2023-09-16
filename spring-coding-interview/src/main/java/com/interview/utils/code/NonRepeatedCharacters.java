package com.interview.utils.code;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonRepeatedCharacters {
    public static void main(String[] args) {
        String s = "I love india I love food";
        Optional<Character> firstNonRepeated = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstNonRepeated.isPresent()) {
            System.out.println("First non-repeated character: " + firstNonRepeated.get());
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
