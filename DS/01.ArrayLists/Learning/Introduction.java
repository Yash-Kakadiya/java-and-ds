/*
 * Introduction to ArrayLists in Java
 * JCF - Java Collections Framework
 * ArrayList is linear data structure that stores elements in a dynamic array
 * Array vs ArrayList
 * - Size: Array is fixed size, ArrayList is dynamic
 * - Type: Array can hold primitives and objects, ArrayList holds only objects
 */

import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        // Integer | Double | Character | Boolean | Float | Long | Short | Byte
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        // Add O(1)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Papaya"); // O(n)

        System.out.println("Fruits after adding: " + fruits);

        // Accessing elements from the ArrayList
        // Get O(1)
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element from the ArrayList
        // Remove O(n)
        fruits.remove(0);
        System.out.println("Fruits after removing first element: " + fruits);
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);

        // Setting an element in the ArrayList
        // Set O(n)
        fruits.set(0, "Mango");
        System.out.println("Fruits after setting first element to Mango: " + fruits);

        // Checking if the ArrayList contains an element
        // Contains O(n)
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Displaying the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());

        // Iterating through the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Iterating through the ArrayList of Integers
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Reverse iteration
        System.out.println("Fruits in reverse order:");
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }
}
