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
public class Assignment9_ArmstrongNumber {
    public static void main (String[]args){
        int temp, sum =0 ;
        System.out.print("Enter the 3-digit number to check if it is Armstrong or not:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int check = number;
        while(number!=0){
            temp = number%10;
            sum = sum+temp*temp*temp;
            number = number/10;
        }
        if(sum==check){
            System.out.println(check + "is an Armstrong number.");
        }else{
            System.out.println(check + "is not an Armstrong number.");
        }
    }
}
