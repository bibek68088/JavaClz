/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author bibek
 */
public class SumOfTwoNumbers extends JFrame implements MouseListener {

    private JTextField field1, field2, field3;
    private JPanel panel;
    private JLabel label;

    public SumOfTwoNumbers() {
        setTitle("Take two inputs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);

        panel = new JPanel(new FlowLayout());
        panel.addMouseListener(this);

        // Set up the num values
        label = new JLabel("Enter the numbers:");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(20);

        
        // Adding the panels
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        add(panel);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(field1.getText());
        int num2 = Integer.parseInt(field2.getText());
        int sum = num1 + num2;
        if (e.getSource() == panel) {
            field3.setText(String.valueOf(sum));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(field1.getText());
        int num2 = Integer.parseInt(field2.getText());
        int difference = num1 - num2;
        if (e.getSource() == panel) {
            field3.setText(String.valueOf(difference));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }

    public static void main(String[] args) {
        new SumOfTwoNumbers();
    }

}
