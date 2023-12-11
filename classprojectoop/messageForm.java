/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classprojectoop;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author arets
 */
public class messageForm extends javax.swing.JFrame {
    //  a list of users    
    DatabaseTableCreater dbc = new DatabaseTableCreater();
    private String senderUserName;
    private void refreshUI() {
    }
   
    
    
    // Populate the JComboBox with users during initialization or an appropriate event
private void populateUserComboBox() {
    comboBoxUser.removeAllItems(); // Clear existing items

    // Retrieve all users from the database
    List<String> allUsers = dbc.getAllUsers();

    // Populate the JComboBox with the retrieved users
    for (String user : allUsers) {
        comboBoxUser.addItem(user);
    }
}
    
    
    private void displayNewsFeeds() {
    try {
        List<String> newsFeeds = dbc.getNewsFeeds();

        // Assuming you have a JTextArea named newsFeedTextArea to display the NewsFeeds
        message2TA.setText(""); // Clear existing content

        // newsFeedPost
        for (String newsFeed : newsFeeds) {
        message2TA.append(newsFeed + "\n");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    
    
    
    private void displayMessages(List<String> messages) {
    // Assuming message2TA is a JTextArea for displaying messages
    // You may need to replace message2TA with the actual name of your JTextArea component

    // Clear existing messages in the JTextArea
       message2TA.setText("");

    // Append the retrieved messages to the JTextArea
       for (String message : messages) {
       message2TA.append( message + "\n" );
   
    //String message; 
   // message = sendMessageArea1.getText();
    //message2TA.append("\n" + messages);
   }
    
    
    
}
  
    /**
     * Creates new form messageForm
     */
    public messageForm() {
        
        initComponents();
         // Populate the JComboBox with the list of users
         
            populateUserComboBox();
   
   
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topTextLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        mainPageBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        sendMessageBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        scrollPanelUser1 = new javax.swing.JScrollPane();
        message1TA = new javax.swing.JTextArea();
        sendMessageArea = new javax.swing.JTextField();
        backgroundMessage1Lbl = new javax.swing.JLabel();
        userImage2Lbl = new javax.swing.JLabel();
        scrollPanelUser2 = new javax.swing.JScrollPane();
        message2TA11 = new javax.swing.JTextArea();
        userlbl2 = new java.awt.Label();
        backgroundMessage2Lbl = new javax.swing.JLabel();
        comboBoxUser = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        message2TA = new javax.swing.JTextArea();
        userImage1Lbl = new javax.swing.JLabel();
        newsFeed = new javax.swing.JLabel();
        subMainPageImageLbl = new javax.swing.JLabel();
        searchBarTF = new javax.swing.JTextField();
        mainPageImageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topTextLbl.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        topTextLbl.setForeground(new java.awt.Color(255, 153, 0));
        topTextLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topTextLbl.setText("Chat Console ");
        topTextLbl.setToolTipText("");
        jPanel1.add(topTextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 130, 40));

        mainPageBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainPageBtn.setText("Main Page");
        mainPageBtn.setActionCommand("Back");
        mainPageBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        mainPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 120, 40));

        nextPageBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPageBtn.setText("Next page");
        nextPageBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jPanel1.add(nextPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 120, 40));

        sendMessageBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendMessageBtn.setText("Send");
        sendMessageBtn.setToolTipText("");
        sendMessageBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        sendMessageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendMessageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 100, 40));

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/Search_Image.png"))); // NOI18N
        searchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 50, 30));

        message1TA.setBackground(new java.awt.Color(51, 255, 0));
        message1TA.setColumns(20);
        message1TA.setRows(5);
        scrollPanelUser1.setViewportView(message1TA);

        jPanel1.add(scrollPanelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 290, 140));

        sendMessageArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageAreaActionPerformed(evt);
            }
        });
        jPanel1.add(sendMessageArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 290, 30));

        backgroundMessage1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundMessage1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/chat bacground .png12323.png"))); // NOI18N
        backgroundMessage1Lbl.setToolTipText("");
        backgroundMessage1Lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(backgroundMessage1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 310, 210));

        userImage2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/user_Image_1.png"))); // NOI18N
        userImage2Lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(userImage2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 50, 60));

        message2TA11.setBackground(new java.awt.Color(0, 153, 204));
        message2TA11.setColumns(20);
        message2TA11.setRows(5);
        scrollPanelUser2.setViewportView(message2TA11);

        jPanel1.add(scrollPanelUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, 150));

        userlbl2.setAlignment(java.awt.Label.CENTER);
        userlbl2.setBackground(new java.awt.Color(255, 153, 51));
        userlbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userlbl2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userlbl2.setName(""); // NOI18N
        userlbl2.setText("User2");
        userlbl2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                userlbl2InputMethodTextChanged(evt);
            }
        });
        jPanel1.add(userlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 30));

        backgroundMessage2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        backgroundMessage2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/new 123.png"))); // NOI18N
        backgroundMessage2Lbl.setToolTipText("");
        backgroundMessage2Lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(backgroundMessage2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 310, 170));

        comboBoxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUserActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, -1));

        message2TA.setColumns(20);
        message2TA.setRows(5);
        jScrollPane2.setViewportView(message2TA);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 260, 180));

        userImage1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/user_Image_2.png"))); // NOI18N
        userImage1Lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(userImage1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 60));

        newsFeed.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        newsFeed.setForeground(new java.awt.Color(255, 255, 255));
        newsFeed.setText("jsadads");
        newsFeed.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                newsFeedInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(newsFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 300, 70));

        subMainPageImageLbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        subMainPageImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/Chat_Cansole_p1.gif"))); // NOI18N
        subMainPageImageLbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(subMainPageImageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 730, 410));

        searchBarTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBarTF.setText("  Search ");
        searchBarTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        searchBarTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarTFActionPerformed(evt);
            }
        });
        jPanel1.add(searchBarTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 210, 30));

        mainPageImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/BackGroungImage2Main.jpg"))); // NOI18N
        jPanel1.add(mainPageImageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPageBtnActionPerformed
    frontPage fp = new frontPage();
        fp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPageBtnActionPerformed

    private void sendMessageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageBtnActionPerformed
      // TODO add your handling code here:
  
     // Get the selected user from the comboBox
    String recipientUserName = (String) comboBoxUser.getSelectedItem();
    String message = sendMessageArea.getText();

    if (!message.isEmpty() && recipientUserName != null) {
        int senderUserId = getLoggedInUserId(); // Replace this with your actual method
          

            // Send the message
            dbc.sendMessage(senderUserName, recipientUserName, message);
            System.out.println("Message Sent");

            // Retrieve messages for the user (optional)
            List<String> userMessages = dbc.getMessages(recipientUserName);

            // Do something with the messages, e.g., display them in a UI component
            displayMessages(userMessages);

            // You might want to refresh the UI or perform other actions after sending a message
            refreshUI();

            // Clear the content of the sendMessageArea text field
            sendMessageArea.setText("");
       
        
    } else {
        System.out.println("No user selected or empty message");
    }

    
      
      /*
  // dbc is an instance of your DatabaseHandler class
    

    String userName = userLbl.getText(); //  userLbl1 is a label that displays the username
    String message = sendMessageArea1.getText(); // message1TA is a JTextArea for message input

    // Create tables if they don't exist
    dbc.createDatabase();

    // Send the message
    dbc.sendMessage(userName, message);
    System.out.println("Message Created");
    
    // Retrieve messages for the user (optional)
    List<String> userMessages = dbc.getMessages(userName);
    
    // Do something with the messages, e.g., display them in a UI component
    displayMessages(userMessages);
    
    // Do something with the messages, e.g., display them in a UI component
    
    // You might want to refresh the UI or perform other actions after sending a message
     refreshUI();
  
     
     
     */
    }//GEN-LAST:event_sendMessageBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
     System.exit(WIDTH);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarTFActionPerformed

    private void userlbl2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_userlbl2InputMethodTextChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_userlbl2InputMethodTextChanged

    
    
    
    
    private void newsFeedInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_newsFeedInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_newsFeedInputMethodTextChanged

    private void comboBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUsersActionPerformed
        // TODO add your handling 
     
    }//GEN-LAST:event_comboBoxUsersActionPerformed

    private void comboBoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUserActionPerformed
        // TODO add your handling code here:
              // TODO add your handling code here:
         comboBoxUser.setEnabled(true); // Make sure it's enabled
         comboBoxUser.setVisible(true); // Make sure it's visible
      // Get the selected user from the comboBoxUser
    String selectedUser = (String) comboBoxUser.getSelectedItem();

    if (selectedUser != null) {
        try {
        // Retrieve messages for the user (optional)
       // List<String> userMessages = dbc.getMessages(selectedUser);
        // Do something with the messages, e.g., display them in a UI component
      //  displayMessages(userMessages);

            // Refresh the UI or perform other actions after selecting a user
            refreshUI();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
    } else {
        System.out.println("No user selected");
    }

    }//GEN-LAST:event_comboBoxUserActionPerformed

    private void sendMessageAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageAreaActionPerformed
        // TODO add your handling code here:
        // Assuming sendMessageArea1 is your JTextField
      //sendMessageArea = new javax.swing.JTextField();
      //sendMessageArea.setToolTipText("Enter your message here");
    }//GEN-LAST:event_sendMessageAreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(messageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundMessage1Lbl;
    private javax.swing.JLabel backgroundMessage2Lbl;
    private javax.swing.JComboBox<String> comboBoxUser;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JLabel mainPageImageLbl;
    private javax.swing.JTextArea message1TA;
    private javax.swing.JTextArea message2TA;
    private javax.swing.JTextArea message2TA11;
    private javax.swing.JLabel newsFeed;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JScrollPane scrollPanelUser1;
    private javax.swing.JScrollPane scrollPanelUser2;
    private javax.swing.JTextField searchBarTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField sendMessageArea;
    private javax.swing.JButton sendMessageBtn;
    private javax.swing.JLabel subMainPageImageLbl;
    private javax.swing.JLabel topTextLbl;
    private javax.swing.JLabel userImage1Lbl;
    private javax.swing.JLabel userImage2Lbl;
    private java.awt.Label userlbl2;
    // End of variables declaration//GEN-END:variables

    private static class SQLException {

        public SQLException() {
        }
    }

   
}

