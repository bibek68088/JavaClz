/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */

public class Assignment1_Display extends JFrame{
    
    private JLabel label;

    public Assignment1_Display(){
        label = new JLabel();
        label.setText("Hello World");
        add(label);
        
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[]args){
        Assignment1_Display app = new Assignment1_Display();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}