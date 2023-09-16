package com.interview.utils;

public class Database {
    // A method to store data in the database
    public synchronized void storeData(String data) {
        // Simulate storing data in the database
        System.out.println("Storing data: " + data);

        // Simulate some processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data stored: " + data);
    }
}
