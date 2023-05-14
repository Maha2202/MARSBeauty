package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Payment_Page extends javax.swing.JFrame {

    static User currentUser = Home_Page.currentUser;
    static String total = Home_Page.items.total;
    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    String choise = "none";

    public Payment_Page() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
        if (currentUser.getCardNo().isEmpty()) {
            CardNum.setBackground(new Color(0, 0, 0, 1));
        } else {
            CardNum.setText(currentUser.getCardNo());
        }
        if (currentUser.getCardholder().isEmpty()) {
            CardHName.setBackground(new Color(0, 0, 0, 1));
        } else {
            CardHName.setText(currentUser.getCardholder());
        }
        if (currentUser.getDate().isEmpty()) {
            Date.setBackground(new Color(0, 0, 0, 1));
        } else {
            Date.setText(currentUser.getDate());
        }
        CCV.setBackground(new Color(0, 0, 0, 1));
        Info.setVisible(false);
        CardNum.setVisible(false);
        Date.setVisible(false);
        CardHName.setVisible(false);
        CCV.setVisible(false);
        SaveC.setVisible(false);
        TotalPrice.setText(total);
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
        CardNum = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        CardHName = new javax.swing.JTextField();
        CCV = new javax.swing.JTextField();
        SaveC = new javax.swing.JCheckBox();
        Info = new javax.swing.JLabel();
        Cashch = new javax.swing.JLabel();
        Visach = new javax.swing.JLabel();
        Appch = new javax.swing.JLabel();
        CCch = new javax.swing.JLabel();
        Paymentway = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();
        Pay = new javax.swing.JLabel();
        PaymentPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 243));

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

        CardNum.setFont(new java.awt.Font("Nobile", 0, 14)); // NOI18N
        CardNum.setForeground(new java.awt.Color(191, 171, 159));
        CardNum.setBorder(null);
        CardNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CardNumKeyTyped(evt);
            }
        });
        jPanel1.add(CardNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 395, 240, 25));

        Date.setFont(new java.awt.Font("Nobile", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(191, 171, 159));
        Date.setBorder(null);
        Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DateKeyTyped(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 477, 170, 25));

        CardHName.setFont(new java.awt.Font("Nobile", 0, 14)); // NOI18N
        CardHName.setForeground(new java.awt.Color(191, 171, 159));
        CardHName.setBorder(null);
        CardHName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CardHNameKeyTyped(evt);
            }
        });
        jPanel1.add(CardHName, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 436, 240, 25));

        CCV.setFont(new java.awt.Font("Nobile", 0, 14)); // NOI18N
        CCV.setForeground(new java.awt.Color(191, 171, 159));
        CCV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CCV.setBorder(null);
        CCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CCVKeyTyped(evt);
            }
        });
        jPanel1.add(CCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 477, 50, 25));

        SaveC.setBackground(new java.awt.Color(244, 244, 243));
        SaveC.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        SaveC.setForeground(new java.awt.Color(112, 112, 112));
        jPanel1.add(SaveC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/info.png"))); // NOI18N
        jPanel1.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        Cashch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashchMouseClicked(evt);
            }
        });
        jPanel1.add(Cashch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 20, 20));

        Visach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisachMouseClicked(evt);
            }
        });
        jPanel1.add(Visach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 20, 20));

        Appch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppchMouseClicked(evt);
            }
        });
        jPanel1.add(Appch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 313, 20, 20));

        CCch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CCchMouseClicked(evt);
            }
        });
        jPanel1.add(CCch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 246, 20, 20));

        Paymentway.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/PaymentNot.png"))); // NOI18N
        Paymentway.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(Paymentway, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 243, 180, 130));

        TotalPrice.setBackground(new java.awt.Color(255, 255, 255));
        TotalPrice.setFont(new java.awt.Font("Nobile", 1, 16)); // NOI18N
        TotalPrice.setForeground(new java.awt.Color(109, 87, 80));
        TotalPrice.setText("0.0SR");
        jPanel1.add(TotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 142, 110, 30));

        Pay.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        Pay.setForeground(new java.awt.Color(255, 255, 255));
        Pay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/payR.png"))); // NOI18N
        Pay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PayMouseMoved(evt);
            }
        });
        Pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayMouseExited(evt);
            }
        });
        jPanel1.add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 561, -1, -1));

        PaymentPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/13-Payment.png"))); // NOI18N
        jPanel1.add(PaymentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void PayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseMoved
        ImageIcon icon = new ImageIcon("icons/PayP.png");
        Pay.setIcon(icon);
    }//GEN-LAST:event_PayMouseMoved

    private void PayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseExited
        ImageIcon icon = new ImageIcon("icons/PayR.png");
        Pay.setIcon(icon);
    }//GEN-LAST:event_PayMouseExited

    private void PayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseClicked
        if (choise == "none") {
            message(red, "You should choose a payment method!", "Payment Failed");
        } else if (choise == "Cash" || choise == "ApplePay") {
            this.dispose();
            new ConfirmOrder().setVisible(true);
        } else {
            if (!CardHName.getText().isEmpty() && !CardNum.getText().isEmpty() && !Date.getText().isEmpty() && !CCV.getText().isEmpty()) {
                if (CardNum.getText().matches("[0-9]+") && CCV.getText().matches("[0-9]+")) {
                    if (CardNum.getText().length() == 16) {
                        if (CardHName.getText().toLowerCase().matches("[a-z]+")) {
                            if (Date.getText().matches("\\d{2}/\\d{2}")) {
                                if (CCV.getText().length() == 3) {
                                    if (SaveC.isSelected()) {
                                        message(green, "The Card Information Saved Successfully!", "Payment Succeed");
                                        currentUser.setCardNo(CardNum.getText());
                                        currentUser.setCardholder(CardHName.getText());
                                        currentUser.setDate(Date.getText());
                                    }
                                    this.dispose();
                                    new ConfirmOrder().setVisible(true);
                                } else {
                                    message(red, "The CCV length should be 3 digits!", "Payment Failed");
                                }
                            } else {
                                message(red, "The Date format should be MM/YY!", "Payment Failed");
                            }
                        } else {
                            message(red, "The CardHolder name should contains only letters!", "Payment Failed");
                        }
                    } else {
                        message(red, "The Card number length should be 16 digits!", "Payment Failed");
                    }
                } else {
                    message(red, "The Card number and CCV should contains only number!", "Payment Failed");
                }
            } else {
                message(red, "You must fill all the fields!", "Payment Failed");
            }
        }


    }//GEN-LAST:event_PayMouseClicked

    private void CCchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCchMouseClicked
        ImageIcon icon = new ImageIcon("icons/CreditCard.png");
        choise = "CreditCard";
        Paymentway.setIcon(icon);
        Info.setVisible(true);
        CardNum.setVisible(true);
        Date.setVisible(true);
        CardHName.setVisible(true);
        CCV.setVisible(true);
        SaveC.setVisible(true);

    }//GEN-LAST:event_CCchMouseClicked

    private void CashchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashchMouseClicked
        ImageIcon icon = new ImageIcon("icons/Cash.png");
        choise = "Cash";
        Paymentway.setIcon(icon);
        Info.setVisible(false);
        CardNum.setVisible(false);
        Date.setVisible(false);
        CardHName.setVisible(false);
        CCV.setVisible(false);
        SaveC.setVisible(false);
    }//GEN-LAST:event_CashchMouseClicked

    private void AppchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppchMouseClicked
        ImageIcon icon = new ImageIcon("icons/ApplePay.png");
        choise = "ApplePay";
        Paymentway.setIcon(icon);
        Info.setVisible(false);
        CardNum.setVisible(false);
        Date.setVisible(false);
        CardHName.setVisible(false);
        CCV.setVisible(false);
        SaveC.setVisible(false);
    }//GEN-LAST:event_AppchMouseClicked

    private void VisachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisachMouseClicked
        ImageIcon icon = new ImageIcon("icons/Visa.png");
        choise = "Visa";
        Paymentway.setIcon(icon);
        Info.setVisible(true);
        CardNum.setVisible(true);
        Date.setVisible(true);
        CardHName.setVisible(true);
        CCV.setVisible(true);
        SaveC.setVisible(true);

    }//GEN-LAST:event_VisachMouseClicked

    private void CardNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CardNumKeyTyped
        CardNum.setBackground(Color.white);
    }//GEN-LAST:event_CardNumKeyTyped

    private void DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateKeyTyped
        Date.setBackground(Color.white);
    }//GEN-LAST:event_DateKeyTyped

    private void CardHNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CardHNameKeyTyped
        CardHName.setBackground(Color.white);
    }//GEN-LAST:event_CardHNameKeyTyped

    private void CCVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCVKeyTyped
        CCV.setBackground(Color.white);
    }//GEN-LAST:event_CCVKeyTyped

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Checkout_Page().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

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
            java.util.logging.Logger.getLogger(Payment_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appch;
    private javax.swing.JLabel Back;
    private javax.swing.JTextField CCV;
    private javax.swing.JLabel CCch;
    private javax.swing.JTextField CardHName;
    private javax.swing.JTextField CardNum;
    private javax.swing.JLabel Cashch;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Pay;
    private javax.swing.JLabel PaymentPage;
    private javax.swing.JLabel Paymentway;
    private javax.swing.JCheckBox SaveC;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JLabel Visach;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
