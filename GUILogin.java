/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aayush
 */


import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUILogin extends javax.swing.JFrame {

    File f=new File("C:\\Users\\Aayush\\Documents\\NetBeansProjects\\Login\\LogInData");
    String username,password;
    public GUILogin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        hlin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lmail = new javax.swing.JLabel();
        lusr1 = new javax.swing.JLabel();
        lpass1 = new javax.swing.JLabel();
        tmail = new javax.swing.JTextField();
        tusr = new javax.swing.JTextField();
        regb = new javax.swing.JButton();
        clrb = new javax.swing.JButton();
        loginb = new javax.swing.JButton();
        tpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(118, 255, 3));

        hlin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        hlin.setForeground(new java.awt.Color(46, 49, 50));
        hlin.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(hlin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hlin, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1570, 60);

        jPanel2.setBackground(new java.awt.Color(46, 49, 50));

        lmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lmail.setForeground(new java.awt.Color(232, 236, 246));
        lmail.setText("E-mail:");

        lusr1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lusr1.setForeground(new java.awt.Color(232, 236, 246));
        lusr1.setText("Username:");

        lpass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lpass1.setForeground(new java.awt.Color(232, 236, 246));
        lpass1.setText("Password:");

        tmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmailActionPerformed(evt);
            }
        });

        tusr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tusrActionPerformed(evt);
            }
        });

        regb.setBackground(new java.awt.Color(118, 255, 3));
        regb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regb.setText("Register");
        regb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbActionPerformed(evt);
            }
        });

        clrb.setBackground(new java.awt.Color(242, 38, 19));
        clrb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clrb.setText("Clear");
        clrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbActionPerformed(evt);
            }
        });

        loginb.setBackground(new java.awt.Color(118, 255, 3));
        loginb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginb.setText("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        tpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lusr1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tusr, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(regb, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(loginb, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(clrb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(550, 550, 550))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tusr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lusr1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clrb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1570, 760);

        setSize(new java.awt.Dimension(1581, 857));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmailActionPerformed

    private void clrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbActionPerformed
        tusr.setText("");
        tpass.setText("");
        tmail.setText("");
    }//GEN-LAST:event_clrbActionPerformed

    private void tusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tusrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tusrActionPerformed

    private void regbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbActionPerformed
        dispose();
        Registration obj=new Registration();
        obj.setVisible(true);
    }//GEN-LAST:event_regbActionPerformed

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
        String loun,lopd;
        loun=tusr.getText().toString();
        lopd=tpass.getText().toString();
        try {
            FileReader fr=new FileReader(f+"\\"+loun+".txt");
            Scanner sc=new Scanner(fr);
            
            username=sc.nextLine();
            password=sc.nextLine();
            if(username.equals(loun) && password.equals(lopd))
            {
                JOptionPane.showMessageDialog(this, "Successfully logged in!");
                dispose();
                Page1 p=new Page1();
                p.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid password!");
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Invalid username or password!");
        }
    }//GEN-LAST:event_loginbActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clrb;
    private javax.swing.JLabel hlin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lmail;
    private javax.swing.JButton loginb;
    private javax.swing.JLabel lpass1;
    private javax.swing.JLabel lusr1;
    private javax.swing.JButton regb;
    private javax.swing.JTextField tmail;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tusr;
    // End of variables declaration//GEN-END:variables
}