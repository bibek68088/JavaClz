/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author bibek
 */
public class Assignment1_JDBC {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from movies");
            System.out.println("Inserting records into the table...");
            String sql = "insert into movies values(100, 'Rio', 'Animation', 2009)";
            stmt.executeUpdate(sql);
            sql = "insert into movies values(101, 'Reborn Rich', 'Drama', 2022)";
            stmt.executeUpdate(sql);
            sql = "insert into movies values(102, 'Avatar 2', 'Sci-Fi', 2022)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
