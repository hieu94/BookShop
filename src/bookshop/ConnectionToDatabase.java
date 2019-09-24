/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hieu
 */
public class ConnectionToDatabase {

    private static Connection conn;
    private static PreparedStatement stmt;

    public void ConnectToDatabase() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-57BEVLM\\SQLEXPRESS;databaseName=ShopBanSach;user=sa;password=baxacuaanh0751961";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Successfully connected to the database!");
            }
        } catch(SQLException ex) {
            System.out.println("Error connecting to the database!" + ex);
        }
    }
    
    public ResultSet Query(String sql) {
        ResultSet resultSet = null;
        try {
            ConnectToDatabase();
            stmt = conn.prepareStatement(sql);
            resultSet = stmt.executeQuery();
        } catch(Exception ex) {
            System.out.println("Error querying from database! " + ex);
        }
        return resultSet;
    }
    
    public void Update(String sql) {
        try {
            ConnectToDatabase();
            stmt = conn.prepareStatement(sql);
            int row = stmt.executeUpdate();
            if (row == 1) {
                System.out.println("Success! Data updated!");
            }
            stmt.close();
            conn.close();
        } catch(Exception ex) {
            System.out.println("Error! " + ex);
        }
    }

}
