package Lesson3.DoneHomework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");
        System.out.println("Available operations:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        System.out.println("Enter the number of the operation you want to perform:");
        int operation = scanner.nextInt();

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case 1: // Addition
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2: // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3: // Multiplication
                System.out.println("Result: " +  (num1 * num2));
                break;
            case 4: // Division
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " +  (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operation selection.");
        }

        scanner.close();

    }
}
