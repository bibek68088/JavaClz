/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB9;

import java.util.Scanner;

/**
 *
 * @author bibek
 */
public class Assignment3_RoundedFloat {
    public static void main(String[] args){
        float f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float number: ");
        f = sc.nextFloat();
        float fn = Math.round(f);
        System.out.println(fn);

    }

}
