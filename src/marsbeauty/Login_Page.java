package marsbeauty;

import java.awt.*;
import javax.swing.*;
import static marsbeauty.User.u;

public class Login_Page extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    static User currentUser = Register.currentUser;

    public Login_Page() {
        initComponents();
        Password.setBackground(new Color(0, 0, 0, 1));
        userName.setBackground(new Color(0, 0, 0, 1));
    }

    public Login_Page(User user) {
        initComponents();
        Password.setBackground(new Color(0, 0, 0, 1));
        userName.setBackground(new Color(0, 0, 0, 1));
        currentUser = user;
    }

    public void message(JLabel RG, String message, String name) {
        Font f = new Font("Georgia", Font.BOLD, 14);
        JLabel n = new JLabel("  ");
        JPanel p = new JPanel();
        JLabel text = new JLabel(message);
        text.setHorizontalAlignment(text.CENTER);
        text.setFont(f);
        p.setLayout(new BorderLayout());
        p.add(RG, BorderLayout.NORTH);
        p.add(n, BorderLayout.CENTER);
        p.add(text, BorderLayout.PAGE_END);
        JOptionPane.showMessageDialog(null, p, name, JOptionPane.PLAIN_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        forgetpass = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        login = new javax.swing.JLabel();
        regester = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setIconImages(null);
        setSize(new java.awt.Dimension(375, 667));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgetpass.setFont(new java.awt.Font("Nobile", 2, 14)); // NOI18N
        forgetpass.setForeground(new java.awt.Color(69, 182, 175));
        forgetpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/FypR.png"))); // NOI18N
        forgetpass.setVerifyInputWhenFocusTarget(false);
        forgetpass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                forgetpassMouseMoved(evt);
            }
        });
        forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetpassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgetpassMouseExited(evt);
            }
        });
        jPanel1.add(forgetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 450, -1, -1));

        userName.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(191, 178, 160));
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 317, 190, 30));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/LoginR.png"))); // NOI18N
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginMouseMoved(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 480, 270, 60));

        regester.setFont(new java.awt.Font("Nobile Medium", 2, 14)); // NOI18N
        regester.setForeground(new java.awt.Color(109, 87, 80));
        regester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/accountR.png"))); // NOI18N
        regester.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                regesterMouseMoved(evt);
            }
        });
        regester.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regesterMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regesterMouseExited(evt);
            }
        });
        jPanel1.add(regester, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 574, -1, -1));

        Password.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(191, 171, 159));
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 383, 190, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/2-Login.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        userName.setBackground(Color.white);
    }//GEN-LAST:event_userNameKeyTyped

    private void regesterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regesterMouseClicked
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_regesterMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked

        if (userName.getText().isEmpty() && (!Password.getText().isEmpty())) {
            message(red, "You must fill the username field!", "Login Failed");
        } else if ((Password.getText().isEmpty()) && (!userName.getText().isEmpty())) {
            message(red, "You must fill the password field!", "Login Failed");
        } else if ((Password.getText().isEmpty()) && (userName.getText().isEmpty())) {
            message(red, "You must fill all the fields!", "Login Failed");
        } else {
            Boolean check = currentUser.Login(userName.getText(), Password.getText());
            if (check) {
                for (int i = 0; i < u.size(); i++) {
                    if (u.get(i).getName().equals(userName.getText()) && u.get(i).getPassword().equals(Password.getText())) {
                        currentUser = u.get(i);
                    }
                }
                this.dispose();
                new Home_Page().setVisible(true);
            } else {
                message(red, "The enterd username or password is wrong!", "Login Failed");
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        Password.setBackground(Color.white);
    }//GEN-LAST:event_PasswordKeyTyped

    private void forgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseClicked
        this.dispose();
        new Forget_Page().setVisible(true);
    }//GEN-LAST:event_forgetpassMouseClicked

    private void forgetpassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseMoved
        ImageIcon icon = new ImageIcon("icons/FypP.png");
        forgetpass.setIcon(icon);
    }//GEN-LAST:event_forgetpassMouseMoved

    private void forgetpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseExited
        ImageIcon icon = new ImageIcon("icons/FypR.png");
        forgetpass.setIcon(icon);
    }//GEN-LAST:event_forgetpassMouseExited

    private void loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseMoved
        ImageIcon icon = new ImageIcon("icons/LoginP.png");
        login.setIcon(icon);
    }//GEN-LAST:event_loginMouseMoved

    private void regesterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regesterMouseMoved
        ImageIcon icon = new ImageIcon("icons/accountP.png");
        regester.setIcon(icon);
    }//GEN-LAST:event_regesterMouseMoved

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        ImageIcon icon = new ImageIcon("icons/LoginR.png");
        login.setIcon(icon);
    }//GEN-LAST:event_loginMouseExited

    private void regesterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regesterMouseExited
        ImageIcon icon = new ImageIcon("icons/accountR.png");
        regester.setIcon(icon);
    }//GEN-LAST:event_regesterMouseExited

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        userName.setBackground(new Color(0, 0, 0, 1));
    }//GEN-LAST:event_userNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        Password.setBackground(new Color(0, 0, 0, 1));
    }//GEN-LAST:event_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel forgetpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel regester;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
