/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import javax.swing.*;
import java.awt.*;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Color;

/**
 *
 * @author bibek
 */
public class ShapesExample extends JFrame {

    public ShapesExample() {
        setTitle("2D Shape");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // adding the constructor ShapesPanel()
        add(new ShapesPanel());
    }

    public static void main(String[] args) {
        ShapesExample frame = new ShapesExample();
        frame.setVisible(true);
    }
}

class ShapesPanel extends JPanel {
    /*
    @Override protected void paintComponent(Graphichs g)
    */
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics g2d = (Graphics2D) g;
        
        //Draw a rectangle
        g2d.setColor(Color.red);
        g2d.fillRect(50,50,100,50);
        
        // Draw an oval
        g2d.setColor(Color.BLUE);
        g2d.fillOval(200, 50, 100, 50);
        
        // Draw a line
        g2d.setColor(Color.black);
        g2d.drawLine(50, 150, 300, 150);
    }
}
