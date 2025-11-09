package com.Day6.Day6.Day6;// Parameterized Constructor -
// Create a Book class with fields title, author, and price.
// Initialize them using a parameterized constructor.
// Constructor Overloading -
//  Create a Car class with overloaded constructors — one that sets only the model name and another that sets model and price.

class Book {
    String title, author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void details() {
        System.out.println(" -  Book Details  -  \nTitle : " + title + "\nAuthor : " + author + "\nPrice : " + price);
    }
}

class Car {
    String modelName;
    int model, price;

    Car() {
    }

    Car(String modelName) {
        this.modelName = modelName;
    }

    Car(int model, int price) {
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println(
                " -  Car Details  -  \nModel Name : " + modelName + "\nModel : " + model + "\nPrice : " + price);
    }
}

public class Slide5 {
    public static void main(String[] args) {
        Book b = new Book("Life of Pappu!", "Prateek Srivastava", 420);
        System.out.println("Slide 4 Outputs : ");
        
        b.details();
        Car c1 = new Car("BMW M5");
        Car c2 = new Car(2023, 21300000);
        Car c3 = new Car();
        c1.show();
        c2.show();
        c3.show();
    }
}
