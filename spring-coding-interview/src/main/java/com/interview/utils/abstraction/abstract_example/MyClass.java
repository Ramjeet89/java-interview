package com.interview.utils.abstraction.abstract_example;

abstract class MyAbstractClass{
    abstract void  m();

    void n(){
        System.out.println("MyAbstractClass -Concreat  n()");
    }

}
public class MyClass extends MyAbstractClass {
    @Override
    void m() {
        System.out.println("MyClass - m()");
    }

    public static void main(String[] args) {
        MyAbstractClass obj = new MyClass();
        obj.m();
        obj.n();
    }
}
