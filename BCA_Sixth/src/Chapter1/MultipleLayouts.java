/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */
public class MultipleLayouts {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mixed Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create components
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");
        
        
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JPanel borderL = new JPanel(new BorderLayout());
        
        
        borderL.add(button1, BorderLayout.NORTH);
        borderL.add(button2, BorderLayout.WEST);
        borderL.add(button3, BorderLayout.CENTER);
        borderL.add(button4, BorderLayout.EAST);
        borderL.add(button5, BorderLayout.SOUTH);

        for (int i = 1; i <= 9; i++) {
            panel.add(new JButton("Button " + i));
        }
        // setting frame for borderlayout
        frame.setLayout(new BorderLayout());

        frame.add(button3, BorderLayout.NORTH);
        frame.add(button1, BorderLayout.WEST);
        frame.add(button2, BorderLayout.CENTER);
        frame.add(borderL, BorderLayout.EAST);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setSize(600, 500);
       
        frame.setVisible(true);
    }
}
