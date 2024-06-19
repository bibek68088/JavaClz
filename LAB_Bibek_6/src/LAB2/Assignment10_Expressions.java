/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;
/**
 *
 * @author bibek
 */
public class Assignment10_Expressions {
    public static void main(String [] args){
        float x,y;//variable declararion
        System.out.println("Enter the value of x:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();//variable assignment
        System.out.println("Enter the value of y:");
        y = sc.nextFloat();//variable assignment
        float a = (x+y)/(x-y);//calculation
        float b = (x+y)*(x-y);//calculation
        System.out.print("(x+y)/(x-y) = "+ a +"(x+y)(x-y) = "+b);
    }
}
