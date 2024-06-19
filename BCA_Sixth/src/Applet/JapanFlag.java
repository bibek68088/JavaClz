/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author bibek
 */
public class JapanFlag extends JFrame{
    public JapanFlag() {
        setTitle("Japan Flag");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // adding the constructor ShapesPanel()
        add(new ShapesPanel2());
    }

    public static void main(String[] args) {
        JapanFlag frame = new JapanFlag();
        frame.setVisible(true);
    }
}

class ShapesPanel2 extends JPanel {
    /*
    @Override protected void paintComponent(Graphichs g)
    */
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics g2d = (Graphics2D) g;
        
        //Draw a rectangle
        g2d.setColor(Color.white);
        g2d.fillRect(100,50,100,50);
        
        // Draw an circle
        g2d.setColor(Color.RED);
        g2d.fillOval(131, 60, 35, 35);
        
    }
}

