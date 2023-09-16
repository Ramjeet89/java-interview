package com.interview.utils.abstraction;

interface MyInterface {
    int i = 2;

    void m1();

    void m2();
}


public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyInterface myInterface = new MyClass();
        myInterface.m1();
        myInterface.m2();
        System.out.println("myInterface of i: " + i);
    }

    @Override
    public void m1() {
        System.out.println("M1() calling");
    }

    @Override
    public void m2() {
        System.out.println("M2() calling");
    }
}
