/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.*;

public class BufferOutputStreamExample {
    public static void main (String [] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\bfile1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String str = "Students of Orchid college\nLearning chapter file handling\n";
        byte[]b= str.getBytes();
        bout.write(b);
        bout.flush();
        System.out.println("Let's look the content written in the file in the mentioned location.");
        bout.close();
        fout.close();
    }
    
}
