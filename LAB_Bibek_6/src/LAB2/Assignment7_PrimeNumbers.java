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
public class Assignment7_PrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j, number, count;//variable declaration
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.println("The prime numbers between 1 and " + number +" are:");//result
        for (i = 2; i<=number; i++) {//for loop implementation
            count = 0;//variable assigned
            for (j = 1; j<=i; j++) {//for loop implementation
                if (i%j == 0) {
                    count++;//increment
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
                        
            }
        }
    }
}
