package com.interview.utils.abstraction;

interface MyInterface111 {
    void m1();

    void m2();
}

 abstract class MyAbstractClass implements MyInterface111 {
    @Override
    public void m1() {
        System.out.println("In m1()");
    }

    /* @Override
     public void m2() {

     }*/
 }

public class MyClass3 extends MyAbstractClass {
    @Override
    public void m2() {
        System.out.println("In m2()");
    }
}
