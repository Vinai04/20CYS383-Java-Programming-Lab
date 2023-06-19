package com.amrita.jpl.cys21084.endsem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * File Management System
 * @author Vinayak
 */


public class FileManagementSystemUI extends JFrame{

    private JTable detailsTable;
    private DefaultTableModel tableModel;

    public class File {

        /**
         *
         * @param filename name of the file
         * @param filesize size of the file
         */

        private String filename;
        private String filesize;

        public String getfilename() {
            return filename;
        }

        public void setFileName(String filename)
        {
            this.filename = filename;
        }

        public String getfilesize() {
            return filesize;
        }

        public void setFileSize(String filesize)
        {
            this.filesize = filesize;
        }

        public void displayFileDetails() {

        }

    }


    public class Document extends File {

        /**
         *
         * @param documentType type of the document
         */

        private String documentType;

        public String getdocumentType(){
            return documentType;
        }

        public void setDocumentType(){

        }

        @Override
        public void displayFileDetails(){

        }

    }

    public class Image extends File {

        private JTextField resolution;

        public void getresolution(){

        }

        public void setresolution(){

        }

        @Override
        public void displayFileDetails(){

        }

    }

    public class Video extends File {

        private JTextField duration;

        public void getduration(){

        }

        public void setduration(){

        }

        @Override
        public void displayFileDetails(){

        }

    }

    public interface FileManager {

        public void addFile(File file);

        public void deleteFile(String fileName);

        public void displayAllFiles();

    }

    public class FileManagerImpl implements FileManager {

        ArrayList<ArrayList<File>> files = new ArrayList<>();

        public void addFile(File file){
            String filename = file.filename.trim();
            String filesize = file.filesize.trim();

        }

        public void deleteFile(String fileName){

        }

        public void displayAllFiles(){

        }

    }
    public FileManagementSystemUI(){
        setTitle("21UCYS End Semester Assignment File Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0,6));

        JLabel l1 = new JLabel("File Name: ");
        formPanel.add(l1, BorderLayout.NORTH);

        JTextField fileName = new JTextField(30);
        formPanel.add(fileName, BorderLayout.NORTH);

        JLabel l2 = new JLabel("File Size: ");
        formPanel.add(l2, BorderLayout.NORTH);

        JTextField fileSize = new JTextField(30);
        formPanel.add(fileSize, BorderLayout.NORTH);

        JLabel l3 = new JLabel("File Type: ");
        formPanel.add(l3, BorderLayout.NORTH);

        String[] choices = { "Document","Image","Video"};

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        formPanel.add(cb);

        JPanel buttonPanel = new JPanel();

        JButton add = new JButton("Add File");
        buttonPanel.add(add);

        File fileObj = new File();
        FileManagerImpl fileimpl = new FileManagerImpl();
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton delete = new JButton("Delete");
        buttonPanel.add(delete);


        JButton refresh = new JButton("Refresh");
        buttonPanel.add(refresh);

        tableModel = new DefaultTableModel(new Object[]{"File Name", "File Size", "File Type"}, 0);
        detailsTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(detailsTable);

        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        Container container = getContentPane();
        container.add(mainPanel);

        pack();

    }

    /**
     * @param args command line arguments
     *
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileManagementSystemUI().setVisible(true);
            }
        });
    }
}



