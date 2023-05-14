package marsbeauty;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Checkout_Page extends javax.swing.JFrame {

    String fname = "";
    String lname = "";
    String phoneno = "";
    String street = "";
    String houseno = "";
    static User currentUser = Home_Page.currentUser;
    static Cart items = Home_Page.items;
    static String total = Cart_Page.total;
    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));

    public Checkout_Page() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
        Fname.setText(currentUser.getFname());
        Lname.setText(currentUser.getLname());
        PhNumber.setText(currentUser.getPhone().substring(1, 10));
        Country.setBackground(Color.WHITE);
        City.setBackground(Color.WHITE);
        if (!currentUser.getCountry().isEmpty()) {
            Country.setSelectedItem(currentUser.getCountry());
        }
        if (!currentUser.getCity().isEmpty()) {
            City.setSelectedItem(currentUser.getCity());
        }
        CoKey.setBackground(Color.WHITE);
        CoKey.setSelectedIndex(currentUser.getPhoneStart());

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
        ToSetting = new javax.swing.JLabel();
        ToWishlist = new javax.swing.JLabel();
        ToCart = new javax.swing.JLabel();
        ToAllCategories = new javax.swing.JLabel();
        ToHome = new javax.swing.JLabel();
        LogoutB = new javax.swing.JLabel();
        main = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        Country = new javax.swing.JComboBox<>();
        CoKey = new javax.swing.JComboBox<>();
        City = new javax.swing.JComboBox<>();
        Lname = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        PhNumber = new javax.swing.JTextField();
        Additional = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setIconImages(null);
        setSize(new java.awt.Dimension(375, 667));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToSettingMouseClicked(evt);
            }
        });
        jPanel1.add(ToSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 120, 40));

        ToWishlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToWishlistMouseClicked(evt);
            }
        });
        jPanel1.add(ToWishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 120, 40));

        ToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToCartMouseClicked(evt);
            }
        });
        jPanel1.add(ToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, 40));

        ToAllCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToAllCategoriesMouseClicked(evt);
            }
        });
        jPanel1.add(ToAllCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 120, 40));

        ToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToHomeMouseClicked(evt);
            }
        });
        jPanel1.add(ToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, 40));

        LogoutB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogoutBMouseMoved(evt);
            }
        });
        LogoutB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBMouseExited(evt);
            }
        });
        jPanel1.add(LogoutB, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 561, 183, 50));
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 0, 301, 666));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/MenuR.png"))); // NOI18N
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 31, 24, 24));

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

        pay.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/paymentR.png"))); // NOI18N
        pay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                payMouseMoved(evt);
            }
        });
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payMouseExited(evt);
            }
        });
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 561, -1, -1));

        Country.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Country.setForeground(new java.awt.Color(191, 171, 159));
        Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   Country", "   Kingdom of Saudi Arabia", "   Kuwait", "   United Arab Emirates" }));
        Country.setBorder(null);
        Country.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Country.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CountryItemStateChanged(evt);
            }
        });
        jPanel1.add(Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 410, 300, 30));

        CoKey.setFont(new java.awt.Font("Nobile Medium", 0, 10)); // NOI18N
        CoKey.setForeground(new java.awt.Color(191, 171, 159));
        CoKey.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   +966", "   +965", "   +961" }));
        CoKey.setBorder(null);
        CoKey.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(CoKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 365, 50, 30));

        City.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        City.setForeground(new java.awt.Color(191, 171, 159));
        City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   City" }));
        City.setBorder(null);
        City.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 455, 300, 30));

        Lname.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Lname.setForeground(new java.awt.Color(191, 171, 159));
        Lname.setBorder(null);
        Lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LnameKeyTyped(evt);
            }
        });
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 30));

        Fname.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Fname.setForeground(new java.awt.Color(191, 171, 159));
        Fname.setBorder(null);
        Fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FnameKeyTyped(evt);
            }
        });
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 30));

        PhNumber.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        PhNumber.setForeground(new java.awt.Color(191, 171, 159));
        PhNumber.setBorder(null);
        PhNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhNumberKeyTyped(evt);
            }
        });
        jPanel1.add(PhNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 363, 226, 30));

        Additional.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        Additional.setForeground(new java.awt.Color(191, 171, 159));
        Additional.setBorder(null);
        Additional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AdditionalKeyTyped(evt);
            }
        });
        jPanel1.add(Additional, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 290, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/12-Checkout.png"))); // NOI18N
        BG.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 667));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseMoved
        ImageIcon icon = new ImageIcon("icons/paymentP.png");
        pay.setIcon(icon);
    }//GEN-LAST:event_payMouseMoved

    private void payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseClicked
        fname = Fname.getText();
        lname = Lname.getText();
        phoneno = PhNumber.getText();
        if (!fname.isEmpty() && !lname.isEmpty() && !phoneno.isEmpty() && Country.getSelectedIndex() != 0 && City.getSelectedIndex() != 0) {
            if (phoneno.charAt(0) == '5' && phoneno.length() == 9) {
                this.dispose();
                new Payment_Page().setVisible(true);
            } else {
                message(red, "The Phone Number Shuold Start with '5' and the length should be '9' digits!", "Checkout Failed");
            }
        } else {
            message(red, "You Should Fill All The Feilds", "Checkout Failed");
        }

    }//GEN-LAST:event_payMouseClicked

    private void payMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseExited
        ImageIcon icon = new ImageIcon("icons/paymentR.png");
        pay.setIcon(icon);
    }//GEN-LAST:event_payMouseExited

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Cart_Page().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

    private void CountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CountryItemStateChanged
        if (Country.getSelectedIndex() == 1) {
            City.removeAllItems();
            String[] C = {"   City",
                "   Jeddah",
                "   Riyadh",
                "   Makkah",
                "   Taif",
                "   Abha",
                "   Albaha"};

            for (int i = 0; i < C.length; i++) {
                City.addItem(C[i]);
            }
        } else if ((Country.getSelectedIndex() == 2)) {
            City.removeAllItems();
            String[] C = {"   City",
                "   Al Ahmadi",
                "   Hawalli",
                "   As Salimiyah",
                "   Sabah as Salim",
                "   Kuwait",
                "   Ar Riqqah"};

            for (int i = 0; i < C.length; i++) {
                City.addItem(C[i]);
            }
        } else if ((Country.getSelectedIndex() == 3)) {
            City.removeAllItems();
            String[] C = {"   City",
                "   Abu Dhabi",
                "   Dubai",
                "   Sharjah",
                "   Umm al-Qaiwain",
                "   Fujairah",
                "   Ajman",
                "   Ra’s al-Khaima"};

            for (int i = 0; i < C.length; i++) {
                City.addItem(C[i]);
            }
        } else {
            City.removeAllItems();
            City.addItem("   City");
        }
    }//GEN-LAST:event_CountryItemStateChanged

    private void LnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LnameKeyTyped
        Lname.setBackground(Color.white);
    }//GEN-LAST:event_LnameKeyTyped

    private void FnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameKeyTyped
        Fname.setBackground(Color.white);
    }//GEN-LAST:event_FnameKeyTyped

    private void PhNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhNumberKeyTyped
        PhNumber.setBackground(Color.white);
    }//GEN-LAST:event_PhNumberKeyTyped

    private void AdditionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdditionalKeyTyped
        Additional.setBackground(Color.white);
    }//GEN-LAST:event_AdditionalKeyTyped

    private void ToSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToSettingMouseClicked
        this.dispose();
        new Setting().setVisible(true);
    }//GEN-LAST:event_ToSettingMouseClicked

    private void ToWishlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToWishlistMouseClicked
        this.dispose();
        new Wishlist().setVisible(true);
    }//GEN-LAST:event_ToWishlistMouseClicked

    private void ToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToCartMouseClicked
        this.dispose();
        new Cart_Page().setVisible(true);
    }//GEN-LAST:event_ToCartMouseClicked

    private void ToAllCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToAllCategoriesMouseClicked
        this.dispose();
        new AllCategories().setVisible(true);
    }//GEN-LAST:event_ToAllCategoriesMouseClicked

    private void ToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToHomeMouseClicked
        this.dispose();
        new Home_Page().setVisible(true);
    }//GEN-LAST:event_ToHomeMouseClicked

    private void LogoutBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBMouseMoved
        if (main.getIcon() != null) {
            ImageIcon icon = new ImageIcon("icons/LogoutP.png");
            LogoutB.setIcon(icon);
            LogoutB.setVisible(true);
        } else {
            LogoutB.setVisible(false);
        }
    }//GEN-LAST:event_LogoutBMouseMoved

    private void LogoutBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBMouseClicked
        this.dispose();
        new Welcome_page().setVisible(true);
    }//GEN-LAST:event_LogoutBMouseClicked

    private void LogoutBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBMouseExited
        if (main.getIcon() != null) {
            ImageIcon icon = new ImageIcon("icons/LogoutR.png");
            LogoutB.setIcon(icon);
            LogoutB.setVisible(true);
        } else {
            LogoutB.setVisible(false);
        }
    }//GEN-LAST:event_LogoutBMouseExited

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        if (main.getIcon() == null) {
            ImageIcon icon = new ImageIcon("icons/XP.png");
            Menu.setIcon(icon);
            ImageIcon icon1 = new ImageIcon("icons/Main.png");
            main.setIcon(icon1);
            ImageIcon icon2 = new ImageIcon("icons/LogoutR.png");
            LogoutB.setIcon(icon2);
            main.setVisible(true);
            ToCart.setVisible(true);
            ToSetting.setVisible(true);
            ToWishlist.setVisible(true);
            ToCart.setVisible(true);
            ToAllCategories.setVisible(true);
            ToHome.setVisible(true);
            LogoutB.setVisible(true);
        } else {
            ImageIcon icon = new ImageIcon("icons/MenuR.png");
            Menu.setIcon(icon);
            main.setIcon(null);
            LogoutB.setIcon(null);
            main.setVisible(false);
            ToCart.setVisible(false);
            ToSetting.setVisible(false);
            ToWishlist.setVisible(false);
            ToCart.setVisible(false);
            ToAllCategories.setVisible(false);
            ToHome.setVisible(false);
            LogoutB.setVisible(false);
        }
    }//GEN-LAST:event_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(Checkout_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Checkout_Page frame = new Checkout_Page();
                frame.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Additional;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox<String> City;
    private javax.swing.JComboBox<String> CoKey;
    private javax.swing.JComboBox<String> Country;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JTextField PhNumber;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    private javax.swing.JLabel pay;
    // End of variables declaration//GEN-END:variables
}
