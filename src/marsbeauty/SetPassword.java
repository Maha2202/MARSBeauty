package marsbeauty;

import java.awt.*;
import javax.swing.*;

public class SetPassword extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    static User currentUser = Forget_Page.currentUser;

    public SetPassword() {
        initComponents();
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
        Password = new javax.swing.JPasswordField();
        CoPassword = new javax.swing.JPasswordField();
        Confirm = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(191, 171, 159));
        Password.setBorder(null);
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, 30));

        CoPassword.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        CoPassword.setForeground(new java.awt.Color(191, 171, 159));
        CoPassword.setBorder(null);
        CoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CoPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(CoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 40));

        Confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/ConfirmR.png"))); // NOI18N
        Confirm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ConfirmMouseMoved(evt);
            }
        });
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmMouseExited(evt);
            }
        });
        jPanel1.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 422, 270, 70));

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
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 31, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/5-Setting.png"))); // NOI18N
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

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Verifying().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void ConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseExited
        ImageIcon icon = new ImageIcon("icons/ConfirmR.png");
        Confirm.setIcon(icon);
    }//GEN-LAST:event_ConfirmMouseExited

    private void ConfirmMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseMoved
        ImageIcon icon = new ImageIcon("icons/ConfirmP.png");
        Confirm.setIcon(icon);
    }//GEN-LAST:event_ConfirmMouseMoved

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        if (Password.getText().length() > 7) {
            if (currentUser.setNewPassword(currentUser.getName(), Password.getText(), CoPassword.getText())) {
                message(green, "Congrats! Your Setting completed!", "Setting Succeed");
                this.dispose();
                new Login_Page().setVisible(true);
            } else {
                message(red, "The Password length must be more than 7 digits!", "Setting Failed");
            }
        }
    }//GEN-LAST:event_ConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JPasswordField CoPassword;
    private javax.swing.JLabel Confirm;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
