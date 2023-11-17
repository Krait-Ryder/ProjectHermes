/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classprojectoop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class DatabaseTableCreater {
    static final String URL = "jdbc:mysql://localhost:3306/hermes";
    static  String user = "root";
    static  String pass = "";
    public void createDatabase(){
        try{
            
            Connection connection = DriverManager.getConnection(URL,user,pass);
            Statement statement = connection.createStatement();
            String createStatement = "CREATE DATABASE IF NOT EXISTS hermes";
            statement.executeUpdate(createStatement);
            System.out.println("Database Created");

            /*connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hermes",user,pass);
            System.out.println("Connected to new database");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hermes",user,pass);
            System.out.println("Connected to new database");/*

            String createTable = "CREATE TABLE IF NOT EXSISTS messages("
                    + "id INT AUTO_INCREMENT PRIMARY KEY not NULL,"
                    + "message VARCHAR(500),"
                    + "time TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                    + "profileId INT NOT NULL"
                    + ")";
            statement.executeUpdate(createTable);

            System.out.println("Table Created Hello");
            String 
*/
           /* String newTable = "CREATE TABLE users("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "userName VARCHAR(255),"
                    + "password VARCHAR(255),"
                    + "email VARCHAR(255))";
            statement.executeUpdate(newTable);
            System.out.println("Table created");*/
            String newTable = "CREATE TABLE messages("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "message VARCHAR(255))";
            statement.executeUpdate(newTable);
            System.out.println("Table created");
            
            System.out.println("Table Created");*/

        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void insertUser(String users,String passwords, String email){
        try{  
          Connection connection = DriverManager.getConnection(URL,user,pass);
          Statement statement = connection.createStatement();
          String insertUser = "INSERT INTO users(userName,password,email) VALUES('"+users+"','"+passwords+"','"+email+"')";
          String [] strings = new String []{users,passwords,email};
          
          statement.executeUpdate(insertUser, strings);
            System.out.println("User Added");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void sendMessage(String message){
        // send the message
          Connection connection;
        try {
            connection = DriverManager.getConnection(URL,user,pass);
             Statement statement = connection.createStatement();
             String sentMessage = "INSERT INTO messages(message) VALUES('"+message+"')";
             statement.executeUpdate(sentMessage);
             System.out.println("Message Sent");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTableCreater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getMessage(){
        String message = "";
        try {
            
            Connection connection = DriverManager.getConnection(URL,user,pass);
            Statement statement = connection.createStatement();
            String getMessage = "SELECT message FROM messages WHERE id = 1";
            statement.executeUpdate(getMessage);
           
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTableCreater.class.getName()).log(Level.SEVERE, null, ex);
        }
         return message;
    }
 
}

    
