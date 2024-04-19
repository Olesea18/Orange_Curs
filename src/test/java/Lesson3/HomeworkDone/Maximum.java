package Lesson3.HomeworkDone;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = Integer.compare(num1, num2);

        switch (result) {
            case 0:
                System.out.println("Both numbers are equal.");
                break;
            case 1:
                System.out.println("The maximum number is: " + num1);
                break;
            case -1:
                System.out.println("The maximum number is: " + num2);
                break;
        }

        scanner.close();
    }
}
