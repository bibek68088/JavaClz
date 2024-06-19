/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author bibek
 */
public class ReadAndWrite {
    void readWrite()throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("D:\\lax.txt");
    }
    void save()throws FileNotFoundException{
        String s = "this is demo";
        FileOutputStream fos = new FileOutputStream("D:\\padma.txt");
    }
}

class Test{
    public static void main(String[]args){
        ReadAndWrite r= new ReadAndWrite();
        try{
            r.readWrite();
        }catch(FileNotFoundException e){
        e.printStackTrace();}
        System.out.println("Hi");
    }
}