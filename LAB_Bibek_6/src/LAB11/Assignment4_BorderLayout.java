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
public class Assignment4_BorderLayout extends JFrame {
       
Assignment4_BorderLayout()  
{        
     // creating buttons  
    JButton b1 = new JButton("NORTH");
    JButton b2 = new JButton("SOUTH");  
    JButton b3 = new JButton("EAST");   
    JButton b4 = new JButton("WEST"); 
    JButton b5 = new JButton("CENTER");
        
    add(b1, BorderLayout.NORTH);    
    add(b2, BorderLayout.SOUTH);   
    add(b3, BorderLayout.EAST);     
    add(b4, BorderLayout.WEST);     
    add(b5, BorderLayout.CENTER);  
        
    setSize(500, 500);    
    setVisible(true);    
} 
public static void main(String[]args){
    Assignment4_BorderLayout app = new Assignment4_BorderLayout();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
