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
public class ComboBoxTest extends JFrame{
    private JComboBox b;
    private JLabel label;
    
    private String names[]= {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private Icon icons[] = {new ImageIcon(names[0]), new ImageIcon(names[1]),
        new ImageIcon(names[2]), new ImageIcon(names[3])};
    
    public ComboBoxTest()
    {
        super("Testing JComboBox");
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        b = new JComboBox(names);
        b.setMaximumRowCount(2);
        b.addItemListener(
                new ItemListener(){
                    public void itemStateChanged(ItemEvent event)
                    {
                        if(event.getStateChange()== ItemEvent.SELECTED)
                            label.setIcon(icons[b.getSelectedIndex()]);
                    }
                }
        );
        container.add(b);
        
        label = new JLabel(icons[0]);
        container.add(label);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]){
        ComboBoxTest application = new ComboBoxTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
