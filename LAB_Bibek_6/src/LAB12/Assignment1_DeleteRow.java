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
public class Assignment1_DeleteRow {

    private static final String SQL_DELETE = "DELETE FROM movies WHERE title=?";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "");
                PreparedStatement preparedStatement = con.prepareStatement(SQL_DELETE)) {

            preparedStatement.setString(1, "Rio");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
