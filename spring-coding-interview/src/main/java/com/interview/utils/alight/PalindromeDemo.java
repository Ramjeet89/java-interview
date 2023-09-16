package com.interview.utils.alight;

public class PalindromeDemo {
    public static void main(String[] args) {

        String s = "RADAR";
        StringBuilder sb = new StringBuilder(s).reverse();
        boolean isPalindrome = s.contentEquals(sb);
        if (isPalindrome) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }

        //or
        boolean isPalin = checkPalindrome(s);
        if (isPalin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    public static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
