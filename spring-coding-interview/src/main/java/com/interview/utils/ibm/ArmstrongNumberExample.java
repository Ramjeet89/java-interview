package com.interview.utils.ibm;

public class ArmstrongNumberExample {

    public static void main(String[] args) {
         int number = 153;
        //int number = 123;  1, 153, 370, 371 and 407 are the Armstrong numbers.
        if (isArmstrong(number)) {
            System.out.println("It is armstrong");
        } else {
            System.out.println("It is not a armstrong");
        }
    }

    private static boolean isArmstrong(int number) {
        int originalNum = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digits = number % 10;
            sum += (int) Math.pow(digits, numberOfDigits);
            number /= 10;
        }
        return sum == originalNum;
    }
}
