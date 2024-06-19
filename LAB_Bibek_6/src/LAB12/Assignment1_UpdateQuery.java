/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB12;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author bibek
 */
public class Assignment1_UpdateQuery {

    public static void main(String args[]) {
        String sqlUpdate = "UPDATE movies "
                + "SET title = ? "
                + "WHERE id = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            String title = "Black Panther";
            int id = 102;
            pstmt.setString(1, title);
            pstmt.setInt(2, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}