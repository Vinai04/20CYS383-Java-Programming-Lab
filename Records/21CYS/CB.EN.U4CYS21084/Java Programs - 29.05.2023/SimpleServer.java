package com.vinayak.jpl;
import java.util.Scanner;

import java.io.*;
import java.net.*;

/**
 * The SimpleServer class represents a simple server program.
 * It listens for incoming connections on a specified port and receives messages from clients.
 * This class demonstrates basic network programming using sockets.
 *
 * Note: This is a simple example and does not handle multiple clients or advanced error handling.
 *
 * Usage:
 * - Run the SimpleServer program.
 * - Connect to the server using a client program and send a message.
 * - The server receives the message and prints it to the console.
 * - The server then closes the connection.
 *
 * @author Vinayak
 * @version 0.5
 */
public class SimpleServer {
    /**
     * The main method is the entry point of the program.
     * It listens for incoming connections, receives messages, and prints them to the console.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try {
            // Create a server socket on port 2444
            ServerSocket ss = new ServerSocket(2444);

            // Wait for a client to establish a connection
            Socket s = ss.accept();
            DataOutputStream  dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str;
            Scanner myObj = new Scanner(System.in);

            do {
                // Create a DataOutputStream to send messages to the server

                System.out.println("Enter a message for the Client:");
                String data = myObj.nextLine();

                System.out.println("Sending the message to Client.");
                // Send a message to the server
                dout.writeUTF(data);
                dout.flush();

                if(data.equals("exit"))
                {
                    break;
                }

                System.out.println("Waiting for message from Client......");
                // Read the message from the client
                str = dis.readUTF();

                System.out.println("Message from Client: " + str);

            }while(true);

            // Close the server socket
            dis.close();
            dout.close();
            ss.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
