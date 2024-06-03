package Lesson5.DoneHomework;

public class Task1_Substraction {

    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        System.out.println(countSubtractions(x, y));
    }
    public static int countSubtractions(int x, int y) {
        if (y == 0) {
            System.out.println("Second number cannot be zero.");
        }
        int count = 0;
        int rest = x;
        while (rest >= y) {
            rest -= y;
            count++;
        }
        return count;
    }
}
