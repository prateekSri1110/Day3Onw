package com.Day6.Day6.Day6;// Static Counter -
// Create a class where every time an object is created, a static counter increases.
// Print how many objects have been created.
// Static Utility Class - 
// Create a MathUtils class with static methods for max, min, and average.
// Call these without creating an object.

class Counter {
    static int objCounter = 0;

    Counter() {
        objCounter++;
    }

    static void show() {
        System.out.println("Total objects created for the class are : " + objCounter);
    }
}

class MathUtils {
    static int max(int m, int n) {
        return (m >= n) ? m : n;
    }

    static int min(int m, int n) {
        return (m <= n) ? m : n;
    }

    static int avg(int m, int n) {
        return (m + n) / 2;
    }
}

public class Slide3 {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();

        System.out.println("Slide 3 Outputs :");

        Counter.show();

        System.out.println("max : " + MathUtils.max(10, 20));
        System.out.println("min : " + MathUtils.min(10, 20));
        System.out.println("avg : " + MathUtils.avg(10, 20));
    }
}
