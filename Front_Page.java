/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classprojectoop;
import javax.swing.JPanel;
/**
 *
 *
 * @author arets
 */
public class Front_Page extends javax.swing.JInternalFrame {
    DatabaseTableCreater dbc = new DatabaseTableCreater();
    /**
     * Creates new form Front_Page
     */
    public Front_Page() {
        initComponents();
        jPanel1 = new JPanel(); // Initialize the jPanel1 object
    }
private javax.swing.JPanel jPanel1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        insertUserBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        newUserBtn = new javax.swing.JButton();
        userTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        insertUserBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        insertUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        insertUserBtn.setText("Sign up");
        insertUserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        insertUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertUserBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(insertUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 550, 30));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("HELP");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLayeredPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, 40));

        newUserBtn.setBackground(new java.awt.Color(255, 153, 0));
        newUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newUserBtn.setText("An New Account");
        newUserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        newUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(newUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 150, 40));

        userTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userTF.setText("  Full name ");
        userTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLayeredPane1.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 550, 40));

        passwordTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordTF.setText("  Password");
        passwordTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLayeredPane1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 550, 40));

        emailTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailTF.setText("  Email ");
        emailTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLayeredPane1.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 550, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("for new Account ");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("forgot password");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Log on \"Friendly Chat \"");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 500, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/Background_page_Front_Page.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 950, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserBtnActionPerformed
        // TODO add your handling code here:
        Front_Page fp = new Front_Page();
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newUserBtnActionPerformed

    private void insertUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUserBtnActionPerformed
        // TODO add your handling code here:
        String user = userTF.getText();
        String password = passwordTF.getText();
        String email = emailTF.getText();
        dbc.insertUser(user,password,email);
       /* String message = messageTA.getText();
        dbc.sendMessage(message);*/
    }//GEN-LAST:event_insertUserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Front_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton insertUserBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newUserBtn;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
