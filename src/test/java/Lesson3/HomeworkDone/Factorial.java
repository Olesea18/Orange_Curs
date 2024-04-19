package Lesson3.HomeworkDone;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }
}
