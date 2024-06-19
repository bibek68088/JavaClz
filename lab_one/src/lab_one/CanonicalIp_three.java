package lab_one;

import java.net.InetAddress;
import java.net.UnknownHostException;
//WAP to find the canonical and host name of a given IP.

public class CanonicalIp_three {

    public static void main(String[] args) throws UnknownHostException {
        //ip address in byte array format
//        byte[] ip1 = {104,21,76,34};
        //create an InetAddress Object
        //InetAddress address = InetAddress.getByAddress(ip1);
        InetAddress address = InetAddress.getByName("www.tu.edu.np");
        System.out.println(address);
        //get fully qualified domain name
        String fullDomainName = address.getCanonicalHostName();
        System.out.println("Canonical name: "+fullDomainName);

        //get simple hostname 
        String hostname = address.getHostName();
        System.out.println(hostname);

    }

}
