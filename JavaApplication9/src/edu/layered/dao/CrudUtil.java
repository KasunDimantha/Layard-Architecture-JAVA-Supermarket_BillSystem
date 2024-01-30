/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.layered.dao;


import java.sql.ResultSet;
import java.sql.PreparedStatement;
import edu.layered.db.DBConnection;
import java.sql.Connection;


/**
 *
 * @author tharidu dilshan
 */
public class CrudUtil {
    public static PreparedStatement getPreparedStatement(String sql, Object... args) throws Exception{
       Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if(args != null){
            for(int i = 0; i < args.length; i++){
                preparedStatement.setObject(i+1, args[i]);
            }
        }
        return preparedStatement;
    }

    public static boolean executeUpdate(String sql, Object... args) throws Exception{
        return getPreparedStatement(sql, args).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... args) throws Exception{
        return getPreparedStatement(sql, args).executeQuery();
    }
}
