/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author bibek
 */
public class HashTableTest {
    public static void main(String[]args){
        Enumeration name; String key;
        Hashtable ht= new Hashtable();
        ht.put("key 1","Romeo");
        ht.put("key 2", "Peter");
        name = ht.keys();
        while(name.hasMoreElements()){
            key = (String)name.nextElement();
            System.out.println("Key:"+key+"\tValue:"+ht.get(key));
        }
    }
}
