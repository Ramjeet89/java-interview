package com.coding.interview.code;

public class StreamApiExample {
    public static void main(String[] args) {
        String x = new String("ab");
        change(x);
        System.out.println(x);
    }

    private static void change(String x) {
        x = "cd";
    }
}
