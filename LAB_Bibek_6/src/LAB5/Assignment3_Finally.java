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
public class Assignment3_Finally {
    public static void main(String[]args){
        int a[] = new int[5];
        int b;
        try{
            b =a[6];//array out of bounds error occured
            System.out.println(b);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);//exception handled
        }finally{
            b = a[4];//new statement created
            System.out.println("Value of a[4]: "+b);
            System.out.println("Finally executed");
        }
    }
}
