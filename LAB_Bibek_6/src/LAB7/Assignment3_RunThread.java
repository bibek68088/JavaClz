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
public class Assignment3_RunThread extends Thread {
    Assignment3_RunThread() {
        Thread t1 = new Thread();
        t1.start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " Thread is Running");
    }
}
class RunThread {

    public static void main(String[] args) {
        Assignment3_RunThread t2 = new Assignment3_RunThread(); 
        Thread t = new Thread(t2);
        t.start();
    }
}
