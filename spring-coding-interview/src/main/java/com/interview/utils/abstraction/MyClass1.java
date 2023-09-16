package com.interview.utils.abstraction;

interface MyInterface1 {
    void m();
}

interface MyInterface2 {
    void n();
}

public class MyClass1 implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.m();
        obj.n();
    }

    @Override
    public void m() {
        System.out.println("MyInterface1 m() calling");
    }

    @Override
    public void n() {
        System.out.println("MyInterface2 n() calling");
    }
}
