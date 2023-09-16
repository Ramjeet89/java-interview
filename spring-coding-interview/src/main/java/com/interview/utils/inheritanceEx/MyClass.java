package com.interview.utils.inheritanceEx;

class Animal {
    void food() {
        System.out.println("Animal eat food");
    }
}

class Lion extends Animal {

}

public class MyClass {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.food();
    }
}
