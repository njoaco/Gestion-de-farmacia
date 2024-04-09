/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane; 
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args) {
        try{
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200), name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),adress varchar(200))"); //Creamos las tablas en la base de datos
           st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,adress) values('Admin','Admin','10-04-2005','1100000045','admin@gmail.com','admin','admin','Argentina')"); //Creamos el usuario 'admin'
           JOptionPane.showMessageDialog(null, "Tabla Creada/Actualizada");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
    }
    }
}
