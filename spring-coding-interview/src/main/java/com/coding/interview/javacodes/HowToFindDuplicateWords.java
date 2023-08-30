package com.coding.interview.javacodes;

import java.util.*;

public class HowToFindDuplicateWords {
    public static void main(String[] args) {
        String input = "Alive is Awesome. Be in present. Manchester United is also known as RedDevil";
        input = input.toLowerCase();
        String[] strArray = input.split(" ");
        List<String> listOfWords = Arrays.asList(strArray);
        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for (String words : uniqueWords) {
            if (Collections.frequency(listOfWords, words) > 1) {
                System.out.println("" + words + "");
            }
        }

        //List<String> word = List.of("Alive is Awesome. Be in present. Manchester United is also known as RedDevil");
        String[] sentences = input.split(" ");
        List<String> sentenceList = Arrays.asList(sentences);
        Set<String> set = new HashSet<>();
        sentenceList.stream().filter(w -> !set.add(w)).forEach(System.out::println);

    }
}
