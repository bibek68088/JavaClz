/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;


public class StringBufferEx1 {
    public static void main(String [] args){
    String str = "Bibek";
    str.concat("Tamang");
    System.out.println(str);
    StringBuffer strb = new StringBuffer("Bibek");
    strb.append("Tamang");
    System.out.println(strb);
    }
}
