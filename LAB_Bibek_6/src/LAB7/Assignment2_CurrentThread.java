/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB7;

/**
 *
 * @author bibek
 */
public class Assignment2_CurrentThread extends Thread{
    @Override
    public void run() {
        // print current executing thread   
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Assignment2_CurrentThread t1 = new Assignment2_CurrentThread();
        t1.setName("Main Thread");
        t1.start();
        System.out.println(" Thread name is " + t1.currentThread().getName());
    }

}
