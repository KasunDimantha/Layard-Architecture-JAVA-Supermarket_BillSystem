/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.db;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tharidu dilshan
 */
public class DBConnection {
    
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "WGkd1997@");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DBConnection getInstance() {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }

        return dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
