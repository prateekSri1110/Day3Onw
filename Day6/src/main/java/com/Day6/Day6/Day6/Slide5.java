package com.Day6.Day6.Day6;// EXCEPTION HANDLING
// Division with Exception -
// Accept two integers from user and divide them.
// Handle division by zero using try-catch.
// Print “Division completed” in a finally block.
// Nested try-catch -
// Write a program where an inner try block may throw ArithmeticException,
//  and an outer try block may throw ArrayIndexOutOfBoundsException.
// Handle both appropriately.
// Exception Propagation (Method Chain) - 
// Write three methods (m1(), m2(), m3()):
// m1() calls m2(), and m2() calls m3().
// m3() divides by zero.
//  Observe how the exception propagates up the chain and catch it in m1().
// Re-throw Exception - 
//  Catch an exception inside a try-catch block, print a message,
//  then re-throw it to be handled by another catch block at a higher level.
// Custom Exception: InvalidEmailException - 
// Validate an email string.
// Throw InvalidEmailException if it doesn’t contain an “@” symbol.

class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class Slide5 {
    void DivByZero(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("Division completed!");
        }
    }

    void NestedTC(int a, int b) {
        try {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Inner Error : " + e);
            }
            int arr[] = {1, 2, 3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Error : " + e);
        }
    }

    void m1(int a) {
        try {
            m2(a);
        } catch (ArithmeticException e) {
            System.out.println("method chain Error : " + e);
        }
    }

    void m2(int a) {
        m3(a);
    }

    int m3(int a) {
        return a / 0;
    }

    void customException(String email) throws InvalidEmailException {
        try {
            if (email.contains("@"))
                System.out.println("Email : " + email);
            else
                throw new InvalidEmailException("Email is Incorrect!");
        } catch (InvalidEmailException e) {
            System.out.println("Error : " + e);
        }
    }

    public static void main(String[] args) throws InvalidEmailException {
        Slide5 s = new Slide5();

        System.out.println("Slide 5 Outputs :");

        s.DivByZero(10, 2);
        s.NestedTC(10, 2);

        s.m1(5);

        s.customException("prateek.sri@gmail.com");
    }
}
