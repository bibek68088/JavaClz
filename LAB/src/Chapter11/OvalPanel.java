/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */
public class OvalPanel extends JPanel{
    private int diameter = 10;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.fillOval(10, 10, diameter, diameter);
    }
    
    public void setDiameter(int newDiameter)
    {
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint();
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(200,200);
    }
    
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}
