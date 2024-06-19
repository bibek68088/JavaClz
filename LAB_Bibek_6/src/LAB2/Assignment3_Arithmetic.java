/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;

public class Assignment3_Arithmetic {
    public static void main(String[]args){
       Scanner sc  = new Scanner(System.in);
       System.out.print("Enter the value of a:");
       float a = sc.nextFloat();//variable declaration.
       
       System.out.print("Enter the value of b:");
       float b = sc.nextFloat();//variable declaration.

       System.out.print("Enter the value of c:");
       float c = sc.nextFloat();//variable declaration.

       System.out.print("Enter the value of d:");
       float d = sc.nextFloat();//variable declaration.

       System.out.print("Enter the value of e:");
       float e = sc.nextFloat();//variable declaration.

       System.out.print("Enter the value of f:");
       float f = sc.nextFloat();//variable declaration.

       System.out.print("Enter the value of g:");
       float g = sc.nextFloat();//variable declaration.
       float calculation = ((a+b/c*d-e)*(f-g));// mathematical calculation
       System.out.println("The answer is:\t"+calculation);//display the result
    }
}
