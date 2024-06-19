package lab_one;

import java.net.InetAddress;
import java.net.UnknownHostException;

//WAP to find the address of tu.edu.np and check whether the address is IPv4 or IPv6.
public class InetAddress_one {

    public static void main(String args[]) throws UnknownHostException {
        String url = "tu.edu.np";
        InetAddress ip1 = InetAddress.getByName(url);
//        System.out.println(ip1);
        byte[] add = ip1.getAddress();
        System.out.println(add);

//        String ipAddress = ip1.getHostAddress();
//        System.out.println("IP Address: " + ipAddress);

        if (add.length == 4) {
            System.out.println("The address is ipv4");
        } else {
            System.out.print("The address is of ipv6");
        }

    }

}
