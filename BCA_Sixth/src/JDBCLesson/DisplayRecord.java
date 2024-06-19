/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCLesson;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author bibek
 */
public class DisplayRecord {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String pwd = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pwd);

            String sql = "Select Name,age,roll from user";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
//                System.out.println(rs.getString("Password"));
                System.out.println(rs.getString("Age"));
                System.out.println(rs.getString("Roll"));
            }
        
        con.close();
    }
    catch(Exception e){
            System.out.println(e);
    }
}
}
