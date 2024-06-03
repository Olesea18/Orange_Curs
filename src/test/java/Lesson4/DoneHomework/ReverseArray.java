package Lesson4.DoneHomework;
import java.util.Arrays;

//Write a Java program to reverse an array of integers
public class ReverseArray {

        public static void main(String[] args) {

            int[] array = {1, 5, 3, 2, 4};

            int length = array.length;
            int[] revArray = new int[length];

            for (int i = 0; i < length; i++) {
                // Add the elements to secondary Array in reverse order
                revArray[length - (i + 1)] = array[i];
            }

            System.out.println("Original array:" + Arrays.toString(array));
            System.out.println("\nReversed array:" + Arrays.toString(revArray));
        }
}
