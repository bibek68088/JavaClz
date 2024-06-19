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

public class Assignment8_SubString {
    public static void main(String[] args) {
        String str = "Hello from the other side,hello hell no";
        str = str.substring(5,35);
        System.out.println(str);
        String strFind = "llo";
        int count = 0, fromIndex = 0;
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1)
        {
            count++;
            fromIndex++;
        }

        System.out.println("Sub strings : " + count);
    }
}
