package Lesson4.HomeworkDone;

import java.util.Arrays;

//Write a Java program to calculate the average of all elements in an integer array
public class Average {

        public static void main(String[] args) {

            int[] array = {1, 5, 3, 2, 4};

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            // Printing average of the array
            System.out.println("\n\nOriginal array:" + Arrays.toString(array));
            System.out.println("\nAverage of array:" +  sum / array.length);

        }
}

