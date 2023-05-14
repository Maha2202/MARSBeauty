package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static marsbeauty.User.u;

public class Forget_Page extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    boolean phone = false;
    static User currentUser = Register.currentUser;

    public Forget_Page() {
        initComponents();
        Data.setBackground(new Color(0, 0, 0, 1));
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
        Data = new javax.swing.JTextField();
        Back = new javax.swing.JLabel();
        conutine = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Data.setForeground(new java.awt.Color(191, 178, 160));
        Data.setBorder(null);
        Data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DataKeyTyped(evt);
            }
        });
        jPanel1.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 40));

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

        conutine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/ContnueR.png"))); // NOI18N
        conutine.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                conutineMouseMoved(evt);
            }
        });
        conutine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conutineMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conutineMouseExited(evt);
            }
        });
        jPanel1.add(conutine, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 463, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/3-Forget.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataKeyTyped
        Data.setBackground(Color.WHITE);
    }//GEN-LAST:event_DataKeyTyped

    private void conutineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conutineMouseClicked

        if (Data.getText().isEmpty()) {
            message(red, "You must fill the field!", "Getting Failed");
        } else {
            for (int i = 0; i < u.size(); i++) {
                if (Data.getText().equals(u.get(i).getPhone())) {
                    currentUser = u.get(i);
                    this.dispose();
                    new Verifying().setVisible(true);
                    phone = true;
                }
            }
            if (phone == false) {
                message(red, "The enterd phone is wrong!", "Getting Failed");
            }
        }

    }//GEN-LAST:event_conutineMouseClicked

    private void conutineMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conutineMouseMoved
        ImageIcon icon = new ImageIcon("icons/ContnueP.png");
        conutine.setIcon(icon);
    }//GEN-LAST:event_conutineMouseMoved

    private void conutineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conutineMouseExited
        ImageIcon icon = new ImageIcon("icons/ContnueR.png");
        conutine.setIcon(icon);
    }//GEN-LAST:event_conutineMouseExited

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
            java.util.logging.Logger.getLogger(Forget_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forget_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forget_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forget_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JTextField Data;
    private javax.swing.JLabel conutine;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
