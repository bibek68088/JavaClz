/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;

import java.net.InetAddress;
import java.net.UnknownHostException;
//WAP to find all the addresses of dns.google.com

public class dnsOfGoogle {

    public static void main(String[] args) throws UnknownHostException {
        String url = "dns.google.com";
        //create instance of InetAddress
//        InetAddress address = InetAddress.getByName(url);
//        System.out.println(address);
//        System.out.println(address.getHostAddress());

        InetAddress[] address2 = InetAddress.getAllByName(url);
        
        System.out.println("All IP addresses for " + url + ":");
        for (InetAddress alladdress : address2) {
            System.out.println(alladdress.getHostAddress());
        }

    }

}
