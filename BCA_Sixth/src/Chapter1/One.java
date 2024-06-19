/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author bibek
 */
public class One {

    Frame f1;

    One() {
        f1 = new Frame();
        f1.setSize(400, 300);
        f1.setVisible(true);
    }
    
    public static void main(String [] args){
        new One();
    }

}
