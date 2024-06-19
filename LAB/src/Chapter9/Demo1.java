/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author bibek
 */
public class Demo1 {
    public static void main(String[]args){
        Integer i =new Integer(10);
        //Autoboxing the char.
        int i1= i;
        System.out.println("Value of i:"+i);
        System.out.println("Value of i1:"+i1);
        //Unboxing of object.
        Character ch = 'a';
        //Autouboxing of character
        char ch1 = ch;
        System.out.println("Value of ch:"+ch);
        System.out.println("Value of ch1:"+ch1);
    }
}
