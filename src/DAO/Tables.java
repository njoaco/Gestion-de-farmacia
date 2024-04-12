/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//EJECUTAR ESTE ARCHIVO PARA AGREGAR LAS TABLAS A LA BASE DE DATOS SQL.
//DESCOMENTAR LO QUE SEA NECESARIO PARA CREARLAS.

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
           //st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,adress) values('Admin','Admin','10-04-2005','1100000045','admin@gmail.com','admin','admin','Argentina')"); //Creamos el usuario 'admin'
           ///st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueId varchar(200), name varchar(200), companyName varchar(200), quantity bigint, price bigint)");
           //st.executeUpdate("create table bill (bill_pk int AUTO_INCREMENT primary key, billId varchar(200), billDate varchar(50), totalPaid bigint,generatedBy varchar(50))");
           JOptionPane.showMessageDialog(null, "Tabla(s) Creada(s)/Actualizada(s)");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
    }
    }
}
