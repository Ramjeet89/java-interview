package com.interview.utils.abstraction;

interface MyInterface11 {
    void m();
}

interface MyInterface22 {
    void m();
}

public class MyClass2 implements MyInterface11, MyInterface22 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.m();
    }

    @Override
    public void m() {
        System.out.println("in m()");
    }
}
