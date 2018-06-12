package com.company;

import java.util.Scanner;

public class ExceptionAssignment {

    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        // Prompt user for integer 1 and get user input
        System.out.print("Input integer 1: ");
        a = input.nextInt();
        // Prompt user for integer 2 and get user input
        System.out.print("Input integer 2: ");
        b = input.nextInt();

        try {
            // Detect exception in the piece of code below try
            result = a / b;
            System.out.println("\nResult = " + result);
        } catch (ArithmeticException e) {
            // Catch ArithmeticException and display message
            // to let the user know about the division of zero
            System.out.print("Division by zero. Try again next time");
        }

    }
}
