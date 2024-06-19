/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class checkIp {

    public static void main(String[] args) throws UnknownHostException {
        String url = "oic.edu.np";
        InetAddress ip = InetAddress.getByName(url); // 

        String hostip = ip.getHostAddress();
        //given ip
        byte[] address = {104, 21, 76, 34};
        InetAddress checkAddress2 = InetAddress.getByAddress(address);

        if (ip.equals(checkAddress2)) {
            System.out.println("IP are same" + checkAddress2);
        } else {
            System.out.println("IP are different" + checkAddress2 + " " + hostip);

        }

    }

}
