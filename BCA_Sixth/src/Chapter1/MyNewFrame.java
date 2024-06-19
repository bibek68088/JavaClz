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
public class MyNewFrame extends JFrame{
    // Has a relationship
    MyNewFrame(){
        setSize(400, 300); //width and height in pixel
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args){
        new MyNewFrame();
    }
}
