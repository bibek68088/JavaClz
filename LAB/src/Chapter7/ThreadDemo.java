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
public class ThreadDemo implements Runnable{
    @Override
    public void run(){
    System.out.println("This is thread using runnable");
    }
    
    public static void main(String[]args){
    ThreadDemo td = new ThreadDemo();
    Thread t =new Thread(td);
    t.start();
    
    Runnable r = new Runnable(){
    @Override
    public void run(){
    System.out.println("This is thread using anonymous runnable");
    }
    };
    
    Thread t2 = new Thread(r);
    t2.start();
    }
    
}
