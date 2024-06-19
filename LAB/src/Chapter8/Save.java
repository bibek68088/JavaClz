/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Save implements Serializable{
    int i;
}

class SerialDemo{
    public static void main(String[]args)throws IOException,ClassNotFoundException{
        Save obj = new Save();
        obj.i =50;
        File f = new File("D:\\Serial.txt");
        FileOutputStream fis = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(obj);
        oos.close();
        fis.close();
        System.out.println("Serialized data is saved in Serial.txt in D drive! Check it?");
        FileInputStream fis1= new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis1);
        Save obj1 = (Save)ois.readObject();
        System.out.println("Value after deserialized is:\t"+obj1.i);
    }
}
