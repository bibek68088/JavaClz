/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author bibek
 */
public class Practice extends JFrame implements MouseListener{
    
    private JLabel label1, label2;
    private JPanel panel1, panel2;
    
//    panel1.add(label1);
    
    public Practice(){
        // adding the constructor ShapesPanel()
//        add(new ShapesPanel2());
    }
     
    @Override
    public void mouseClicked(MouseEvent e){
        label1.setText("Mouse clicked at : (" +e.getX() + "," + e.getY() +")");
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
        label2.setText("Mouse entered at: (" +e.getX() + "," + e.getY() +")");
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        label2.setText("Mouse exited.");
    }
    
    
    
    public static void main(String[]args){
       Practice frame = new Practice();
       frame.setVisible(true);
    }
}



