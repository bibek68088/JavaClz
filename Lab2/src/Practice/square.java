/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author bibek
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class square extends JFrame implements ActionListener {
    private JLabel inputLabel, outputLabel;
    private JTextField inputField, outputField;
    private JButton calculateButton;

    public square() {
        setTitle("Square Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());

        inputLabel = new JLabel("Enter a number:");
        outputLabel = new JLabel("Square of the number:");

        inputField = new JTextField(10);
        outputField = new JTextField(10);
        outputField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        add(inputLabel);
        add(inputField);
        add(outputLabel);
        add(outputField);
        add(calculateButton);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double num = Double.parseDouble(inputField.getText());
                double square = num * num;
                outputField.setText(String.format("%.2f", square));
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new square();
    }
}
