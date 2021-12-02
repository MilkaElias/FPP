package com.company;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame {

    public MyFrame() {
        initializeWindow();
        JPanel mainPanel = new JPanel(new BorderLayout(40, 10));
        JPanel leftPanel = new JPanel(new BorderLayout(20, 5));
        JPanel rightPanel = new JPanel(new BorderLayout(20, 5));

        JTextField inputField = new JTextField(20);
        JLabel inputLabel = new JLabel();
        inputLabel.setText("Input");
        JPanel input = new JPanel(new BorderLayout());
        input.add(inputLabel, BorderLayout.NORTH);
        input.add(inputField, BorderLayout.CENTER);

        JTextField outputField = new JTextField(20);
        JLabel outputLabel = new JLabel();
        outputLabel.setText("Output");
        JPanel output = new JPanel(new BorderLayout());
        output.add(outputLabel, BorderLayout.NORTH);
        output.add(outputField, BorderLayout.CENTER);

        JButton counterButton = new JButton("Count Letters");
        counterButton.addActionListener(e -> outputField.setText(Integer.toString(countCharacters(inputField.getText()))));
        JButton reverseButton = new JButton("Reverse Letters");
        reverseButton.addActionListener(e -> outputField.setText(reverseString(inputField.getText())));
        JButton removeButton = new JButton("Remove Duplicates");
        removeButton.addActionListener(e -> outputField.setText(removeDuplicates(inputField.getText())));


        rightPanel.add(input, BorderLayout.NORTH);
        rightPanel.add(output, BorderLayout.SOUTH);

        leftPanel.add(counterButton, BorderLayout.NORTH);
        leftPanel.add(reverseButton, BorderLayout.CENTER);
        leftPanel.add(removeButton, BorderLayout.SOUTH);

        mainPanel.add(leftPanel, BorderLayout.CENTER);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        getContentPane().add(mainPanel);
        pack();
        centerFrameOnDesktop(this);

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        setSize(620,260);
        handleWindowClosing();
        centerFrameOnDesktop(this);
        setResizable(false);
    }


    private void handleWindowClosing() {
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                System.exit(0);
            }
        });
    }
    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width  = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth  = f.getSize().width;
        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                MyFrame mf = new MyFrame();
                mf.setVisible(true);
            }
        });
    }

    public static String reverseString(String s){
        StringBuilder sb=new StringBuilder(s);
        StringBuilder reverseStr = sb.reverse();
        return reverseStr.toString();
    }

    public static String removeDuplicates(String input){
            String newString= String.valueOf(input.charAt(0));
            for (int i = 0; i < input.length(); i++) {
                if(!newString.contains(String.valueOf(input.charAt(i))))
                    newString += String.valueOf(input.charAt(i));
            }
            return newString;
    }

    public static int countCharacters(String s){
        return s.length();
    }

    private static final long serialVersionUID = 3618976789175941431L;
}



