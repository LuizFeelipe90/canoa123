/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAO;

/**
 *
 * @author francisvan
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
    public Connection getConnection(){
        Connection conn = null;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/canoa123?useSSL=false", "root", "Olv@3625");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }   
}
