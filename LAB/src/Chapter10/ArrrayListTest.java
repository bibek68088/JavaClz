/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bibek
 */
public class ArrrayListTest {
    public static void main(String[]args){
        ArrayList a= new ArrayList();
        a.add("Taylor");
        a.add("Swift");
        Iterator itr = a.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
