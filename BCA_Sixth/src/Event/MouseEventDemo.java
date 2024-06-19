/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author bibek
 */
public class MouseEventDemo  extends JFrame implements MouseListener{
    private JLabel label;
    
    public MouseEventDemo(){
        setTitle("Mouse Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        
        //Create label
        label = new JLabel("No mouse action yet.");
        
        // Add mouse listener to label
        label.addMouseListener(this);
        
        // Add label to frame
        add(label);
        
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        label.setText("Mouse clicked at : (" +e.getX() + "," + e.getY() +")");
    }
    
    @Override
    
    public void mousePressed(MouseEvent e){
        // Not used in this example
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        //Not used in this example
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse entered at: (" +e.getX() + "," + e.getY() +")");
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        label.setText("Mouse exited.");
    }
    
    public static void main(String[]args){
        new MouseEventDemo();
    }
}
