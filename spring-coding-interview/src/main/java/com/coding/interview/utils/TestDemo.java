package com.coding.interview.utils;


import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDemo {
    public static void main(String[] args) {
        /*if (System.out.printf("Hello World")==null){

        }*/
       /* int x = 5;
        if (x == 4) {
            System.out.print("Hello");
        } else {
            System.out.print("Hi");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String input = scanner.nextLine();
        StringBuilder reverseString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString.append(input.charAt(i));
        }

        if (input.equals(reverseString.toString())) {
            System.out.println("String is palindrom");
        } else {
            System.out.println("Not a palindrop");
        }

       /* String input = "apple";
        Predicate<String> isPalindrome = TestDemo::checkPalindrome;
        if (isPalindrome.test(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = normalized.length();
        return IntStream.range(0, length / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(length - i - 1));

        */
    }
}
