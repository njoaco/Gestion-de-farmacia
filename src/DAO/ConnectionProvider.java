/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider{

    public static Connection getCon(){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");  // Ya no es necesario cargar manualmente el controlador
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/farmacia?useSSL=false&serverTimezone=UTC", "root", "");
            return con;
        }
        catch(Exception e){
             System.out.println(e);
             return null;
        }
    }
    
}
