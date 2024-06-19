/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCLesson;

import java.sql.*;
import java.util.*;

/**
 *
 * @author bibek
 */
public class StoredProcedure {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name, age and roll");
        String name = ob.next();
        int age = ob.nextInt();
        int roll = ob.nextInt();
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String pwd = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pwd);
            CallableStatement st = con.prepareCall("{call insert_record(?,?,?)}");
            st.setString(1, name);
            st.setInt(2, age);
            st.setInt(3, roll);
            st.execute();
            System.out.println("Record saveda");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
