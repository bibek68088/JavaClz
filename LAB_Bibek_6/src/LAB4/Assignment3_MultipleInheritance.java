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

interface iPhone{
    void model();
}

interface Mac{
    void product();    
}
class Apple implements iPhone, Mac{
    public void model(){
        System.out.println("Model: iPhone 14 Pro Max");
    }
    public void product(){
        System.out.println("Model: MacBook Air Pro");
    }
}
public class Assignment3_MultipleInheritance {
    public static void main(String[]args){
        Apple ios = new Apple();
        ios.model();
        ios.product();
    }
}
