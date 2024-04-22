package Lesson4.HomeworkDone;

import java.util.Arrays;

//Write a Java program to merge two sorted arrays into a single sorted array
public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 3, 2, 7, 9};

        //create the new array (length = array1+array2)
        int[] mergedArray = new int[array1.length + array2.length];

        //merging the two arrays by first adding the first then the second one to the merged one
        for(int i = 0; i < mergedArray.length; i++){
            if(i < array1.length){
                mergedArray[i] = array1[i];
            } else {
                mergedArray[i] = array2[i-array1.length];
            }
        }

        System.out.println("\nMerged array:" + Arrays.toString(mergedArray));

        //sorting the new array with the code from AscendingDescending
        int length = mergedArray.length;
        int[] sortedArrayAsc = mergedArray;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (sortedArrayAsc[j] > sortedArrayAsc[j + 1]) {
                    int temp = sortedArrayAsc[j];
                    sortedArrayAsc[j] = sortedArrayAsc[j + 1];
                    sortedArrayAsc[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array:" + Arrays.toString(sortedArrayAsc));
    }
}
