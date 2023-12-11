/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classprojectoop;

import static classprojectoop.DatabaseTableCreater.URL;
import static classprojectoop.DatabaseTableCreater.pass;
import static classprojectoop.DatabaseTableCreater.userM;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jason
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DatabaseTableCreater dbc = new DatabaseTableCreater();
         dbc.createDatabase();
         HermesFrame frame = new HermesFrame();
         FrameForPanels ffp = new FrameForPanels();
         frontMainPage fmp = new frontMainPage();
         frontPage fp = new frontPage();
         messageForm mf = new  messageForm();
         userProfileForm upf = new userProfileForm();
         MainPageImage mpi = new MainPageImage();

        
    }
    
    
    }
    
 
