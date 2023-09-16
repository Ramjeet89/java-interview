package com.interview.utils.ibm;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abac"; // Change the input string as needed

        // Remove the last character
        String withoutLastChar = removeLastCharacter(s);

        // Check if the resulting string is a palindrome
        boolean isPalindrome = isPalindrome(withoutLastChar);

        if (isPalindrome) {
            System.out.println(s + " is a palindrome after removing the last character.");
        } else {
            System.out.println(s + " is not a palindrome after removing the last character.");
        }
    }

    public static String removeLastCharacter(String s) {
        if (s != null && s.length() > 0) {
            return s.substring(0, s.length() - 1);
        }
        return s; // Return the original string if it's empty or null
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false; // Null strings are not palindromes
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Characters don't match, so it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }
}
