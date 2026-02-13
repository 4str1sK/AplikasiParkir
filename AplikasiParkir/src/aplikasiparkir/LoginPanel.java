/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiparkir;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;






/**
 *
 * @author Lenovo
 */
public class LoginPanel extends javax.swing.JFrame {
    
//Method cek user pw, ambil role
private String checkLogin(String username, String password) {

    String sql = "SELECT id_user, role FROM tb_user WHERE username = ? AND password = ? AND status_aktif = 1";

    try (PreparedStatement pst =
             koneksi.getConnection().prepareStatement(sql)) {

        pst.setString(1, username);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Session.id_user = rs.getInt("id_user");
            Session.role = rs.getString("role");
            Session.user = username;

            return Session.role;
      } else {
        return null;
        }
        

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this,
            "Database error: " + e.getMessage());
        return null;
    }
}

    public LoginPanel() {
        initComponents();
    //Bagusin Layout biar ga sakit mata xixixi
        btnexit.setBackground(Color.white);
        btnexit.setOpaque(true);
    
        btnlog.setBackground(Color.white);
        btnlog.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnlog = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPW = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblpw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Login.NJIRS");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png")).getImage()
        );
        setPreferredSize(new java.awt.Dimension(587, 400));

        bg.setBackground(new java.awt.Color(66, 138, 145));

        btnlog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnlog.setText("Login");
        btnlog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogMouseExited(evt);
            }
        });
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnexitMouseExited(evt);
            }
        });
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setOpaque(true);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPW.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPWActionPerformed(evt);
            }
        });

        Title.setBackground(new java.awt.Color(0, 102, 102));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(244, 247, 246));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Login.NJIRS");
        Title.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Title.setName(""); // NOI18N
        Title.setOpaque(true);

        lbluser.setBackground(new java.awt.Color(244, 247, 246));
        lbluser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbluser.setForeground(new java.awt.Color(246, 249, 251));
        lbluser.setText("Username :");
        lbluser.setToolTipText("");

        lblpw.setBackground(new java.awt.Color(244, 247, 246));
        lblpw.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblpw.setForeground(new java.awt.Color(244, 247, 246));
        lblpw.setText("Password :");
        lblpw.setToolTipText("");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(26, 124, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpw, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbluser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
       //VALIDASI DULU DIKS
        
        if (txtUser.getText(). trim(). isEmpty()
        ||  txtPW.getText(). trim(). isEmpty())
               {JOptionPane.showMessageDialog(this, "Mohon Pastikan Semua Data Terisi!");
               return;
               }
       
        String user = txtUser.getText();
        String pw = txtPW.getText();
        
        
        //Cek User PW, ROLE + Masukin Session
        String role = checkLogin(user, pw);

        if (role != null) {
            Session.loginTime = System.currentTimeMillis();
            insertlog.tambahLog(Session.id_user, 
            "Login ke sistem sebagai " + role);
            JOptionPane.showMessageDialog(this, "Login berhasil sebagai " + Session.user + "!");
            this.dispose();

            
        if ("petugas".equalsIgnoreCase(role)) {
                new TransaksiParkir(Session.user, Session.id_user).setVisible(true);
            } else {
                new dashboard(Session.role, Session.user, Session.id_user).setVisible(true);
    }


}       else {
            JOptionPane.showMessageDialog(
            this,
            "Silahkan Cek Lagi!",
            "Username atau Password Salah!",
            JOptionPane.WARNING_MESSAGE
    );
}
    }//GEN-LAST:event_btnlogActionPerformed

    private void txtPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPWActionPerformed

    private void btnlogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogMouseEntered
        btnlog.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnlogMouseEntered

    private void btnlogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogMouseExited
        btnlog.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnlogMouseExited

    private void btnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseEntered
        btnexit.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnexitMouseEntered

    private void btnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseExited
       btnexit.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnexitMouseExited

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlog;
    private javax.swing.JLabel lblpw;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtPW;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
