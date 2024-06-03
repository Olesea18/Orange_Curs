package Lesson5.DoneHomework;

import java.util.Scanner;

public class Task3_Even_or_Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();

        if ((x % 2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
