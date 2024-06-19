/*ne
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author bibek
 */
public class LightWeightComponentsExample {
    public static void main(String [] args){
        
        // Create a simple Swing application
        JFrame frame = new JFrame("LightWeight Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        
        JLabel LLoud = new JLabel ("Hello, Seing!");
        LLoud.setFont(new Font("Arial", Font.BOLD, 16));
        LLoud.setForeground(Color.RED);
        
        JButton button = new JButton("Click Me!");
        panel.add(LLoud);
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        
    }
}
