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
public class FlowLayoutExample {
    public static void main (String [] args){
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel with FLowLayout
        JPanel panel = new JPanel(new FlowLayout());
        
        // Add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        
        
        // Add the panel to the frame
        /* frame.getContentPane() returns the content
            add(panel) adds the specified component, in this case
            By adding components to the content pane, you ensure
        */
        
        frame.getContentPane().add(panel);
        
        /* pack() is a method of JFrame that automatically set the sizes for the compoenets
        When you call pack(), the frame calculates the size of your components to fut the size of the frame
        This ensures that all the components within
        */
        
        frame.pack();
        frame.setVisible(true);
    }
}
