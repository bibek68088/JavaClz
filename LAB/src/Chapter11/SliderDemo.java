/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author bibek
 */
public class SliderDemo extends JFrame{
    private JSlider diameterSlider;
    private OvalPanel myPanel;
    
    public SliderDemo()
    {
        super("Slider Demo");
        
        myPanel = new OvalPanel();
        myPanel.setBackground(Color.yellow);
        
        diameterSlider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        diameterSlider.setMajorTickSpacing(10);
        diameterSlider.setPaintTicks(true);
        
        diameterSlider.addChangeListener(
                new ChangeListener(){
                        
                        public void stateChanged(ChangeEvent e)
                        {
                            myPanel.setDiameter(diameterSlider.getValue());
                        }
                    }
        );
        
        Container container = getContentPane();
        container.add(diameterSlider, BorderLayout.SOUTH);
        container.add(myPanel, BorderLayout.CENTER);
        
        setSize(350,350);
        setVisible(true);
    }
    
    public static void main(String[]args)
    {
        SliderDemo app = new SliderDemo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
