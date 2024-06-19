/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;
/**
 *
 * @author bibek
 */
public class Assignment8_ProfitLoss {
    public static void main (String[]args){
        float cp,sp;//cp= cost priice and sp = selling price
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price:");
        cp = sc.nextFloat();//taking input of cost [rice from the user

        System.out.println("Enter the selling price:");
        sp = sc.nextFloat();//taking selling price from the user.
        float PL = sp-cp;//Calculating profit or loss.
        float percentage = (PL/cp)*100;//Calculating profit or loss percentage
        if(PL>0){
            System.out.println("The profit is:"+PL);
            System.out.println("The profit % is:"+percentage);
        }else{
            System.out.println("The loss is:"+PL);
            System.out.println("The loss % is:"+percentage);
        }
    }
}
