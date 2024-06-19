/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB12;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bibek
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Assignment1_CreateTable {

    public static void main(String[] args) {
        //create database
        
//      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
//         Statement stmt = conn.createStatement();
//      ) {		      
//         String sql = "CREATE DATABASE person";
//         stmt.executeUpdate(sql);
//         System.out.println("Database created successfully...");   	  
//      } catch (SQLException e) {
//         e.printStackTrace();
//      } 
     
        /*
        *create table
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","");
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE movies " +
                   "(id INTEGER not NULL, " +
                   " title VARCHAR(255), " + 
                   " genre VARCHAR(255), " + 
                   " yearOfRelease int(10))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      */
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","");
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO movies VALUES(100, 'Avatar', 'Sci-Fi', 2009)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES(101, 'Avenger: Endgame', 'Sci_fi', 2019)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES(102, 'Avatar 2', 'Sci_fi', 2022)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
