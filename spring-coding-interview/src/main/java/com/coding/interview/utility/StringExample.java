package com.coding.interview.utility;

public class StringExample {
    public static void main(String[] args) {
        String name = "Shabbir";
        String anotherName= "Shabbir";
        String thirdName = new String("Shabbir");
        System.out.println(name==anotherName);
        System.out.println(name==thirdName);
        System.out.println(name.equals(anotherName));
    }
}
