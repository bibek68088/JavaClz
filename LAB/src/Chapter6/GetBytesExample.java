/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;


public class GetBytesExample {
    public static void main(String[]args){
    String str="This is Java string";
    byte[]b=str.getBytes();
    for(byte b1:b){
    System.out.println(b1);
    }
    }
}
