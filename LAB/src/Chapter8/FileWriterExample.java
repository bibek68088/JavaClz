/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main (String[]args) throws IOException{
        FileWriter fw = new FileWriter("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\FileWriter.txt");
        fw.write("Java is interesting प्रोग्रामिङ .\nYou will enjoy learning it:");
        fw.close();
        System.out.println("\nInformation is added to the file.");
    }
}
