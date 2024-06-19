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
public class SleepThreadTest extends Thread{
    public void run(){
    for(int i=0;i<5;i++){
    try{
    Thread.sleep(1000);
    }catch(Exception e){}
        System.out.println(i);
    }
    }
    
}
