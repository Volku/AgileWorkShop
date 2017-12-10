/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rei
 */
public class ConnectionBuilder {

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/?user=root";
        String username = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivre loaded");
        }catch(ClassNotFoundException e){
            System.out.println("fuck u");
        }
        System.out.println("Connecting database...");
       
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("kk");
            return connection;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
