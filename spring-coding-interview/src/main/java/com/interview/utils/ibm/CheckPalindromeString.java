package com.interview.utils.ibm;

import java.util.ArrayList;

public class CheckPalindromeString {
    public static void main(String[] args) {
       /* String str = "RADAR", reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }*/

        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);
        languages.stream().map(String::toUpperCase).forEach(System.out::println);
        languages.replaceAll(String::toLowerCase);
        System.out.println("All uppercase: " + languages);

    }
}
