/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabOne;

import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 * @author bibek
 */
public class Question1 {

    public static void main(String[] args) throws UnknownHostException {
        String url = "www.tu.edu.np";
        byte addr[] = {127, 0, 0, 1};
        InetAddress ip1 = Inet4Address.getByName(url);

        // get()Address method
        System.out.println("Address: " + Arrays.toString(ip1.getAddress()));
        
        // Checking the address by comapring the length
        if (addr.length == 4) {
            System.out.println("The given address is IPv4");
        } else {
            System.out.println("The goven address is IPv6");
        }
    }
}
