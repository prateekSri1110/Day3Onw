package com.Day6.Day6.Day6;// package Day6;

// Sum of Digits - Accept a number and find the sum of all its digits. E.g. 1234 → 10 (1+2+3+4)
// Multiplication Table - Print the multiplication table for any number entered by the user.
// Factorial Calculator - Calculate the factorial of a number using a for loop.
// Reverse a Number - Reverse the digits of an integer using a while loop.

public class Slide1 {
    int SumofDigits(int num) {
        int sum = 0, carry = 0;
        while (num > 0) {
            carry = num % 10;
            sum += carry;
            num /= 10;
        }
        return sum;
    }

    void multiplication(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    int factorial(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    int reverseNum(int num) {
        StringBuilder numString = new StringBuilder().append(Integer.toString(num));
        int i = 0, j = numString.length() - 1;
        while (i <= j) {
            char temp = numString.charAt(i);
            numString.setCharAt(i, numString.charAt(j));
            numString.setCharAt(j, temp);
            i++;
            j--;
        }
        return Integer.parseInt(String.valueOf(numString));
    }

    public static void main(String[] args) {
        Slide1 v = new Slide1();
        System.out.println("Slide 1 Outputs : ");
        System.out.println("sum of dig : " + v.SumofDigits(1234));
        v.multiplication(5);
        System.out.println("factorial : " + v.factorial(7));
        System.out.println("reverse of num is :" + v.reverseNum(1234));
    }
}