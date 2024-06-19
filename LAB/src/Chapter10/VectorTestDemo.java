/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.Vector;

/**
 *
 * @author bibek
 */
public class VectorTestDemo {
    public static void main(String[]args){
        Vector v =new Vector();
        System.out.println(v.capacity());
        for(int i=1;i<10;i++){
        v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
