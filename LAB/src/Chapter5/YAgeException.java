/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 *
 * @author bibek
 */
public class YAgeException extends RuntimeException{
    YAgeException(String msg){
        super(msg);
    }
}

class VoteProcessing{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age:\t");
        int age = s.nextInt();
        try{
            if(age<18){
            throw new YAgeException("You are not eligible to vote.");
        }else{
                System.out.println("Vote successful");
            }
        }catch(YAgeException e){
        e.printStackTrace();}
    }
}
