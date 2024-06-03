package Lesson4.DoneHomework;

import java.util.Arrays;

//Write a Java program to find the intersection of two arrays (common elements).
public class Intersection {

        public static void main(String[] args) {

            int[] array1 = {1, 5, 3, 2, 4};
            int[] array2 = {0, 3, 7, 2, 9};
            int commonCount = 0;

            // Count common elements
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        commonCount++;
                    }
                }
            }

            // Create array to store common elements
            int[] commonElements = new int[commonCount];
            int index = 0;

            // Store common elements
            for (int ii = 0; ii < array1.length; ii++) {
                for (int jj = 0; jj < array2.length; jj++) {
                    if (array1[ii] == array2[jj]) {
                        commonElements[index++] = array1[ii];
                        break; // exit the inner loop once a common element is found
                    }
                }
            }

            // Print the two arrays and their common elements
            System.out.println("\n\nArray 1:" + Arrays.toString(array1));
            System.out.println("\nArray 2:" + Arrays.toString(array2));
            System.out.println("\nCommon elements:" + Arrays.toString(commonElements));

        }
}



