/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.InputStreamReader;

/**
 *
 * @author bibek
 */
public class Assignment4_Read3Lines {
    public static void main(String args[]) {
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader
        (new InputStreamReader(new FileInputStream("D:\\JavaPrograms\\file1.txt")));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
