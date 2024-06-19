/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB10;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author bibek
 */
public class Assignment4_Stack {
    public static void main(String[]args){
        Stack s = new Stack();//creating stack
        s.push("Everytime I see you");//pushing elements
        s.push("Lalisa");
        s.push(680.88);
        s.push("Goblin");
        s.pop();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
