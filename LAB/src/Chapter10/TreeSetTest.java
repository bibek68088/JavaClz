/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author bibek
 */
public class TreeSetTest {
    public static void main(String[]args){
        TreeSet ts = new TreeSet();
        ts.add("Zoro");
        ts.add("Luffy");
        ts.add("Nami");
        ts.add("Sanji");
        ts.add("Luffy");
        Iterator itr = ts.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("Z"));
        System.out.println("A".compareTo("z"));
        System.out.println("A".compareTo("A"));
    }
}
