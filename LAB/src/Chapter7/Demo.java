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


class Demo{
public static void main(String []args){
Thread t1= new Thread(new ThreadDemo1());
Thread t2= new Thread(new ThreadDemo1());
t1.start();
t2.start();
        }
}
