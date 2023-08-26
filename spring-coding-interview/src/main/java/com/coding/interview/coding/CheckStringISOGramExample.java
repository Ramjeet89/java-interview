package com.coding.interview.coding;

import java.util.HashSet;
import java.util.Set;

public class CheckStringISOGramExample {

    public static void main(String[] args) {
        System.out.println(idIsogram("pen"));
    }

    static boolean idIsogram(String str) {
        boolean isogram = true;
        char[] ch = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (char c : ch) {
            if (charSet.contains(c)) {
                isogram = false;
            } else {
                charSet.add(c);
            }
        }
        return isogram;
    }
}
