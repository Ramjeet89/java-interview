package com.interview.utils.javacodes;

interface Shape {
    double calculateArea();

    default void printInfo() {
        System.out.println("This is a shape");
    }

    static void printType() {
        System.out.println("This is a shape interface");
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceMethodExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.calculateArea());
        circle.printInfo();
        Shape.printType();
    }
}
