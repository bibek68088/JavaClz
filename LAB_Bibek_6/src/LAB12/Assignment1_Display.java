/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB12;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author bibek
 */
public class Assignment1_Display {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            //serverhost = localhost, port=3306, username=root, password=123
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "");
            Statement smt = cn.createStatement();

            //query to display all records from table employee
            String q = "Select * from movies";

            //to execute query
            ResultSet rs = smt.executeQuery(q);

            //to print the resultset on console
            if (rs.next()) {
                do {
                    System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getInt(4));
                } while (rs.next());
            } else {
                System.out.println("Record Not Found...");
            }
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
