/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author bibek
 */
interface A{
    void meth1();
    void meth2();
}

class MyClass implements A{
    public void meth1(){
        System.out.println("Implementation of meth1()");
    }
    public void meth2(){
        System.out.println("Implementation of meth2()");
    }
    
}

public class Assignment2_A {
    public static void main(String[]args){
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}
