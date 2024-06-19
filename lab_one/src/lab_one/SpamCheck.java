 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;


/*
* WAP to demonstrate SPAM checking.
* */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    public static final String black_hole = "sbl.spamhaus.org";

    public static void main(String[] args) throws UnknownHostException {
        for(String arg: args){
            if(isSpammer(arg)){
                System.out.println(arg+" is known spammer");
            }else{
                System.out.println(arg+" appears legitimate");
            }
        }
    }

    private static boolean isSpammer(String arg) {
        try{
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();

            String query = black_hole;

            for(byte octet: quad){
                int unsignedByte = octet < 0?octet+256:octet;
                query = unsignedByte +"."+query;
            }
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
