package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    ArrayList<JTextField> allTextFields = new ArrayList<JTextField>();

    public MyFrame() {
        initializeWindow();
        this.setLayout(new BorderLayout());
        String[] labelNames1 = { "Name", "Street", "City" };
        String[] labelNames2 = { "State", "Zip" };

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JPanel midPanel = new JPanel();
        midPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JPanel botPanel = new JPanel();
        botPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        for (String labelName : labelNames1) {
            topPanel.add(getInputElement(labelName));
        }
        for (String labelName : labelNames2) {
            midPanel.add(getInputElement(labelName));
        }

        this.add(topPanel, BorderLayout.NORTH);
        this.add(midPanel, BorderLayout.CENTER);

        JButton button = new JButton("Submit");
        button.addActionListener(new MyButtonListener());
        botPanel.add(button);
        this.add(botPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    // Inner Class
    class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            System.out.format("\n %s \n %s \n %s, %s %s", allTextFields.get(0).getText(), allTextFields.get(1).getText(),allTextFields.get(2).getText(), allTextFields.get(3).getText(), allTextFields.get(4).getText());
        }

    }

    JPanel getInputElement(String fieldName) {
        JTextField nameField = new JTextField(15);
        allTextFields.add(nameField);
        nameField.setPreferredSize(new Dimension(200, 30));
        JLabel nameLabel = new JLabel();
        nameLabel.setText(fieldName);

        JPanel row = new JPanel();
        row.setLayout(new BorderLayout());
        row.add(nameLabel, BorderLayout.NORTH);
        row.add(nameField, BorderLayout.CENTER);

        return row;

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(600, 260);
        handleWindowClosing();
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    private void handleWindowClosing() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                // other clean-up
                System.exit(0);
            }
        });
    }

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

    void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static final long serialVersionUID = 3618976789175941431L;
}


