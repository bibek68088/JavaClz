/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import javax.swing.*;
/**
 *
 * @author bibek
 */
public class JTabbedPaneDemo {
    public JTabbedPaneDemo(){
        JFrame frame = new JFrame("JLabel and Icon Demi");
        frame.setSize(400, 400);
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new colorPanel());
        jtp.addTab("Flavors", new FlovourPanel());
        frame.add(jtp);
        frame.setVisible(true);
    }
    
    public static void main (String args[]){
    new JTabbedPaneDemo ();
    }
    }
class CitiesPanel extends JPanel{
    public CitiesPanel(){
        JButton b1= new JButton("New york");
        add(b1);
         JButton b2= new JButton("New york");
         add(b2);
         JButton b3= new JButton("New york");
         add(b3);
         JButton b4= new JButton("New york");
         add(b4);
}
   
}
class colorPanel extends JPanel{
    public colorPanel(){
        JCheckBox cb1= new JCheckBox("Red");
        add(cb1);
         JCheckBox cb2= new JCheckBox("Blue");
        add(cb2);
         JCheckBox cb3= new JCheckBox("Green");
        add(cb3);
    }
}
class FlovourPanel extends JPanel{
    public FlovourPanel(){
        JComboBox jcb= new JComboBox();
        jcb.addItem("vanilla");
        jcb.addItem("Strawberry");
        jcb.addItem("Chocolate");
        add(jcb);
    }
}


    
