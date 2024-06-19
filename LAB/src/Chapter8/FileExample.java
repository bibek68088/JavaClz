/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.*;

public class FileExample {
    public static void main(String[]args){
        File f = new File("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\FileWriter.txt");
        if(f.exists()){
            System.out.println("FileName:\t"+f.getName());
            System.out.println("File Path:"+f.getPath());
            System.out.println("Full Path:"+f.getAbsolutePath());
            System.out.println("Writable\t"+f.canWrite());
            System.out.println("Readable\t"+f.canRead());
            System.out.println("File size in bytes"+f.length());
            System.out.println("Is it directory?");
            if(f.isDirectory()==true){
            System.out.println("It is folder");}
            else{
            System.out.println("It is file");}
            File dir = new File("D:\\3rd Sem\\OOP in Java\\JavaPrograms\\FileWriter.txt");
        }
    }
}
