/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author bibek
 */
public class DeSerialization {
    public static void main(String[]args){
        Employee emp = null;
        try{
        FileInputStream fis = new FileInputStream("D:\\Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        emp = (Employee)ois.readObject();
        }catch(IOException | ClassNotFoundException e){
        e.printStackTrace();}
        System.out.println(emp.name);
        System.out.println(emp.eid);
        System.out.println(emp.contact);
    }
}
