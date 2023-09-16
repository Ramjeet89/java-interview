package com.interview.utils.ibm;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "abc"; // Change this input string as needed
        generatePermutations(input, 0);
    }

    public static void generatePermutations(String input, int currentIndex) {
        int length = input.length();
        char[] chars = input.toCharArray();

        if (currentIndex == length - 1) {
            System.out.println(new String(chars)); // Print the permutation
        } else {
            for (int i = currentIndex; i < length; i++) {
                // Swap the current character with the character at index i
                char temp = chars[currentIndex];
                chars[currentIndex] = chars[i];
                chars[i] = temp;

                // Recursively generate permutations for the remaining characters
                generatePermutations(new String(chars), currentIndex + 1);

                // Swap back to backtrack and generate other permutations
                temp = chars[currentIndex];
                chars[currentIndex] = chars[i];
                chars[i] = temp;
            }
        }
    }
}
