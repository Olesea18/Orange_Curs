package Lesson4;

public class SumaArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 36, 6, 9};
        suma(arr);
    }

    public static void suma(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Suma"+" "+sum);

        int [] array = {1,2,3,4,5,6};
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }

        int [] first = {5,5,4,3,1};
        int [] second = {3,5,8,10,1};

        int max = first[0];
        for (int i=1; i< first.length; i++){

            max = Math.max(max, first[i]);
        }
        System.out.println(max);

        int min = second[0];
        for (int i=1; i< second.length; i++){

            min = Math.min(min,second[i]);
        }
        System.out.println(min);

        String [] programingLanguages={"Java", "C++", "Pascal"};
        for (String i: programingLanguages){
            System.out.println(i);
        }
    }

}




