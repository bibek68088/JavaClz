/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author bibek
 */
public class HashSetTest {
    public static void main(String[]args){
        HashSet hs =new HashSet();
        hs.add("Bibek");
        hs.add("Dinesh");
        hs.add("Luffy");
        hs.add("Bibek");
        Iterator itr = hs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());        
    }
}
