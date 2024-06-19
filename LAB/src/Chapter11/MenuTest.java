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
public class MenuTest extends JFrame{
    private final Color colorValues[]= {Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
    private JRadioButtonMenuItem colorItems[],fonts[];
    private JCheckBoxMenuItem styleItems[];
    private JLabel displayLabel;
    private ButtonGroup fontGroup, colorGroup;
    private int style;
    
    //Set up GUI
    public MenuTest()
    {
        super("Using JMenus");
        
        //set up File menu and its menu items
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        
        //set up About...menu item
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        aboutItem.addActionListener(
                new ActionListener(){//anonymous inner class
                    
                    //display message dialog when user selects About...
                   public void actionPerformed(ActionEvent event)
                   {
                       JOptionPane.showMessageDialog(MenuTest.this,"This is an example of using menus",
                               "About",JOptionPane.PLAIN_MESSAGE);
                   }
                }
        );
        
        //set up Exit Menu Item
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X');
        fileMenu.add(exitItem);
        exitItem.addActionListener(
                new ActionListener(){
                    //terminate application when user clicks exitItem
                    public void actionPerformed(ActionEvent event)
                    {
                        System.exit(0);
                    }
                }
        );
        
        //create menu bar and attach it to Menutest window
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
        
        //create format menu, its submenus and menu items
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');
        
        //create color submenu
        String colors[]= {"Black","Blue","Red","Green"};
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');
        
        colorItems = new JRadioButtonMenuItem[colors.length];
        colorGroup = new ButtonGroup();
        ItemHandler itemHandler = new ItemHandler();
        
        //create color radio button menu items
        for(int count = 0; count<colors.length; count++){
            colorItems[count] = new JRadioButtonMenuItem(colors[count]);
            colorMenu.add(colorItems[count]);
            colorGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);
        }
        //select first color menu item
        colorItems[0].setSelected(true);
        
        //add format menu to menu bar
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
        
        //create font submenu
        String fontNames[] = {"Serif","Monospaced","SansSerif"};
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');
        
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontGroup = new ButtonGroup();
        
        //create font radio button menu items
        for(int count =0; count< fonts.length; count++){
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]);
            fontGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);
        }
        
        fonts[0].setSelected(true);
        
        fontMenu.addSeparator();
        
        //setip style menu items
        String styleNames[] = {"Bold", "italic"};
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        StyleHandler styleHandler = new StyleHandler();
        
        //create style chcekbox menu items
        for(int count=0; count< styleNames.length; count++){
            styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleItems[count]);
            styleItems[count].addItemListener(styleHandler);
        }
        
        //put font menu in format menu
        formatMenu.add(fontMenu);
        
        //add format menu to menu bar
        bar.add(formatMenu);
        
        displayLabel = new JLabel("Sample Text",SwingConstants.CENTER);
        displayLabel.setForeground(colorValues[0]);
        displayLabel.setFont(new Font("Serif",Font.PLAIN,72));
        
        getContentPane().setBackground(Color.CYAN);
        getContentPane().add(displayLabel,BorderLayout.CENTER);
        
        setSize(500,200);
        setVisible(true);
        
    }
    public static void main(String[]args)
    {
        MenuTest app = new MenuTest();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class ItemHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event)
        {
            for(int count=0; count< colorItems.length; count++)
                if(colorItems[count].isSelected()){
                    displayLabel.setForeground(colorValues[count]);
                    break;
                }
            for(int count=0; count< fonts.length; count++)
                if(event.getSource()==fonts[count]){
                    displayLabel.setFont(
                    new Font(fonts[count].getText(),style,72));
                    break;
                }
            repaint();
        }
    }
    private class StyleHandler implements ItemListener{
        public void itemStateChanged(ItemEvent e)
        {
            style = 0;
            
            if(styleItems[0].isSelected())
                style+= Font.BOLD;
            
            if(styleItems[1].isSelected())
                style+= Font.ITALIC;
            
            displayLabel.setFont(
            new Font(displayLabel.getFont().getName(),style,72));
            repaint();
        }
    }    
}
