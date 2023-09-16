package com.interview.utils;

public class DatabaseTest {
    public static void main(String[] args) {
        // Create the shared database instance
        Database database = new Database();

        // Create and start the first thread
        Thread thread1 = new Thread(() -> {
            database.storeData("Thread 1 data");
        });

        // Create and start the second thread
        Thread thread2 = new Thread(() -> {
            database.storeData("Thread 2 data");
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
