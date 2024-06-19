/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import java.util.Stack;

/**
 *
 * @author bibek
 */
public class StackTest {
    public static void main(String[]args){
        Stack<Integer> s= new Stack<Integer>();
        s.push(5);
        s.push(2);
        s.push(6);
        s.push(9);
        s.push(8);
        s.push(9);
        s.pop();
        System.out.println(s.peek());
        s.push(7);
        System.out.println(s.search(9));
        System.out.println(s);
    }
}
