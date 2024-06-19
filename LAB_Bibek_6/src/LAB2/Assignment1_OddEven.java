/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;
import java.util.Scanner;

public class Assignment1_OddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();//variables declaration.
        String Check = (number%2==0)?"Even":"Odd";//ternary operation calculation
        System.out.println(number + " is: "+Check);//display rhe result
    }
}
