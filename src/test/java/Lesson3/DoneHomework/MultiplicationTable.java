package Lesson3.DoneHomework;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Multiplication Table for " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
