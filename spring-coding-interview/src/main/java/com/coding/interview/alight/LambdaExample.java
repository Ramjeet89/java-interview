package com.coding.interview.alight;

import java.util.Date;
import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {

        //BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(4, 5);

        //BiPredicate
        BiPredicate<Integer, Integer> checkSumOfTwo = (a, b) -> a + b >= 5;
        System.out.println("som of 2 and 5 is greater then 5 " + checkSumOfTwo.test(2, 5));
        System.out.println("som of 2 and 1 is greater then 5 " + checkSumOfTwo.test(2, 1));

        //BiFunction
        BiFunction<Integer, Integer, Integer> multiplyBoth = (a, b) -> a * b;
        System.out.println("Multiplication of 5 and 10 is " + multiplyBoth.apply(5, 10));


        //Predicate
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The length of the string greater then 5:: " + checkLength.test("hello"));

        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
        System.out.println("given number is even: " + checkLength.test("Hello Java"));

        //it can be joined with and
        System.out.println("After merging with and " + checkLength.and(checkEvenLength).test("Hello world"));

        //it can be joined with or
        System.out.println("After merging with or " + checkLength.or(checkEvenLength).test("Hello world"));

        //it can be joined with negate
        System.out.println("After merging with negate " + checkLength.negate().test("Hello world"));


        //Function
        Function<Integer, Integer> doubleIt = i -> 2 * i;
        System.out.println("Double Function " + doubleIt.apply(2));

        Function<Integer, Integer> cubeIt = i -> i * i * i;
        System.out.println("Cube Function " + cubeIt.apply(2));

        System.out.println("First Doubling using apply " + doubleIt.andThen(cubeIt).apply(2));
        System.out.println("First Cube using Compose " + doubleIt.compose(cubeIt).apply(2));

        //Consume
        Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing operation and returning nothing " + i * i);
        squareMe.accept(5);

        Consumer<Integer> doubleMe = i -> System.out.println("Taking an input and performing doubling and returning nothing " + 2 * i);
        doubleMe.accept(5);
        squareMe.andThen(doubleMe).accept(5);

        //Supplier
        //or Supplier<Date> currentDate = () -> new Date();
        Supplier<Date> currentDate = Date::new;
        currentDate.get();
        System.out.println(currentDate.get());
    }
}
