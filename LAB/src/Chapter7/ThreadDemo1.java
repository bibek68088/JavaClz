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
public class ThreadDemo1 implements Runnable{
    public void run(){
    for(int i=0;i<3;i++){
    System.out.println(Thread.currentThread().getId()+"Value:"+i);
    }
    try{
    Thread.sleep(100);
    }catch(InterruptedException e){
    e.printStackTrace();
    }
    }
    
}
