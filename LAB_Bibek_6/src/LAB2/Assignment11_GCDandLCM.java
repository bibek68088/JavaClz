/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;

public class Assignment11_GCDandLCM {
    public static void main(String [] args){
        int numberFirst, numberSecond;//variable declaration
        System.out.println("Enter the first and second number:");
        Scanner sc = new Scanner(System.in);
        numberFirst = sc.nextInt();//variable assignment
        numberSecond = sc.nextInt();//variable assignment
        
        int x = numberFirst, y = numberSecond;//copying value
        while(x!=y){
            if(x>y){
                x = x - y;
            }else{
                y = y - x;
            }
        }
        System.out.println("GCD of " + numberFirst + "and" + numberSecond + "is:"+x);
        //calculatio of HCf
        System.out.println("LCM of " + numberFirst + "and" + numberSecond + "is:"+(numberFirst*numberSecond)/x);
    }
}
