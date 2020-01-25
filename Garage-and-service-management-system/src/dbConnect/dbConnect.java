/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnect;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Pramesh
 */
public class dbConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public static Connection dbConnection()
        {
           Connection con = null;
           
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
                
            } 
            catch (Exception e) 
            { 
                System.err.println(e);
                
            }
                
           return con;
        }
    
}
