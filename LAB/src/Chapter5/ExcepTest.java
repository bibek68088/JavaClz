/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;


public class ExcepTest {
    public static void main(String[]args){
        int a[] = new int [2];
        try{
            System.out.println("access element threee:"+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown."+e);
        }
        finally{
        a[0] =6;
        System.out.println("First element value:"+a[0]);
        System.out.println("Finally statement is executed.");
        }
    }
}
