package com.interview.utils.javacodes;

public class PalindromeExample {
    public static void main(String[] args) {

        String input = "RADAR";
        boolean isPalindrome = (checkPalindrome(input));
        if (isPalindrome) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("It is not a palindrome ");
        }
    }

    private static boolean checkPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
