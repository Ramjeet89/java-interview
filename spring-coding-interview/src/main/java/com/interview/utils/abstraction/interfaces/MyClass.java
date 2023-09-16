package com.interview.utils.abstraction.interfaces;

interface Animals {
    void habitat();

    void food();
}

class Lion implements Animals {

    @Override
    public void habitat() {
        System.out.println("Habitat of Lion is land");
    }

    @Override
    public void food() {
        System.out.println("Lion eat - flesh");
    }
}

class Whale implements Animals {

    @Override
    public void habitat() {
        System.out.println("Habitat of Whale is water");
    }

    @Override
    public void food() {
        System.out.println("Whale eat - aquatic animals");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Animals lion = new Lion();
        lion.food();
        lion.habitat();

        System.out.println("=================");

        Animals whale = new Whale();
        whale.habitat();
        whale.food();
    }
}
