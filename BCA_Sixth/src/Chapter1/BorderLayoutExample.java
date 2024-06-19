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
public class BorderLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        
        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());
        
        // Add components to different regions
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.WEST);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button5, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
    }
}
