/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB6;

/**
 *
 * @author bibek
 */
class StringReverse {
        void reverseString(String str){
        char[] result = str.toCharArray();
        System.out.print("Reversed string : ");
        for(int i = result.length; i>0;--i){
            System.out.print(" "+str.charAt(i-1));
        }
    }
}

public class Assignment6_StringBuilder {
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.reverseString("Monkey D Luffy");
    }
}
