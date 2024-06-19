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
public class PreparedExample {
    public static void main(String [] args) throws SQLException, ClassNotFoundException{
        Scanner ob = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String pwd="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, uname , pwd);
            
            for(int i = 1; i<=3;i++){
                System.out.println("Enter name, roll, age");
                String Name = ob.next();
                int Roll = ob.nextInt();
                int Age = ob.nextInt();
                String sql = "Insert into user(Name, Roll, Age) Values(?,?,?)";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, Name);
                st.setInt(2, Roll);
                st.setInt(3, Age);
                st.execute();
            }
            con.close();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
 