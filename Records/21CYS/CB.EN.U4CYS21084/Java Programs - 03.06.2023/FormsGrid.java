package com.vinayak.jpl.gui.swing.layout;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;

/**
 * This class demonstrates the usage of GridLayout in Java Swing.
 * It creates a simple GUI window with components arranged using GridLayout.
 *
 * @author Vinayak
 * @version 0.5
 */
public class FormsGrid extends JFrame {

    /**
     * Constructs the GridLayoutExample window.
     */
    public FormsGrid() {
        setTitle("GridLayout Example");
        setSize(960, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the GridLayout as the layout manager for the frame
        setLayout(new GridLayout(8, 2));

        // Create and add components to the content pane

        // Labels
        JLabel label1 = new JLabel("Name:", JLabel.CENTER);
        JLabel label2 = new JLabel("Roll Number:", JLabel.CENTER);
        JLabel label3 = new JLabel("Date of Birth(DOB):", JLabel.CENTER);
        JLabel label4 = new JLabel("Email:", JLabel.CENTER);
        JLabel label5 = new JLabel("College:", JLabel.CENTER);
        JLabel label6 = new JLabel("Campus:", JLabel.CENTER);
        JLabel label7 = new JLabel("Domain", JLabel.CENTER);
        JButton button = new JButton("Submit");
        JButton exit = new JButton("Exit");


        // TextArea
        JTextArea tarea1 = new JTextArea("Vinayak R");
        JTextArea tarea2 = new JTextArea("CB.EN.U4CYS21084");
        JTextArea tarea3 = new JTextArea("15/01/2004");
        JTextArea tarea4 = new JTextArea("vinayakrammurthy@gmail");
        JTextArea tarea5 = new JTextArea("Amrita Vishwa Vidyapeetham");
        JTextArea tarea6 = new JTextArea("Coimbatore");
        JTextArea tarea7 = new JTextArea("CyberSecurity");


        // Add components to the content pane
        add(label1);
        add(tarea1);
        add(label2);
        add(tarea2);
        add(label3);
        add(tarea3);
        add(label4);
        add(tarea4);
        add(label5);
        add(tarea5);
        add(label6);
        add(tarea6);
        add(label7);
        add(tarea7);
        add(button);
        add(exit);

        button.setBackground(Color.green);
        exit.setBackground(Color.red);


        // Make the window visible
        setVisible(true);
    }

    /**
     * Main method to launch the application.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        new FormsGrid();
    }
}

