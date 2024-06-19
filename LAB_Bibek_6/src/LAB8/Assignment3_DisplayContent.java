/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author bibek
 */
public class Assignment3_DisplayContent {
    public static void main(String[] args) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("D:\\JavaPrograms\\file1.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();// read next line
            }
            
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
