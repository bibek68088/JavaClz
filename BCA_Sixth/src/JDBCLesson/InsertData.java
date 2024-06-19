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
public class InsertData {
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
            String sql = "INSERT Into user(Name, Age, Roll, Password) VALUES('Killua',16,09,'Killua@1'),('Pain',26,01,'Pain@1')";
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            System.out.println("Data Inserted successfully");
        }catch(SQLException e)
        {
            System.out.println("Exception"+ e.getMessage());
        }
    }
    
}
