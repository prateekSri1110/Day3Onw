// Mini Banking Application -
// Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
// Add exception handling for invalid amounts and overdrafts.
// Keep track of total accounts using a static variable.
// Employee Management System -
// Create an Employee class (POJO).
// Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
// Override a method to calculate salary differently for each.
// Use polymorphism to call methods on a list of employees.
// Product Catalog (with Encapsulation & Exceptions) -
// Create a Product class with private fields for id, name, and price.
// Throw a custom exception if price is negative.
// Create 3–5 product objects and display their details.

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

class BankAccount {
    private double Balance;

    BankAccount(double Balance) {
        this.Balance = Balance;
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

public class Slide8 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(0);

        acc.deposit(10000);
        System.out.println(acc.getBalance());
    }
}
