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
public class SleepTest {
    public static void main(String[]args){
    SleepThreadTest t= new SleepThreadTest();
    System.out.println("Thread ID is:\t"+t.getId());
    System.out.println("Thread name is:\t"+t.getName());
    t.setName("Bibek");
    System.out.println("Thread name is:\t"+t.getName());
    t.start();
    }
}
