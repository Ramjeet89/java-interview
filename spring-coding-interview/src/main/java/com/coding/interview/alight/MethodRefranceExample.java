package com.coding.interview.alight;

public class MethodRefranceExample {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = Test::testImplementation;
        functionalInterfaceExample.singleAbstractMethod();

        //or
        FunctionalInterfaceExample f = () -> System.out.println("implementation of single abstract method");
        f.singleAbstractMethod();
    }
}

class Test {
    public static void testImplementation() {
        System.out.println("This is test implementation of your abstract method");
    }
}
