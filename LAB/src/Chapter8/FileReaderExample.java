/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main (String[]args)throws IOException{
        FileReader fr = new FileReader("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\FileWriter.txt");
        int i = 0;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
