package com.coding.interview.coding;

import java.util.stream.IntStream;

public class FindnThElementsInFebonacciSericeUSingRecursion {

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println(isPrime(17));
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

   /* public static boolean isPrime(int number){
        boolean isDivisible = false;
        for(int i=2;i<number;i++){
            if(number%2==0){
                isDivisible = true;
                break;
            }
        }
        return number>1 && !isDivisible;
    }*/
   public static boolean isPrime(int number) {
       return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
   }
}
