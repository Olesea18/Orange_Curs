package Lesson6.DoneHomework;

public class Task1_Arrays {
    public static void main(String[] args) {
        // Generate the  array
        int[] Array = generateArray();
    }
    // Method to generate an array of 10 integers alternating between positive and negative values
    public static int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            // If index is even, make the number positive
            // If index is odd, make the number negative
            array[i] = (i % 2 == 0) ? i + 1 : -(i + 1);
        }
        // Display the array
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }
}
