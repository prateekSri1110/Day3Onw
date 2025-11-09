package com.Day6.Day6.Day6;// Mini Banking Application -
// Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
// Add exception handling for invalid amounts and overdrafts.
// Keep track of total accounts using a static variable.

import java.util.ArrayList;
import java.util.List;

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class OverdraftsException extends Exception {
    OverdraftsException(String msg) {
        super(msg);
    }
}

class BankApp {
    private double Balance;
    static int totalAccount = 0;

    BankApp(double Balance) {
        this.Balance = Balance;
        totalAccount++;
    }

    void deposit(int amount) {
        try {
            if (amount > 0)
                Balance += amount;
            else
                throw new InvalidAmountException("Amount entered is incorrect or negaive!");
        } catch (InvalidAmountException e) {
            System.out.println("Error : " + e);
        }
    }

    void withdraw(int amount) {
        try {
            if (amount <= Balance)
                Balance -= amount;
            else
                throw new OverdraftsException("Amount balance is insufficient for the transaction!");
        } catch (OverdraftsException e) {
            System.out.println("Error : " + e);
        }
    }

    double getBalance() {
        return Balance;
    }
}

// Employee Management System -
// Create an Employee class (POJO).
// Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
// Override a method to calculate salary differently for each.
// Use polymorphism to call methods on a list of employees.

class Employee {
    private double salary;
    double taxPercent = 7.5;

    Employee(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    double getSalary() {
        double salary = super.getSalary();
        return salary - ((salary * taxPercent) / 100);
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    double getSalary() {
        double salary = super.getSalary() / 2;
        return salary - ((salary * taxPercent) / 100);
    }
}


// Product Catalog (with Encapsulation & Exceptions) -
// Create a Product class with private fields for id, name, and price.
// Throw a custom exception if price is negative.
// Create 3–5 product objects and display their details.

class InvalidPrice extends Exception {
    InvalidPrice(String msg) {
        super(msg);
    }
}

class ProductCatalog {
    private int id;
    private String name;
    private double price;

    ProductCatalog(int id, String name, double price) {
        if (price < 0) {
            try {
                throw new InvalidPrice("Price cannot be negative!");
            } catch (InvalidPrice ex) {
                throw new RuntimeException(ex);
            }
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}

public class Slide7 {
    public static void main(String[] args) {
        BankApp acc1 = new BankApp(0);
        BankApp acc2 = new BankApp(100);
        BankApp acc3 = new BankApp(500);
        BankApp acc4 = new BankApp(1000);

        System.out.println("Slide 7 Outputs :\n");

        acc1.deposit(10000);
        System.out.println(acc1.getBalance());
        System.out.println("Total Accounts in Bank : " + BankApp.totalAccount);

        List<Employee> empList = new ArrayList<>();
        empList.add(new FullTimeEmployee(15000));
        empList.add(new PartTimeEmployee(15000));

        for (Employee e : empList) System.out.println(e.getClass().getSimpleName() + "'s salary is : " + e.getSalary());

        List<ProductCatalog> prodList = new ArrayList<>();
        prodList.add(new ProductCatalog(101, "IPhone", 68500));
        prodList.add(new ProductCatalog(102, "Watch", 40600));
        prodList.add(new ProductCatalog(103, "Laptop", 119000));
        prodList.add(new ProductCatalog(104, "Headphone", 12000));
        prodList.add(new ProductCatalog(105, "Earpods", 24900));

        System.out.println("\nProduct List :");
        for (ProductCatalog prod : prodList)
            System.out.println("Id : " + prod.getId() + ", Product name : " + prod.getName() + ", Price : " + prod.getPrice());
    }
}
