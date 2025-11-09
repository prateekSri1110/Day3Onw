package com.Day6.Day6.Day6;

//Customer POJO
//Create a Customer class with id, name, email.
//Create 3 objects and print their details using a list.

import java.util.ArrayList;
import java.util.List;

class Customer {
    int id;
    String name, email;

    Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class Slide6 {
    public static void main(String[] args) {
        Customer c1 = new Customer(100, "Prateek", "prateek@cloudkeeper.com");
        Customer c2 = new Customer(101, "abc", "abc@cloudkeeper.com");
        Customer c3 = new Customer(102, "xyz", "xyz@cloudkeeper.com");

        List<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println("Slide 6 Outputs :");
        for (Customer c : list) System.out.println(c.id + " " + c.name + " " + c.email);

    }
}
