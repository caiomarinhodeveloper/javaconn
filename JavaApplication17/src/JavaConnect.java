/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
   Connection conn = null;
   public static Connection ConnectDb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Caio\\Documents\\meudb.sqlite");
           //JOptionPane.showMessageDialog(null, "CONNECTION ESTABLISHED");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
    
}
