package Lesson3.HomeworkDone;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender (M/F):");
        String gender = scanner.next();

        switch (gender.toUpperCase()) {
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        scanner.close();
    }
}
