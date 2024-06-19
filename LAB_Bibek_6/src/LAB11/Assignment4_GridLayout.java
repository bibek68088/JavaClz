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
public class Assignment4_GridLayout extends JFrame {

    Assignment4_GridLayout() {
       
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        // adding buttons to the frame       
        add(b1);
        add(b2);
        add(b3);
        add(b4);   
        setLayout(new GridLayout(3, 3));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
       Assignment4_GridLayout app = new Assignment4_GridLayout();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}