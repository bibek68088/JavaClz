/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

/**
 *
 * @author bibek
 */
public class Assignment5_Count {
    public static void main(String[]args){
        int number = 343535;//variable assigned
        int count = 0;//variable declaration
        while(number!=0){//while loop
            number = number/10;
            count++;//count value incremented by 1
       }
        System.out.println("The toatl count of numbers is:\t"+count);//result
    }
}
