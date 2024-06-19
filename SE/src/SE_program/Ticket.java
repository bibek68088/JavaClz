package SE_program;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bibek
 */
import java.io.*;

public class Ticket {
    public static void main(String[]args) throws IOException{
        String category;
        int numOfPersons;
        int totalPrice;
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(reader);
        
        System.out.println("Enter category:");
        category = 
        System.out.println("Enter the number of persons:");
        numOfPersons = Integer.parseInt(bufferedReader.readLine());
        
        
        if(category.equals("Silver")){
            totalPrice = numOfPersons *150;
        }
        else if(category.equals("Golden")){
            totalPrice = numOfPersons *200;
        }else{
            System.out.println("Error!!!");
        }
        
        System.out.println("Category: "+category);
        System.out.println("Number of person: "+numOfPersons);
        System.out.println("Total Price: "+totalPrice);
    }
}
