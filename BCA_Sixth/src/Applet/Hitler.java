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
public class Hitler extends JFrame{
    public Hitler() {
        setTitle("Germany Flag");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // adding the constructor ShapesPanel()
        add(new ShapesHitler());
    }

    public static void main(String[] args) {
        Hitler frame = new Hitler();
        frame.setVisible(true);
    }
}

class ShapesHitler extends JPanel {
    /*
    @Override protected void paintComponent(Graphichs g)
    */
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics g2d = (Graphics2D) g;
        
        // Get the dimensions of the panel
        int width  = getWidth();
        int height = getHeight();
        
        // calculate the height of each color height
        int bandHeight = height / 3;
        
        //Draw a rectangle of black color
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, width, bandHeight);
        
        //Draw a rectangle of red color
        g2d.setColor(Color.red);
        g2d.fillRect(0,bandHeight,width,bandHeight);
        
        // Draw a ractangle of yellow color
        g2d.setColor(Color.yellow);
        g2d.fillRect(0, 2*bandHeight, width, bandHeight);
        
        Color customColor = new Color(100,150,200);
        g2d.setColor(customColor);
        g2d.fillOval(200,50,100,50);
    }
}
