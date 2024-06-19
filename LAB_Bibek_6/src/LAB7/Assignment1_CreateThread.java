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
public class Assignment1_CreateThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Thread is created using runnable");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Assignment1_CreateThread ct = new Assignment1_CreateThread();
        Thread t = new Thread(ct);
        t.start();
    }
}
