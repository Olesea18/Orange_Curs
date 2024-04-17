package Lesson2.DoneHomework;

public class StringOperations {
    public static void main(String[] args) {

        String phrase = "I love Java";

        char letterAtIndex4 = phrase.charAt(4);
        System.out.println("Letter at index 4: " + letterAtIndex4);

        int indexOfJ = phrase.indexOf('J');
        System.out.println("Index of 'J': " + indexOfJ);

        String newPhrase = phrase + " and QA Automation";
        System.out.println("New phrase: " + newPhrase);

        boolean isString = phrase instanceof String;
        System.out.println("Is phrase a String? " + isString);
    }
}
