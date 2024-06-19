///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Event;
//import javax.swing.*;
//import java.awt.event.*;
///**
// *
// * @author bibek
// */
//public class NewKeyEventDemo extends JFrame{
//    private JTextField textField;
//    
//    public NewKeyEventDemo(){
//        setTitle("Key Event Demo");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(300,200);
//        
//        // Create text fiels
//        textField = new JTextField();
//        textField.addKeyListener(this);
//        
//        // add text field to frame
//        add(textField);
//        setVisible(true);
//    }
//    
//    topPanel.addMouseListener(new MouseAdapter()){
//    @Override
//    public void mousePressed(MouseEvent e){
//    }
//    }
//    
//    @Override 
//    public void keyTyped(KeyEvent e){
//        // Not used to this example
//    }
//    
//    @Override
//    public void keyPressed(KeyEvent e){
//        // Display the pressed key's code in the
//        textField.setText("Key Pressed: "+ KeyEvent.getKeyText(e.getKeyCode()));
//    }
//    
//    @Override
//    public void keyReleased(KeyEvent e){
//        // Not used in this example
//    }
//    
//    public static void main(String[]args){
//        new NewKeyEventDemo();
//    }
//}
