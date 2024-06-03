package Lesson4.DoneHomework;

import java.util.Arrays;

//Write a Java program to search for a specific element in an array and return its index.
public class Index {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 2, 4};
        int search = 3;

        System.out.println("\n\nArray to search in:" + Arrays.toString(array));
        System.out.println("\nNumber to find:" + search);

        //go over the entire array
        for (int i = 0; i < array.length; i++) {
            //compare current element in array with element we search
            if (array[i] == search) {

                System.out.println("\nIndex of element:" + i);
                }
        }
    }

}
