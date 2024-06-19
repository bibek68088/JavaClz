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
public class Assignment6_SumOfPositiveInteger {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int number = sc.nextInt();//variable declaration
        int digit, sum =0;//variable declaration
        while(number!=0){
            digit = number%10;//variable assigned
            sum = sum + digit;//variable assigned
            number = number/10;
        }
        System.out.println("The sum of individual digits of a positive integer is:\t"+sum);//result
    }
}
