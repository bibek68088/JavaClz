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
public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(3,3));
        
        // Add buttons to the panel
        for(int i = 1; i<=9 ; i++){
            panel.add(new JButton("Button " + i));
        }
        
        // Add the panel to the frame
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }
}
