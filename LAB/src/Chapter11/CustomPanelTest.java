/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.awt.*;
import java .awt.event.*;
import javax.swing.*;

/**
 *
 * @author bibek
 */
public class CustomPanelTest extends JFrame{
    private JPanel buttonPanel;
    private CustomPanel myPanel;
    private JButton circleButton, squareButton;
    
    public CustomPanelTest(){
        super("CustomPanel Test");
        
        myPanel = new CustomPanel();
        myPanel.setBackground(Color.CYAN);
        
        squareButton = new JButton("Square");
        squareButton.addActionListener(
                new ActionListener(){
                    
                    public void actionPerformed(ActionEvent event)
                    {
                        myPanel.draw(CustomPanel.SQUARE);
                    }
                }
        );
        circleButton = new JButton("Circle");
        circleButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                    myPanel.draw(CustomPanel.CIRCLE);
                    }   }
        );
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(circleButton);
        buttonPanel.add(squareButton);
        
        Container container = getContentPane();
        container.add(myPanel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);
        
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[]args){
        CustomPanelTest app = new CustomPanelTest();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
