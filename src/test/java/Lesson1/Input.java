package Lesson1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);

        //Task 2
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        //Task 3
        System.out.print("Enter the side length of the square: ");
        int sideLength = scanner.nextInt();

        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }
}
