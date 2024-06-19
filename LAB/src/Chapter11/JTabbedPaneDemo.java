/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */
public class JTabbedPaneDemo extends JFrame{
    public JTabbedPaneDemo()
    {
        super("JTabbedPane Demo");
        
        //create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        //setup panel1 and add it to JTabbedPane
        JLabel label1 = new JLabel("panel one",SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        tabbedPane.addTab("Tab One", null, panel1, "First Panel");
        
        JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.add(label2);
        tabbedPane.addTab("Tab two",null, panel2,"Second Panel");
        
        JLabel label3 = new JLabel("panel three");
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JButton("North"),BorderLayout.NORTH);
        panel3.add(new JButton("West"),BorderLayout.WEST);
        panel3.add(new JButton("East"),BorderLayout.EAST);
        panel3.add(new JButton("South"),BorderLayout.SOUTH);
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Tab three",null, panel3,"Third Panel");
        
        //add JTabbedPane to container
        getContentPane().add(tabbedPane);
        
        setSize(500,500);
        setVisible(true);
        
    }//end constructor
    
    public static void main(String[]args)
    {
        JTabbedPaneDemo app = new JTabbedPaneDemo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
