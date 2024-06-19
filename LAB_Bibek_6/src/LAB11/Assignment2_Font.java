/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;


import java.awt.*;
import javax.swing.*;
/**
 *
 * @author bibek
 */
public class Assignment2_Font extends JFrame {
    private JLabel text;
    private Font f;
    
    public Assignment2_Font(){
       text = new JLabel("You are here");
       add(text);
       f = new Font("Arial",Font.BOLD,30);
       text.setFont(f);
              
       setSize(400,400);
       setVisible(true);
    }
    
    public void getParameter(Graphics g){
        g.setFont(f);
    }

    public static void main(String[]args){
        Assignment2_Font app = new Assignment2_Font();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
