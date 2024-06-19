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
public class RadioButtonTest extends JFrame {
    private JTextField field;
    private Font Plain, Bold, Italic, BoldItalic;
    private JRadioButton b1, b2, b3, b4;
    private ButtonGroup radioGroup;
    
    public RadioButtonTest(){
        super("RadioButton Test");
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        field = new JTextField("Magic Shop",10);
        container.add(field);
        
        b1 = new JRadioButton("Plain",  true);
        b2 = new JRadioButton("Bold", false);
        b3 = new JRadioButton("Italic",false);
        b4 = new JRadioButton("BoldItalic",false);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);
        
        radioGroup = new ButtonGroup();
        radioGroup.add(b1);
        radioGroup.add(b2);
        radioGroup.add(b3);
        radioGroup.add(b4);
        
        Plain = new Font("sans-serif",Font.PLAIN,14);
        Bold = new Font("sans-serif",Font.BOLD,14);
        Italic = new Font("sans-serif",Font.ITALIC,14);
        BoldItalic = new Font("sans-serif",Font.BOLD+Font.ITALIC,14);
        field.setFont(Plain);
        
        b1.addItemListener(new RadioButtonHandler(Plain));
        b2.addItemListener(new RadioButtonHandler(Bold));
        b3.addItemListener(new RadioButtonHandler(Italic));
        b4.addItemListener(new RadioButtonHandler(BoldItalic));
        
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[]args){
        RadioButtonTest application = new RadioButtonTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        
        public RadioButtonHandler(Font f)
        {
            font = f;
        }
        public void itemStateChanged(ItemEvent event)
        {
            field.setFont(font);
        }
    }
}
