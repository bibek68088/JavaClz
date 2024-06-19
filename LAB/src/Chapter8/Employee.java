/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.io.*;


class Employee implements Serializable{
    String name;
    int eid;
    String contact;
    Employee(String n, int r, String c){
        this.name= n;
        this.eid = r;
        this.contact = c;
    } 
    }
    class Demo{
        public static void main(String []args){
            try{
                Employee emp = new Employee("Kamal",27,"9876543210");
                FileOutputStream fos = new FileOutputStream("D://Student.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(emp);
                oos.flush();
                oos.close();
            }
            catch(IOException e){
            System.out.println(e);}
        }
    }
