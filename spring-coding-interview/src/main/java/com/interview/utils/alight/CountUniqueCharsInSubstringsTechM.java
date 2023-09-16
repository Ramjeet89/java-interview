package com.interview.utils.alight;

import java.util.HashSet;
import java.util.Set;

/*
Count Unique Characters of All Substrings of a Given String


Let's define a function countUniqueChars(s) that returns the number of unique characters in s.

For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
Given a string s, return the sum of countUniqueChars(t) where t is a substring of s. The test cases are generated such that the answer fits in a 32-bit integer.

Notice that some substrings can be repeated so in this case you have to count the repeated ones too.



Example 1:

Input: s = "ABC"
Output: 10
Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
Every substring is composed with only unique letters.
Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
Example 2:

Input: s = "ABA"
Output: 8
Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
Example 3:

Input: s = "LEETCODE"
Output: 92


Constraints:

1 <= s.length <= 105
s consists of uppercase English letters only.
 */
public class CountUniqueCharsInSubstringsTechM {
    public static void main(String[] args) {
        // Test cases
        System.out.println(countUniqueChars("ABC"));       // Output: 10
        System.out.println(countUniqueChars("ABA"));       // Output: 8
        System.out.println(countUniqueChars("LEETCODE"));  // Output: 92
       // System.out.println(countUniqueChars("A"));
        //System.out.println(countUniqueChars("B"));
    }

    private static int countUniqueChars(String str) {
        int result = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int j = i; j < n; j++) {
                uniqueChars.add(str.charAt(j));
                result += uniqueChars.size();
            }
        }
        return result;
    }
}
