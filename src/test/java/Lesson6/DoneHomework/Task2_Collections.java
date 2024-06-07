package Lesson6.DoneHomework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Task2_Collections {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a set of numbers
        System.out.println("Enter a set of numbers separated by commas:");
        String input = scanner.nextLine();
        // Validate the input
        if (!isValidInput(input)) {
            System.out.println("Invalid input. Please enter numbers separated by commas without other characters.");
            // Close the scanner
            scanner.close();
            return;
        }
        // Split the input string into an array of numbers
        String[] numbers = input.split(",");
        // Create a Set to store unique numbers
        Set<String> uniqueNumbers = new HashSet<>();
        // Add each number to the Set (duplicates will be ignored automatically)
        for (String number : numbers) {
            uniqueNumbers.add(number.trim());
        }
        // Display the unique numbers
        System.out.println("Unique numbers: " + uniqueNumbers);
        // Close the scanner
        scanner.close();
    }
    // Method to validate the input
    public static boolean isValidInput(String input) {
        // Iterate through each character of the input
        for (char c : input.toCharArray()) {
            // Check if the character is not a digit or a comma
            if (!Character.isDigit(c) && c != ',') {
                return false; // Invalid input
            }
        }
        return true; // Valid input
    }
}
