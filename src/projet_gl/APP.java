/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_gl;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class APP extends javax.swing.JFrame {
    
    /**
     * Creates new form APP
     */
    public APP() {
        initComponents();
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
        welcomePage = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        visibiltyCheck = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        jPanel1.setBackground(new java.awt.Color(50, 50, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 423));

        welcomePage.setBackground(new java.awt.Color(255, 255, 255));
        welcomePage.setFocusable(false);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 41, 45));
        jLabel27.setText("LOGIN");

        userNameField.setBackground(new java.awt.Color(255, 255, 255));
        userNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldjTextField1ActionPerformed(evt);
            }
        });

        visibiltyCheck.setBackground(new java.awt.Color(255, 255, 255));
        visibiltyCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        visibiltyCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibiltyCheckjCheckBox1ActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonjButton1ActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordFieldjPasswordField1MouseEntered(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldjPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomePageLayout = new javax.swing.GroupLayout(welcomePage);
        welcomePage.setLayout(welcomePageLayout);
        welcomePageLayout.setHorizontalGroup(
            welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePageLayout.createSequentialGroup()
                .addGroup(welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel27))
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visibiltyCheck))
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1177, Short.MAX_VALUE))
        );
        welcomePageLayout.setVerticalGroup(
            welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePageLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel27)
                .addGap(107, 107, 107)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcomePageLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(visibiltyCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(778, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1470, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(welcomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(welcomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldjTextField1ActionPerformed

    private void passwordFieldjPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldjPasswordField1MouseEntered

    }//GEN-LAST:event_passwordFieldjPasswordField1MouseEntered

    private void passwordFieldjPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldjPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldjPasswordField1ActionPerformed

    private void loginButtonjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonjButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String userName = userNameField.getText();
        String passWord = new String(passwordField.getPassword());

        if(userName.equals("Admin")  && passWord.equals("LawFirm@3")){
 
        this.setVisible(false);
        javax.swing.JFrame f = new Welcome();
        
        f.setBounds(this.getBounds());
        f.setVisible(true);
        this.dispose();}else JOptionPane.showMessageDialog(this, "mot de passe ou nom d'utilisateur incorrecte", "champ incorrecte", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_loginButtonjButton1ActionPerformed
boolean visible = false;
    private void visibiltyCheckjCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibiltyCheckjCheckBox1ActionPerformed
        if(!visible){
            visibiltyCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invisible.png")));
            passwordField.setEchoChar((char) 0);
            visible = !visible;}
        else {
            visibiltyCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png")));
            visible = !visible;
            passwordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_visibiltyCheckjCheckBox1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JCheckBox visibiltyCheck;
    private javax.swing.JPanel welcomePage;
    // End of variables declaration//GEN-END:variables
}
