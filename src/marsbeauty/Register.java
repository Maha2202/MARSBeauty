package marsbeauty;

import java.awt.*;
import javax.swing.*;

public class Register extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    static User currentUser = new User("Admin", "Mars", "Company", "0500000000", "Admin123", "Admin123");
    static User r = new User();

    public Register() {
        initComponents();
        UserName.setBackground(new Color(0, 0, 0, 1));
        FName.setBackground(new Color(0, 0, 0, 1));
        LName.setBackground(new Color(0, 0, 0, 1));
        Phone.setBackground(new Color(0, 0, 0, 1));
        Password.setBackground(new Color(0, 0, 0, 1));
        CoPassword.setBackground(new Color(0, 0, 0, 1));
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
        FName = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        CoPassword = new javax.swing.JPasswordField();
        Register = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 698));
        setPreferredSize(new java.awt.Dimension(375, 667));
        setSize(new java.awt.Dimension(375, 667));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        FName.setForeground(new java.awt.Color(191, 178, 160));
        FName.setBorder(null);
        FName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FNameKeyTyped(evt);
            }
        });
        jPanel1.add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 208, 250, 40));

        UserName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(191, 178, 160));
        UserName.setBorder(null);
        UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserNameKeyTyped(evt);
            }
        });
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 141, 250, 40));

        LName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        LName.setForeground(new java.awt.Color(191, 178, 160));
        LName.setBorder(null);
        LName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LNameKeyTyped(evt);
            }
        });
        jPanel1.add(LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 270, 250, 40));

        Phone.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Phone.setForeground(new java.awt.Color(191, 178, 160));
        Phone.setBorder(null);
        Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneKeyTyped(evt);
            }
        });
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 334, 240, 40));

        Password.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(191, 178, 160));
        Password.setBorder(null);
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 400, 250, 40));

        CoPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        CoPassword.setForeground(new java.awt.Color(191, 178, 160));
        CoPassword.setBorder(null);
        CoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CoPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(CoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 465, 250, 40));

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/RigesterR.png"))); // NOI18N
        Register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegisterMouseMoved(evt);
            }
        });
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterMouseExited(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 577, -1, -1));

        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/backR.png"))); // NOI18N
        Back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BackMouseMoved(evt);
            }
        });
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 50, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/6- Register.png"))); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(392, 707));
        BG.setRequestFocusEnabled(false);
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

    private void UserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameKeyTyped
        UserName.setBackground(Color.white);
    }//GEN-LAST:event_UserNameKeyTyped

    private void FNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNameKeyTyped
        FName.setBackground(Color.white);
    }//GEN-LAST:event_FNameKeyTyped

    private void LNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LNameKeyTyped
        LName.setBackground(Color.white);
    }//GEN-LAST:event_LNameKeyTyped

    private void PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneKeyTyped
        Phone.setBackground(Color.white);
    }//GEN-LAST:event_PhoneKeyTyped

    private void RegisterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseMoved
        ImageIcon icon = new ImageIcon("icons/RegisterP.png");
        Register.setIcon(icon);
    }//GEN-LAST:event_RegisterMouseMoved

    private void RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseExited
        ImageIcon icon = new ImageIcon("icons/RegisterR.png");
        Register.setIcon(icon);
    }//GEN-LAST:event_RegisterMouseExited

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        currentUser = r.register(UserName.getText(), FName.getText(), LName.getText(), Phone.getText(), Password.getText(), CoPassword.getText());

        if (currentUser != null) {
            this.dispose();
            new Login_Page(currentUser).setVisible(true);
        }
    }//GEN-LAST:event_RegisterMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        Password.setBackground(Color.white);
    }//GEN-LAST:event_PasswordKeyTyped

    private void CoPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CoPasswordKeyTyped
        CoPassword.setBackground(Color.white);
    }//GEN-LAST:event_CoPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(Register.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JPasswordField CoPassword;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel Register;
    private javax.swing.JTextField UserName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
