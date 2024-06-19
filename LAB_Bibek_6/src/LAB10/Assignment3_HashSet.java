/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author bibek
 */
public class Assignment3_HashSet {
    public static void main(String[]args){
        HashSet h = new HashSet();//creating hashset
        h.add("One Piece");//adding elemets
        h.add("Spy Family");
        h.add(68088);
        h.add("Magic Shop");
        h.add("One Piece");
        h.remove("Spy Family");
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
