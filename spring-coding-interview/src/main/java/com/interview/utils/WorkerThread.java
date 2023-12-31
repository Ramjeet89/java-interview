package com.interview.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "(Start) message=" + message);
        processing();
        System.out.println(Thread.currentThread() + "(End) message=" + message);
    }

    private void processing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" +i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
