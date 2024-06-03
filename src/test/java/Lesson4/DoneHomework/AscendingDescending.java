package Lesson4.DoneHomework;
import java.util.Arrays;

//Write a Java program to sort an array of integers in ascending and descending order
public class AscendingDescending {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 4};

        int length = array.length;
        int[] sortedArrayAsc = array.clone();

        // Iterate over the entire array until last element
        for (int i = 0; i < length - 1; i++) {
            // Iterate over each pair of elements and then decide if they are in the right order
            for (int j = 0; j < length - i - 1; j++) {
                // Swap the elements in case they are in the wrong order
                if (sortedArrayAsc[j] > sortedArrayAsc[j + 1]) {
                    int temp = sortedArrayAsc[j];
                    sortedArrayAsc[j] = sortedArrayAsc[j + 1];
                    sortedArrayAsc[j + 1] = temp;
                }
            }

        }

        // Printing array sorted in ascending order
        System.out.println("\n\nOriginal array:" + Arrays.toString(array));
        System.out.println("\nArray sorted in ascending order:" + Arrays.toString(sortedArrayAsc));


        int[] sortedArrayDsc = array.clone();

        for (int i = 0; i < length - 1; i++) {
            // Just like ascending order sort
            for (int j = 0; j < length - i - 1; j++) {
                // Just like ascending order sort, but reversed
                if (sortedArrayDsc[j] < sortedArrayDsc[j + 1]) {
                    int temp = sortedArrayDsc[j];
                    sortedArrayDsc[j] = sortedArrayDsc[j + 1];
                    sortedArrayDsc[j + 1] = temp;
                }
            }
        }

        // Printing array sorted in descending order
        System.out.println("\nArray sorted in descending order:"+Arrays.toString(sortedArrayDsc));
    }

}

