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
public class Assignment4_Padding extends JFrame {
    private JTextField textfield , field;
    
    public Assignment4_Padding(){
        textfield = new JTextField("Welcome...");
        textfield.setMargin(new Insets(10,10,10,10));
        add(textfield, BorderLayout.NORTH);
        field = new JTextField("Bye");
        field.setMargin(new Insets(10,10,10,10));
        add(field, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[]args){
        Assignment4_Padding app = new Assignment4_Padding();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
