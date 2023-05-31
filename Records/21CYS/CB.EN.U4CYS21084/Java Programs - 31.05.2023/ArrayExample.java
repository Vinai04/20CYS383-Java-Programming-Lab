package com.vinayak.jpl.datastructures;

import java.util.Scanner;

/**
 * The ArrayExample class demonstrates the usage of an array to store and display roll numbers.
 * It creates an array of roll numbers and prints each roll number using a for loop.
 * This class provides a basic example of working with arrays in Java.
 *
 * Usage:
 * - The program creates an array of roll numbers with a specified size.
 * - It assigns roll numbers to array elements.
 * - It uses a for loop to iterate through the array and print each roll number.
 *
 * Note: This example assumes a fixed size for the array and assigns values manually.
 *
 * Dependencies:
 * - None
 *
 * @author Vinayak
 * @version 0.5
 */
public class ArrayExample {
    /**
     * The main method is the entry point of the program.
     * It creates an array of roll numbers and prints each roll number using a for loop.
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {

        Scanner scannerobj = new Scanner(System.in);

        int data[] = new int[10];

        System.out.println("Reading inputs from user...");

        for(int j = 0;j<10;j++){
            data[j] = scannerobj.nextInt();
        }

        System.out.println("Printing data in the array...");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
