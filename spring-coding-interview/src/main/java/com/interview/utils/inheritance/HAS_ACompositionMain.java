package com.interview.utils.inheritance;


class Engine {
    void start() {
        System.out.println("Engine started...!!");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car Started...");
    }
}


public class HAS_ACompositionMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
