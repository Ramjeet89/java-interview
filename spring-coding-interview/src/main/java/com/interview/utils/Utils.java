package com.interview.utils;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Utils {
    public static void main(String[] args) {

        System.out.println(findDuplicateUsingFor("code decode")); //Time Complexity O(N2)
        System.out.println(findDuplicateUsingArrays("code decode")); //Time Complexity O(N) , Space Complexity = O(256)
        System.out.println(findDuplicateUsingMaps("code decode")); //Time Complexity O(N Log n)
    }

    private static Set<Character> findDuplicateUsingMaps(String str) {
        Set<Character> duplicate = new LinkedHashSet<>();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            } else {
                countMap.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate.add(entry.getKey());
            }
        }
        return duplicate;
    }

    private static Set<Character> findDuplicateUsingArrays(String str) {
        Set<Character> duplicate = new LinkedHashSet<>();
        int[] arrayForChar = new int[256];
        for (int i = 0; i < str.length(); i++) {  //O(n)
            arrayForChar[str.charAt(i)] = arrayForChar[str.charAt(i)] + 1;
        }
        for (int i = 0; i < 256; i++) { //O(n)
            if (arrayForChar[i] > 1)
                duplicate.add((char) i);
        }
        return duplicate;
    }

    private static Set<Character> findDuplicateUsingFor(String str) {
        Set<Character> duplicate = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {   //O(n)
            for (int j = i + 1; j < str.length(); j++) {   //O(n2)
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate.add(str.charAt(j));
                }
            }
        }
        return duplicate;
    }
}
