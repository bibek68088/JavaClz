/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */
public class Painter extends JFrame{
    
    private int pointCount = 0;
    private Point points[] = new Point[1000];
    
    public Painter(){
        super("A simple paint program");
        
        getContentPane().add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);
        
        addMouseMotionListener(
        new MouseMotionAdapter(){
            
            public void mouseDragged(MouseEvent event){
                if(pointCount < points.length){
                    points[pointCount] = event.getPoint();
                    ++pointCount;
                    repaint();
                }
            }
        });
        setSize(400,250);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        for(int i =0; i< points.length && points[i]!= null; i++){
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }
    }
    
    public static void main(String[]args){
        Painter app = new Painter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
