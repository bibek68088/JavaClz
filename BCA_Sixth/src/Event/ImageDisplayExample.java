/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author bibek
 */
public class ImageDisplayExample extends JFrame{
    public ImageDisplayExample(){
        // load the image
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\bibek\\Downloads\\Pictures\\animebanner.jpg");
        
        // create a JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);
        //set up the frame layout
        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);
        
        // frame settings
        setTitle("Image display Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[]args){
        new ImageDisplayExample();
    }
    
}
