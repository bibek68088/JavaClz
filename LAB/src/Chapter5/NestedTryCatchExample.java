/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;


public class NestedTryCatchExample {
    public static void main(String[]args){
       int a[]={1,2,3,4,5};
       int b,c; 
       try{
           b = 16/a[0];
           try{
               c = b/a[0];
               System.out.println(a[c]);
           }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Invalid Index");}
           }catch(ArithmeticException e){
               System.out.println("Divide by zero error.");
           }
    }
}
