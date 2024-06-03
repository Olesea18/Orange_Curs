package Lesson5.DoneHomework;

import java.util.Scanner;

public class Task2_Temperature_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Degrees Celsius: ");
        double c = scanner.nextDouble();
        System.out.println((c*9/5) + 32);
    }
}
