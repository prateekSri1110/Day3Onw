package com.Day7.Day7;

import java.util.*;

// Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
// Threads should be synced to print output one by one.
class syncedTable {
    static boolean isTurn = false;

    synchronized void TableOf2() {
        for (int i = 1; i <= 10; i++) {
            while (isTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(2 + " * " + i + " = " + 2 * i);
            isTurn = true;
            notify();
        }
    }

    synchronized void TableOf4() {
        for (int i = 1; i <= 10; i++) {
            while (!isTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(4 + " * " + i + " = " + 4 * i);
            isTurn = false;
            notify();
        }
    }
}

public class Question3 {
    // Find the First Non-Repeating Character
    char NonRepeatingChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> k : freq.entrySet()) if (k.getValue() == 1) return k.getKey();

        return '-';
    }

    // Given an array of integers and a target sum, return the indices of the two numbers that add up to the target
    int[] indices(int[] arr, int target) {
        Map<Integer, Integer> leftval = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int req = target - arr[i];
            if (leftval.containsKey(req)) return new int[]{leftval.get(req), i};
            leftval.put(arr[i], i);
            System.out.println(leftval);
        }
        return new int[2];
    }

    // You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list
    List<Integer> sorted(List<Integer> list1, List<Integer> list2) {
        List<Integer> resList = new ArrayList<>();

        int i = 0, j = 0;
        int m = list1.size(), n = list2.size();

        while (i < m && j < n) {
            if (list1.get(i) <= list2.get(j)) {
                resList.add(list1.get(i));
                i++;
            } else {
                resList.add(list2.get(j));
                j++;
            }
        }

        while (i < m) {
            resList.add(list1.get(i));
            i++;
        }

        while (j < n) {
            resList.add(list2.get(j));
            j++;
        }

        return resList;
    }

    public static void main(String[] args) {
        Question3 q = new Question3();

        // Q3
        System.out.println(q.NonRepeatingChar("prateek"));
        System.out.println(q.NonRepeatingChar("racecar"));
        System.out.println(q.NonRepeatingChar("applla"));
        // Q4
        System.out.println("Index of 2 nums sum to target are : " + Arrays.toString(q.indices(new int[]{5, 4, 2, 6, 7}, 10)));
        // Q5
        System.out.println(q.sorted(new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8)), new ArrayList<>(Arrays.asList(1, 3, 4, 5, 9))));
        // Q6
        syncedTable s = new syncedTable();
        new Thread(() -> s.TableOf2()).start();
        new Thread(() -> s.TableOf4()).start();
    }
}
