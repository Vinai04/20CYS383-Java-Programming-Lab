package com.vinayak.jpl.datastructures;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * The LinkedListExample class demonstrates the usage of LinkedList to store and retrieve elements.
 * It creates a LinkedList to store car names.
 * This class provides a basic example of working with LinkedList in Java.
 *
 * Usage:
 * - The program creates a LinkedList called cars to store student roll numbers.
 * - It adds elements to the LinkedList using the add() method.
 * - It prints the contents of the LinkedList.
 *
 * Note: This example uses a LinkedList of strings to represent student roll numbers.
 *
 * Dependencies:
 * - None
 *
 * @author Vinayak
 * @version 0.5
 */
public class LinkedListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of LinkedList to store and retrieve elements.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Double> marks = new LinkedList<Double>();

        Scanner scannerobj = new Scanner(System.in);

        System.out.println("Enter marks in 5 subjects...");

        for(int i=1;i<6;i++){
            System.out.println("Enter marks in subject " + i + " :");
            double data = scannerobj.nextDouble();
            marks.add(data);
        }

        // Print the contents of the LinkedList
        System.out.println("\nPrint the contents of the LinkedList");
        System.out.println(marks);

        marks.remove(2);
        System.out.println(marks);

        marks.add(96.6);
        System.out.println(marks);

        marks.remove(94.4);
        System.out.println(marks);
    }
}
