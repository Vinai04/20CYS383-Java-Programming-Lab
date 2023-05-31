package com.vinayak.jpl.datastructures;

import java.util.HashMap;

/**
 * The HashMapExample class demonstrates the usage of HashMap to store and retrieve roll numbers and names.
 * It creates a HashMap to associate roll numbers with corresponding names.
 * This class provides a basic example of working with HashMap in Java.
 *
 * Usage:
 * - The program creates a HashMap called rollName to store roll numbers and names.
 * - It adds key-value pairs (roll numbers and names) to the HashMap using the put() method.
 * - It retrieves the value (name) associated with a specific key (roll number) using the get() method.
 * - It prints the retrieved name.
 *
 * Note: This example uses a HashMap of strings to represent roll numbers and names.
 *
 * Dependencies:
 * - None
 *
 * @author Vinayak
 * @version 0.5
 */
public class HashMapExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of HashMap to store and retrieve roll numbers and names.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a HashMap object called rollName
        HashMap<Integer, String> rollName = new HashMap<Integer, String>();

        // Add keys and values (roll numbers and names) to the HashMap
        rollName.put(1, "Abinesh G");
        rollName.put(11, "A S Deepan");
        rollName.put(21, "Gundala Kushal Bhavani Reddy");
        rollName.put(31, "Kishanth K");
        rollName.put(41, "Middivari Charan Kumar Reddy");
        rollName.put(51, "Nithin S");
        rollName.put(61, "Roshni V");
        rollName.put(71, "Sourabh Sasikanthan");
        rollName.put(81, "Koti Venkatadinesh Reddy");

        // Retrieve and print the name associated with a specific roll number
        System.out.println(rollName.get(11));
        System.out.println(rollName.get(71));
        System.out.println(rollName.containsValue("Nithin S"));
        System.out.println(rollName.containsValue("Vinayak"));
    }
}
