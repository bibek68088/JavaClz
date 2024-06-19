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
public class Assignment5_TextBox extends JFrame{
    
    Assignment5_TextBox(){
      
         super("TextField Example");

        TextField t1, t2;
        t1 = new TextField("Java TextField");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("Java Applets");
        t2.setBounds(50, 50, 200, 30); 
        add(t1);
        add(t2); 
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String args[]) {
        Assignment5_TextBox app = new Assignment5_TextBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
