/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;

import java.io.IOException;
import java.net.*;
import java.net.Inet4Address;
import java.net.UnknownHostException;

/*
* WAP to check if a host is reachable or not.
* */
public class CheckHost {
    public static void main(String[] args) throws UnknownHostException {
        String host = "www.oic.edu.np";
        int timeOut = 5000;

        InetAddress ip1 = InetAddress.getByName(host);
        System.out.println("Checking host: " + host);

        try {
            if (ip1.isReachable(timeOut)) {
                System.out.println("Host is reachable.") ;
            } else {
                System.out.println("Host is not reachable.");
            }
        
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
