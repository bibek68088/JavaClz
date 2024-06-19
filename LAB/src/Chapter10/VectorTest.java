/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author bibek
 */
public class VectorTest {
    public static void main(String[]args){
        Vector v = new Vector();
        v.add("Orange");
        v.add("Mango");
        v.add("Apple");
        System.out.println("The size of vector:\t"+v.size());
        Enumeration en = v.elements();
        while(en.hasMoreElements())
            System.out.println(en.nextElement()+"\n");
    }
}
