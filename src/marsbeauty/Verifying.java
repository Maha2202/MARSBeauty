package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;

public class Verifying extends javax.swing.JFrame {

    int SVCode = (int) (1000 + Math.random() * 9000);
    String SVCode1 = SVCode + "";
    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));

    public Verifying() {
        initComponents();
        message(green, "The varifycation code is: " + this.SVCode, "Varifycation ");
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
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        verfiy = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setIconImages(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setFont(new java.awt.Font("Nobile", 1, 36)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(238, 184, 138));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setToolTipText("");
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 310, 45, 42));

        jTextField6.setFont(new java.awt.Font("Nobile", 1, 36)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(238, 184, 138));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setToolTipText("");
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 310, 45, 42));

        jTextField7.setFont(new java.awt.Font("Nobile", 1, 36)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(238, 184, 138));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setToolTipText("");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 310, 45, 42));

        jTextField8.setFont(new java.awt.Font("Nobile", 1, 36)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(238, 184, 138));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setToolTipText("");
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 310, 45, 42));

        verfiy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/verifyR.png"))); // NOI18N
        verfiy.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verfiyMouseMoved(evt);
            }
        });
        verfiy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verfiyMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verfiyMouseExited(evt);
            }
        });
        jPanel1.add(verfiy, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 423, -1, -1));

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
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 31, -1, -1));

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/4-Verifying.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void verfiyMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verfiyMouseMoved
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("icons/verifyP.png");
        verfiy.setIcon(icon);
    }//GEN-LAST:event_verfiyMouseMoved

    private void verfiyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verfiyMouseClicked
        int dgit1 = Integer.parseInt(jTextField5.getText());
        int dgit2 = Integer.parseInt(jTextField6.getText());
        int dgit3 = Integer.parseInt(jTextField7.getText());
        int dgit4 = Integer.parseInt(jTextField8.getText());
        String code = dgit1 + "" + dgit2 + "" + dgit3 + "" + dgit4 + "";
        if (SVCode1.equals(code)) {
            this.dispose();
            new SetPassword().setVisible(true);
        } else {
            message(red, "The enterd code is wrong", "Verfing Failed");
        }
    }//GEN-LAST:event_verfiyMouseClicked

    private void verfiyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verfiyMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("icons/verifyR.png");
        verfiy.setIcon(icon);
    }//GEN-LAST:event_verfiyMouseExited

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Forget_Page().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

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
            java.util.logging.Logger.getLogger(Verifying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verifying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verifying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verifying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verifying().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel verfiy;
    // End of variables declaration//GEN-END:variables
}
