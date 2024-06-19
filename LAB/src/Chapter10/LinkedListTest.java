/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author bibek
 */
public class LinkedListTest {
    public static void main(String[]args){
        LinkedList i =new LinkedList();
        i.add("Java");
        i.add("Python");
        i.add("PHP");
        i.addFirst("C Programming");
        i.addLast("java Script");
        Iterator itr = i.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
}
