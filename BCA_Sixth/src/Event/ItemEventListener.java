/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author bibek
 */
public class ItemEventListener extends JFrame{
    private JCheckBox checkBox;
    private JLabel label;
    public ItemEventListener(){
        // create a checkbox
        checkBox = new JCheckBox("Check Me!");
        // create a label to show the status
        label = new JLabel("Checkbox is unchecked");
        // create an item listener
        checkBox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    label.setText("Checkbox is checked");
                }else{
                    label.setText("Checkbox is unchecked");
                }
            }
        });
        
        // set up the frame layout
        setLayout(new FlowLayout());
        add(checkBox);
        add(label);
        
        //Frame settings
        setTitle("Itemlistener Example");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String []args){
        new ItemEventListener();
    }
}
