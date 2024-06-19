/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

/**
 *
 * @author bibek
 */
public class Assignment2_MultipleCatch {
    public static void main(String[]args){
       int a[] = new int[10];
       try{
           a[13] = 5/0;//arithmetic and arrayout of bounds exception occured
       }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){//multiple exceptions handled
           System.out.println("Multiple catch statement executed!!!");
           System.out.println(e);//shows exception caught
       }
    }
}
