package com.interview.utils.javacodes;

public class ComplexityExample {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        double pie = 3.14;
        for (int var = 0; var < n; var = var + 3) {
            System.out.println("Pie: " + pie);
            for (int j = 0; j < n; j = j + 2) {
                sum++;
                System.out.println("Sum:: " + sum);
            }
        }
    }
}
