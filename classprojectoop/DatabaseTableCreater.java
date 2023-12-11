/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classprojectoop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class DatabaseTableCreater {
    static final String URL = "jdbc:mysql://localhost:3306/hermes";
    static String userM = "root";
    static String pass = "";
   
    
    
    
    
 //  returns the NewsFeed entries from
    public List<String> getNewsFeeds() {
    List<String> newsFeeds = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(URL, userM, pass);
         Statement statement = connection.createStatement()) {

        String getNewsFeedsQuery = "SELECT newsFeed FROM NewsFeed";
        ResultSet resultSet = statement.executeQuery(getNewsFeedsQuery);

        while (resultSet.next()) {
            String newsFeed = resultSet.getString("newsFeed");
            newsFeeds.add(newsFeed);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        Logger.getLogger(DatabaseTableCreater.class.getName()).log(Level.SEVERE, null, ex);
    }
    return newsFeeds;
  
   }   
  
   
    /**
     *
     */
    public void createDatabase(){
        try{
            
            
            Connection connection = DriverManager.getConnection(URL, userM, pass);
            Statement statement = connection.createStatement();

            // Create database if not exists
            String createDatabaseStatement = "CREATE DATABASE IF NOT EXISTS hermes";
            statement.executeUpdate(createDatabaseStatement);
            System.out.println("Database Created");

            // Switch to the created database
            connection = DriverManager.getConnection(URL, userM, pass);
            System.out.println("Connected to the new database");

            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hermes",user,pass);
            //System.out.println("Connected to new database");

            
           String createTableMessages = "CREATE TABLE IF NOT EXISTS messages ("
                  + "id INT AUTO_INCREMENT PRIMARY KEY not NULL,"
                  + "time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
                  + "message VARCHAR(500),"
                  + "userName VARCHAR(255),"
                  + "profileId INT "
                  // Add more fields if required 
                  + ")";
            statement.executeUpdate(createTableMessages);
            System.out.println("Messages Table Created");

            
            // Create users table
            String createTableUsers = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "userName VARCHAR(255) UNIQUE,"
                    + "password VARCHAR(255),"
                    + "email VARCHAR(255)UNIQUE,"
                    + "profileId INT "
                    // here can Added more Field if requred 
                    + ")";
             statement.executeUpdate(createTableUsers);
            System.out.println("Users Table Created");
            
            
            // Create NewsFeeds table
            String createTableNews = "CREATE TABLE IF NOT EXISTS NewsFeed ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    +"time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
                    + "userName VARCHAR(255),"
                    + "newsFeed VARCHAR(255)"
                    //here can Added more Field if requred 
                    + ")";
             statement.executeUpdate(createTableNews);
            System.out.println("NewsFeeds table Created");
            
            
          /*  String newTableM = "CREATE TABLE messages("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                 + "userName VARCHAR(255),"
                    + "message VARCHAR(255))";
            statement.executeUpdate(newTableM);
            System.out.println("Table created");
            
            System.out.println("Table Created");
               */
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param getAllUsers
     * @param users
     * @param passwords
     * @param email
     * @param newsFeed
     */
    
    
     /**
      * @return
    */
    
    public List<String> getAllUsers() {
    List<String> users = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(URL, userM, pass);
         Statement statement = connection.createStatement()) {

        String getUsersQuery = "SELECT userName FROM users";
        ResultSet resultSet = statement.executeQuery(getUsersQuery);

        while (resultSet.next()) {
            String userName = resultSet.getString("userName");
            users.add(userName);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Add additional logging or handle the exception as needed
    }
    return users;
    }
    
    
    
   public boolean loginUser(String userName, String password) {
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM users WHERE userName = ? AND password = ?")) {

            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
     
    public void insertUser(String users, String passwords, String email) {
    try (Connection connection = DriverManager.getConnection(URL, userM, pass);
         Statement statement = connection.createStatement()) {

        String insertUser = "INSERT INTO users(userName, password, email) VALUES('" + users + "','" + passwords + "','" + email + "')";
        statement.executeUpdate(insertUser);

        System.out.println("User Added");
    } catch (SQLIntegrityConstraintViolationException e) {
        // Handle duplicate entry (username or email already exists)
        System.out.println("Username or email already exists.");
        JOptionPane.showMessageDialog(null, "Username or email already exists.");
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle other exceptions appropriately in your application
    }
    }
      
    /*
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
*/
    /**
     *
     * @param message
     */
   
    
     /**
     * Sends a message from the logged-in user to the selected recipient.
     * @param senderUserId The ID of the logged-in user.
     * @param recipientUserName The username of the recipient selected from ComboBox.
     * @param message The message content.
     */
    public void sendUserMessage(int senderUserId, String recipientUserName, String message) {
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO messages(message, sender_id, recipient_id) VALUES (?, ?, (SELECT id FROM users WHERE userName = ?))")) {

            statement.setString(1, message);
            statement.setInt(2, senderUserId);
            statement.setString(3, recipientUserName);
            statement.executeUpdate();

            System.out.println("Message Sent");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Retrieves messages for the specified user.
     * @param userId The ID of the user.
     * @return A list of messages.
     */
    public List<String> getMessages(int userId) {
        List<String> messages = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT message FROM messages WHERE recipient_id = ?")) {

            preparedStatement.setInt(1, userId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String message = resultSet.getString("message");
                    messages.add(message);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return messages;
    }

    
    
   /*
    public void sendMessage(String senderUserName, String recipientUserName, String message) {
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO messages(message, sender_id, recipient_id) VALUES (?, (SELECT id FROM users WHERE userName = ?), (SELECT id FROM users WHERE userName = ?))")) {

            statement.setString(1, message);
            statement.setString(2, senderUserName);
            statement.setString(3, recipientUserName);
            statement.executeUpdate();

            System.out.println("Message Sent");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<String> getMessages(String userName) {
        List<String> messages = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT message FROM messages WHERE recipient_id = (SELECT id FROM users WHERE userName = ?)")) {

            preparedStatement.setString(1, userName);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String message = resultSet.getString("message");
                    messages.add(message);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return messages;
    }
   public List<String> getMessagesByRecipient(String recipientUserName) {
    List<String> messages = new ArrayList<>();
    try (Connection connection = DriverManager.getConnection(URL, userM, pass);
         PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT message FROM messages WHERE recipient_id = (SELECT id FROM users WHERE userName = ?)")) {

        preparedStatement.setString(1, recipientUserName);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String message = resultSet.getString("message");
                messages.add(message);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return messages;
}
   
    /*
    public void sendMessage(String userName, String message) {
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             Statement statement = connection.createStatement()) {

            // Get the profileId for the specified userName
            String getProfileIdQuery = "SELECT id FROM users WHERE userName = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(getProfileIdQuery);
            int profileId = -1; // Initialize with a default value

            if (resultSet.next()) {
                profileId = resultSet.getInt("id");
            }

            // Insert the message
            String sentMessage = "INSERT INTO messages(message, userName, profileId) VALUES('" + message + "', '" + userName + "'," + profileId + ")";
            statement.executeUpdate(sentMessage);
            System.out.println("Message Sent");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<String> getMessages(String userId) {
    List<String> messages = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(URL, userM, pass);
        String query = "SELECT message FROM messages WHERE user_id = 1";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, userId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String message = resultSet.getString("message");
                    messages.add(message);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle the exception appropriately in your application
    }
    return messages;
}    
    
 /*   // The following method retrieves messages for a specific user based on userName
    public List<String> getMessages(String userName) {
        List<String> messages = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, userM, pass);
             Statement statement = connection.createStatement()) {

            // Get the profileId for the specified userName
            String getProfileIdQuery = "SELECT id FROM users WHERE userName = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(getProfileIdQuery);
            int profileId = 0; // Initialize with a default value

            if (resultSet.next()) {
                profileId = resultSet.getInt("id");
            }

            // Retrieve messages for the user
            String getMessageQuery = "SELECT message FROM messages WHERE profileId = " + profileId+ "'";
            resultSet = statement.executeQuery(getMessageQuery);

            while (resultSet.next()) {
                String message = resultSet.getString("message");
                messages.add(message);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return messages;
    }
  */ 
    
   /*public void sendMessage(String message){
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
*/
    /**
     *
     * @ return
     
  
    public String getMessage(){
        String message = "";
        try {
            
            Connection connection = DriverManager.getConnection(URL,user,pass);
            Statement statement = connection.createStatement();
            String getMessage = "SELECT messages FROM messages WHERE id = 1";
            ResultSet resultSet = statement.executeQuery(getMessage);
            
            if (resultSet.next()) {
                 message = resultSet.getString("messages");
            }
             
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTableCreater.class.getName()).log(Level.SEVERE, null, ex);
        }
         return message;
    }
   */
    /**
     *
     * @param NewsFeed
     */
   public void createNewsFeed(String newsFeed, String userName) {
    try (Connection connection = DriverManager.getConnection(URL, userM, pass);
         Statement statement = connection.createStatement()) {


        // Insert the news feed   
        String insertNewsFeed = "INSERT INTO NewsFeed(userName, newsFeed) VALUES('" + newsFeed + "','" + userName + "')";
        statement.executeUpdate(insertNewsFeed);
        System.out.println("NewsFeed Posted");

    } catch (SQLException ex) {
        ex.printStackTrace();
        Logger.getLogger(DatabaseTableCreater.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    
}

    void sendMessage(String senderUserName, String recipientUserName, String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<String> getMessages(String recipientUserName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

   

    
 


    
