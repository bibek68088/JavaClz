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
public class ActionEventDemo  extends JFrame implements ActionListener{
    private JButton button;
    private JLabel label;
    
    public ActionEventDemo(){
        setTitle("Action EventDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        
        //Create button
        button = new JButton("Click Me!");
        button.addActionListener(this);
        
        // Create label
        label = new JLabel("No Button click yet.");
        
        // Add components to frame
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button){
            label.setText("Button clicked");
        }
    }
    
    public static void main(String[]args){
        new ActionEventDemo();
    }
}
