/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB6;

import java.util.Scanner;

/**
 *
 * @author bibek8
 * 
 */

public class Assignment7_Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 10: ");
        int number = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(number+" * "+i +" = " + number*i);
        }
    }
}
