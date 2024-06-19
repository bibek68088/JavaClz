/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;


public class StringBufferMethod {
    public static void main(String[]args){
    StringBuffer sb = new StringBuffer("Orchid");
    StringBuffer sb1 = new StringBuffer("WhiteHouse");
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    System.out.println(sb.append("College"));
    System.out.println(sb1.reverse());
    System.out.println(sb.replace(5, 10, "n..."));
    System.out.println(sb.insert(6, "HI"));
    System.out.println(sb1.reverse());
    System.out.println(sb1.delete(3, 6));
    System.out.println(sb.deleteCharAt(5));
    }
}
