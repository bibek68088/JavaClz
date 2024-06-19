/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCLesson;
import java.sql.*;
/**
 *
 * @author bibek
 */
public class SaveRecord {
    public static void main(String []args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/" +"db_java";
        String uname = "root";
        String pwd ="";
        
        try{
            // Step 1: Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 2: Create connection to database
            Connection con = DriverManager.getConnection(url,uname,pwd);
            // Step3: Create sql query and execute it;
            String sql = "Create table User(Name VARCHAR(30),Address VARCHAR(40),Age INT ,Roll INT)";
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            System.out.println("Table created successfully");
        }catch(SQLException e)
        {
            System.out.println("Exception"+ e.getMessage());
        }
    }
    
} 
