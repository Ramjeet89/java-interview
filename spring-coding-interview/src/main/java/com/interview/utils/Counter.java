package com.interview.utils;

public class Counter {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        final Counter counter1 = new Counter();
        Runnable r1 = counter1::increment;
        Runnable r2 = counter1::increment;
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        System.out.println(counter1.getCounter());
    }
}
