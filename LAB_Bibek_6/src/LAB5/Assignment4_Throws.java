/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

import java.io.IOException;  

/**
 *
 * @author bibek
 */

class titan{  
 void method()throws IOException{  
  System.out.println("No error");  
 }  
}  
class Assignment4_Throws{  
   public static void main(String args[])throws IOException{//declare exception  
     titan o =new titan();  
     o.method();  
  
    System.out.println("Hi!!!");  
  }  
}  