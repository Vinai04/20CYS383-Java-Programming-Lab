package com.vinayak.jpl.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayListExample class demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
 * It creates an ArrayList of student roll numbers, adds student roll numbers to it, and uses an Iterator to traverse and print the student roll numbers.
 * This class provides a basic example of working with ArrayList in Java.
 *
 * Usage:
 * - The program creates an ArrayList of strings to represent student roll numbers.
 * - It adds student roll numbers to the ArrayList.
 * - It retrieves an Iterator from the ArrayList to iterate over its elements.
 * - It uses the Iterator to print the student roll numbers one by one.
 *
 * Note: This example uses a simple ArrayList of strings and manually retrieves and prints the elements.
 *
 * Dependencies:
 * - None
 *
 * @author Vinayak
 * @version 0.5
 */
public class ArrayListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<Double> u21cys = new ArrayList<Double>();

        u21cys.add(1.1);
        u21cys.add(2.2);
        u21cys.add(3.3);
        u21cys.add(4.4);
        u21cys.add(5.5);
        u21cys.add(6.6);
        u21cys.add(7.7);
        u21cys.add(8.8);
        u21cys.add(9.9);
        // Get the iterator
        Iterator<Double> it = u21cys.iterator();

        // Print the cars using the iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
