package com.Day7.Day7;

import java.util.HashMap;
import java.util.Map;

public class thraddemo {
//    static class thread1 extends Thread {
//        @Override
//        public void run() {
//            System.out.println("this is my thread1 class where im using Thread Class");
//        }
//    }
//
//    static class RunThread implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("this is my Runnabble class where im using Runnable Interface");
//        }
//    }

    public static void main(String[] args) {
//        thread1 t1 = new thread1();
//        t1.start();
//
//        RunThread r1 = new RunThread();
//        new Thread(r1).start();

//        new Thread(() -> {
//            System.out.println("this is my labda function which does not return anything but it is a threda");
//        }).start();
//    }

        thraddemo td = new thraddemo();
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "ten");
        map.put(20, "twenty");
        System.out.println(map);
    }
}
