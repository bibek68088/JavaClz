/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;
import javax.swing.*;
        
/**
 *
 * @author bibek
 */
public class MyFrame {
    JFrame f1;
    // has a relationship
    MyFrame(){
        f1 = new JFrame();
        f1.setSize(400,300); // width and height of the Jframe
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        
    }
    public static void main(String[]args){
        // MyFrame ob = new MyFrame();
        new MyFrame();
    }
}
