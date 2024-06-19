/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author bibek
 */
public class ThreadImplementTest implements Runnable{
   @Override
   public void run(){
   System.out.println("Thread implements runnable class");
   }
   
   public static void main(String[]args){
   ThreadImplementTest tit = new ThreadImplementTest();
   Thread t= new Thread(tit);
   t.start();
   System.out.println(t.getId());
   System.out.println(t.getName());
   }
    
}