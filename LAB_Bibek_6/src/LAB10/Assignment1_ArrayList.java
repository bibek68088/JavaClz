/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bibek
 */
public class Assignment1_ArrayList {
    public static void main(String[]args){
        ArrayList a = new ArrayList();//creating array list
        a.add("Bibek");//adding elements
        a.add("Dinesh");
        a.add("Pain");
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
