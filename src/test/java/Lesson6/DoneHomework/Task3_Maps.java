package Lesson6.DoneHomework;

import java.util.HashMap;
import java.util.Map;
public class Task3_Maps {
    public static void main(String[] args) {
        // Create a HashMap containing toy names and Product objects
        Map<String, Product> toyStore = new HashMap<>();
        toyStore.put("Doll", new Product("Doll"));
        toyStore.put("Car", new Product("Car"));
        toyStore.put("Blocks", new Product("Blocks"));
        toyStore.put("Puzzle", new Product("Puzzle"));
        // Print entries
        System.out.println("Entries:");
        printEntries(toyStore);
        // Print keys
        System.out.println("\nKeys:");
        printKeys(toyStore);
        // Print values
        System.out.println("\nValues:");
        printValues(toyStore);
    }
    // Method to iterate through and print entries
    public static void printEntries(Map<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    // Method to iterate through and print keys
    public static void printKeys(Map<String, Product> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
    // Method to iterate through and print values
    public static void printValues(Map<String, Product> map) {
        for (Product value : map.values()) {
            System.out.println(value);
        }
    }
}
