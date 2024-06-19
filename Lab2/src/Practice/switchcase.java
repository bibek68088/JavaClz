/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author bibek
 */
import java.util.Scanner;
public class switchcase {
    public static void main(String[]args){
        System.out.print("Select from number 1 to 7:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num){
            case 1:
                System.out.println(num+" is for Sunday");
                break;
            case 2:
                System.out.println(num+"is for Monday");
                break;
            case 3:
                System.out.println(num+" is for Tuesday");
                break;
            case 4:
                System.out.println(num+" is for Wednesday");
                break;
            case 5:
                System.out.println(num+" is for Thursday");
                break;
            case 6:
                System.out.println(num+" is for Friday");
                break;
            case 7:
                System.out.println(num+" is for Saturday");
                break;
            default:
                System.out.println("Error in selection");
        }
    }
}
