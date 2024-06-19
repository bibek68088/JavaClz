/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB9;

/**
 *
 * @author bibek
 */
public class Assignment6_UserDefinedPackage {
     public void Package() {
        System.out.println("User defined package is created successfully");
    }

    public static void main(String args[]) {
        Assignment6_UserDefinedPackage udp = new Assignment6_UserDefinedPackage();
        udp.Package();
    }

}
