package com.Day6.Day6.Day6;// Simple Calculator-
// Create a Calculator class with methods add, subtract, multiply, and divide.
// Student Rrt-
// Create a Student class with fields for name and marks in 3 subjects.
// Add a method to calculate total and average marks.
// Bank Account Class-
// Create a BankAccount class with accountNumber, holderName, and balance.
// Add a constructor to initialize these fields.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

class Report {
    String name;
    int[] marks = new int[3];
    int total;

    Report(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int total() {
        for (int m : marks)
            total += m;
        return total;
    }

    int average() {
        return total / 3;
    }
}

class BankAccounts {
    long accountNumber; // 10 digits
    String holderName;
    double balance;

    BankAccounts(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void show() {
        System.out.println(holderName + "'s account number is : " + accountNumber + " and balance is : " + balance);
    }
}

class Slide2 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Slide 2 Outputs : ");
        System.out.println("add : " + c.add(10, 20));
        System.out.println("sub : " + c.subtract(10, 20));
        System.out.println("mul : " + c.multiply(10, 20));
        System.out.println("div : " + c.divide(10, 20));

        Report s = new Report("Prateek", new int[]{64, 89, 87});
        System.out.println(s.name + "'s total marks are : " + s.total());
        System.out.println(s.name + "'s total marks are : " + s.average());

        BankAccounts b = new BankAccounts(1001102510, "Prateek Srivastava", 20536.35);
        b.show();
    }
}