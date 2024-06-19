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
public class KeyTracker extends JFrame implements KeyListener {
    private String s1="", s2="",s3="";
    private JTextArea textArea;
    
    public KeyTracker()
    {
        super("Demonstrating Keystroke Events");
        
        textArea = new JTextArea(10,15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        getContentPane().add(textArea);
        
        addKeyListener(this);
        
        setSize(300,300);
        setVisible(true);
    }
    
    public void keyPressed(KeyEvent event)
    {
        s1 = "Key pressed:" + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }
    
    public void keyReleased(KeyEvent event)
    {
        s1 = "Key released:" + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }
    
    public void keyTyped(KeyEvent event)
    {
        s1 = "Key typed:" + event.getKeyText(event.getKeyCode());
        setLines2and3(event);
    }
    
    private void setLines2and3(KeyEvent event)
    {
        s2 = "This key is "+ (event.isActionKey()?"":"not") + "an action key";
        
        String temp = event.getKeyModifiersText(event.getModifiers());
        
        s3 = "Modifiers keys passed: " + (temp.equals("")?"none":temp);
        
        textArea.setText(s1 + "\n" + s2 + "\n" + s3);
    }
    
    public static void main (String [] args)
    {
        KeyTracker app = new KeyTracker();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
