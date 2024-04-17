package Lesson2.DoneHomework;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");

        double sum = 0;
        int count = 5;

        for (int i = 0; i < count; i++) {
            double number = scanner.nextDouble();
            sum += number;
        }

        double average = sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
    }
