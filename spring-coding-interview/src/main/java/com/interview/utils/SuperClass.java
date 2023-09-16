package com.interview.utils;

public class SuperClass {
    static void finalMethod(){
        System.out.println("Final method is supper class");
    }
}
class AnotherClass{
    void accessFinalCalss(){
        SuperClass obj = new SuperClass();
        SuperClass.finalMethod();
    }
}
