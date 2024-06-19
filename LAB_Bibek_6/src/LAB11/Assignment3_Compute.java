/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author bibek
 */
public class Assignment3_Compute extends Applet implements ActionListener {
    TextField t1, t2;
    Button compute;
    
    public void init(){
        Label l1 = new Label("Input Number: ");
        Label l2 = new Label("Factorial: ");
        t1 = new TextField(20);
        t2 = new TextField(20);
        compute = new Button("Compute");
        add(l1);
        add(t1);
        add(l2);        
        add(t2);
        add(compute);
        compute.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compute){
            int value = Integer.parseInt(t1.getText());
            int fact = factorial(value);
            t2.setText(String.valueOf(fact));
        }
    }
   int factorial(int n){
       if(n==0)
           return 1;
       else
           return n*factorial(n-1);
   }
}
