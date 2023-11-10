/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classprojectoop;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class DatabaseTableCreater {
    static final String URL = "jdbc:mysql://localhost:3306";
    static  String user = "root";
    static  String pass = "";
    public void createDatabase(){
        try{
            
            Connection connection = DriverManager.getConnection(URL,user,pass);
            Statement statement = connection.createStatement();
            String createStatement = "CREATE DATABASE IF NOT EXISTS hermes";
            statement.executeUpdate(createStatement);
            System.out.println("Database Created");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hermes",user,pass);
            System.out.println("Connected to new database");/*
            String createTable = "CREATE TABLE IF NOT EXSISTS messages("
                    + "id INT AUTO_INCREMENT PRIMARY KEY not NULL,"
                    + "message VARCHAR(500),"
                    + "time TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                    + "profileId INT NOT NULL"
                    + ")";
            statement.executeUpdate(createTable);
            System.out.println("Table Created");*/
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
