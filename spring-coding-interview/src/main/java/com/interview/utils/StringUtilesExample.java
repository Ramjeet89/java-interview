package com.interview.utils;

public class StringUtilesExample {
    public static void main(String[] args) {
        String originalString = new String("code"); // ['c','o','d','e'] count =4, offset 0
        String subString = originalString.substring(1, 3).intern();//od
        originalString = null;
        System.out.println(subString);
    }
}
