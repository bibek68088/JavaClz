/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamExample {
    public static void main(String[]args)throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\file1.txt");
        String str = "We are studying file input and output stream in Java";
        byte[]b = str.getBytes();
        fout.write(b);
        System.out.println("\nInformation is stored into the file. Let's see it.\t");
        fout.close();
    }
}
