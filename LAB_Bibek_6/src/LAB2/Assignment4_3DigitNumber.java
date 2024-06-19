/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.,
 */
package LAB2;

/**
 *
 * @author bibek
 */
public class Assignment4_3DigitNumber {
    public static void main (String [] args){
        int number  = 743;//variable declaration
        int digit =0, remainder;//variable declaration
        while(number!=0){//while loop declaration.
            remainder = number % 10;//varaible assigned
            digit = remainder + digit;//variable assigned
            number = number /10;
        }
        System.out.println("The sum of individual three digit number is:\t"+digit);//result
    }
}
