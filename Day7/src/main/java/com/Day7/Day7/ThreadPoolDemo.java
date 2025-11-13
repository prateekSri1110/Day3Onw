package com.Day7.Day7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class process1 {
    int count = 0;

    void incr() {
        count++;
    }

    void getCount() {
        System.out.println(count);
    }
}

public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService tp = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int tId = i;
            tp.execute(() -> {
                try {
                    Thread.sleep(500);
                    System.out.println("this is task " + tId + " and thread is " + Thread.currentThread().getName());
//                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task " + tId + " completed!");
            });
        }

        tp.shutdown();


//        new Thread(() -> {
//            int count = 0;
//            for (int i = 0; i < 10; i++) count++;
//        }).start();
//
//
//        process1 p = new process1();
//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 5; i++)
//                p.incr();
//
//            throw new RuntimeException("z");
//            //p.getCount();
//        });
//
//        t.start();
//
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        FutureTask<String> ft = new FutureTask<>(() -> {
//
//            throw new RuntimeException("Hello World");
//            //return "Hello World";
//        });
//
//        new Thread(ft).start();
//
//        try {
//            String s = ft.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
    }
}
