/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author bibek
 */

public class Assignment4_DialogBox extends JFrame {

    private static Dialog d;

    Assignment4_DialogBox() {
        JFrame f = new JFrame();
        d = new Dialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                Assignment4_DialogBox.d.setVisible(false);
            }
        });
        d.add(new Label("Click on button to continue."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
        Frame fr = new Frame("Menu and MenuItem Example");
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        mb.add(menu);
        setMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
      Assignment4_DialogBox application =  new Assignment4_DialogBox();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

