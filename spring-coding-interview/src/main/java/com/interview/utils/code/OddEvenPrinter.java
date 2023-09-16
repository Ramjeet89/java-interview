package com.interview.utils.code;

public class OddEvenPrinter {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Runnable oddTask = () -> {
            synchronized (lock) {
                while (count <= MAX_COUNT) {
                    if (count % 2 != 0) {
                        System.out.println("Odd: " + count);
                        count++;
                        lock.notify(); // Notify the waiting thread (evenThread)
                    } else {
                        try {
                            lock.wait(); // Wait for evenThread to notify
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Runnable evenTask = () -> {
            synchronized (lock) {
                while (count <= MAX_COUNT) {
                    if (count % 2 == 0) {
                        System.out.println("Even: " + count);
                        count++;
                        lock.notify(); // Notify the waiting thread (oddThread)
                    } else {
                        try {
                            lock.wait(); // Wait for oddThread to notify
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Thread oddThread = new Thread(oddTask);
        Thread evenThread = new Thread(evenTask);

        oddThread.start();
        evenThread.start();
    }
}
