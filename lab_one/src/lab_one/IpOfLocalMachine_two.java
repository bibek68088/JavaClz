/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;

import java.net.InetAddress;
import java.net.UnknownHostException;

//
//WAP to find the name and IP address of your local machine.
public class IpOfLocalMachine_two {
    public static void main(String args[]) throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostName());
          System.out.println(address.getHostAddress());
        
        
    }
    
}
