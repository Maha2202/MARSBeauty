package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cart_Page extends javax.swing.JFrame {

    static User currentUser = Home_Page.currentUser;
    static Cart items = Home_Page.items;
    static String total = "0.0SR";
    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    
    public Cart_Page() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
        if (items.getItem(0) > 0) {
            if (items.getItem(0) == 1) {
                item1.setIcon(new ImageIcon("icons/cartItem1.png"));
                price1.setText("30SR");
            } else if (items.getItem(0) == 2) {
                item1.setIcon(new ImageIcon("icons/cartItem2.png"));
                price1.setText("120SR");
            } else if (items.getItem(0) == 3) {
                item1.setIcon(new ImageIcon("icons/cartItem3.png"));
                price1.setText("150SR");
            } else {
                item1.setIcon(new ImageIcon("icons/cartItem4.png"));
                price1.setText("150SR");
            }
        } else {
            item2.setVisible(false);
            item1.setVisible(false);
            item1C.setVisible(false);
            item2C.setVisible(false);
            price1.setVisible(false);
            price2.setVisible(false);
            remove1.setVisible(false);
            remove2.setVisible(false);
            Checkout.setVisible(false);
            qty1.setVisible(false);
            qty2.setVisible(false);
        }
        if (items.getItem(1) > 0) {
            if (items.getItem(1) == 1) {
                item2.setIcon(new ImageIcon("icons/cartItem1.png"));
                price2.setText("30SR");
            } else if (items.getItem(1) == 2) {
                item2.setIcon(new ImageIcon("icons/cartItem2.png"));
                price2.setText("120SR");
            } else if (items.getItem(1) == 3) {
                item2.setIcon(new ImageIcon("icons/cartItem3.png"));
                price2.setText("150SR");
            } else {
                item2.setIcon(new ImageIcon("icons/cartItem4.png"));
                price2.setText("150SR");
            }
        } else {
            item2.setVisible(false);
            item2C.setVisible(false);
            price2.setVisible(false);
            remove2.setVisible(false);
            qty2.setVisible(false);
        }
        String T = items.Total(price1.getText(), price2.getText());
        Tprice.setText(T);

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
        remove1 = new javax.swing.JLabel();
        remove2 = new javax.swing.JLabel();
        Checkout = new javax.swing.JLabel();
        Tprice = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        qty1 = new javax.swing.JLabel();
        qty2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2C = new javax.swing.JLabel();
        item1C = new javax.swing.JLabel();
        CartPage = new javax.swing.JLabel();

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

        remove1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/RemoveR.png"))); // NOI18N
        remove1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                remove1MouseMoved(evt);
            }
        });
        remove1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove1MouseExited(evt);
            }
        });
        jPanel1.add(remove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 141, -1, -1));

        remove2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/RemoveR.png"))); // NOI18N
        remove2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                remove2MouseMoved(evt);
            }
        });
        remove2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove2MouseExited(evt);
            }
        });
        jPanel1.add(remove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 289, -1, -1));

        Checkout.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        Checkout.setForeground(new java.awt.Color(255, 255, 255));
        Checkout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/CheckoutR.png"))); // NOI18N
        Checkout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CheckoutMouseMoved(evt);
            }
        });
        Checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckoutMouseExited(evt);
            }
        });
        jPanel1.add(Checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 561, 312, 50));

        Tprice.setFont(new java.awt.Font("Nobile Medium", 0, 16)); // NOI18N
        Tprice.setForeground(new java.awt.Color(109, 87, 80));
        Tprice.setText("0.0 SR");
        jPanel1.add(Tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 519, -1, 30));

        price1.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        price1.setForeground(new java.awt.Color(109, 87, 80));
        price1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price1.setText("0SR");
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 60, 20));

        qty1.setFont(new java.awt.Font("Nobile Medium", 0, 12)); // NOI18N
        qty1.setForeground(new java.awt.Color(109, 87, 80));
        qty1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty1.setText("1");
        jPanel1.add(qty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, -1));

        qty2.setFont(new java.awt.Font("Nobile Medium", 0, 12)); // NOI18N
        qty2.setForeground(new java.awt.Color(109, 87, 80));
        qty2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty2.setText("1");
        jPanel1.add(qty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 378, 30, -1));

        price2.setFont(new java.awt.Font("Nobile Medium", 0, 14)); // NOI18N
        price2.setForeground(new java.awt.Color(109, 87, 80));
        price2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price2.setText("0SR");
        jPanel1.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 375, 60, 20));

        item2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/cartItem1.png"))); // NOI18N
        jPanel1.add(item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 294, -1, -1));

        item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/cartItem1.png"))); // NOI18N
        jPanel1.add(item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 146, -1, -1));

        item2C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item2C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/CartBook1.png"))); // NOI18N
        jPanel1.add(item2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 278, 314, 132));

        item1C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item1C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/CartBook1.png"))); // NOI18N
        item1C.setIconTextGap(0);
        jPanel1.add(item1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 130, 314, 132));

        CartPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/11-Cart.png"))); // NOI18N
        CartPage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(CartPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 667));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckoutMouseMoved
        ImageIcon icon = new ImageIcon("icons/CheckoutP.png");
        Checkout.setIcon(icon);
    }//GEN-LAST:event_CheckoutMouseMoved

    private void CheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckoutMouseClicked
        this.dispose();
        new Checkout_Page().setVisible(true);
    }//GEN-LAST:event_CheckoutMouseClicked

    private void CheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckoutMouseExited
        ImageIcon icon = new ImageIcon("icons/CheckoutR.png");
        Checkout.setIcon(icon);
    }//GEN-LAST:event_CheckoutMouseExited

    private void remove1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseMoved
        ImageIcon icon = new ImageIcon("icons/RemoveP.png");
        remove1.setIcon(icon);
    }//GEN-LAST:event_remove1MouseMoved

    private void remove1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseClicked
        if (item2C.isVisible() == true) {
            item1.setIcon(item2.getIcon());
            price1.setText(price2.getText());
            item2.setVisible(false);
            item2C.setVisible(false);
            price2.setVisible(false);
            remove2.setVisible(false);
            qty2.setVisible(false);
            items.setItem(0, items.getItem(1));
            items.setItem(1, 0);
            price2.setText("0SR");
        } else {
            item1.setVisible(false);
            item1C.setVisible(false);
            price1.setVisible(false);
            remove1.setVisible(false);
            items.setItem(0, 0);
            price1.setText("0SR");
            Checkout.setVisible(false);
            qty1.setVisible(false);
        }
        String T = items.Total(price1.getText(), price2.getText());
        Tprice.setText(T);
    }//GEN-LAST:event_remove1MouseClicked

    private void remove1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseExited
        ImageIcon icon = new ImageIcon("icons/RemoveR.png");
        remove1.setIcon(icon);
    }//GEN-LAST:event_remove1MouseExited

    private void remove2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseMoved
        ImageIcon icon = new ImageIcon("icons/RemoveP.png");
        remove2.setIcon(icon);
    }//GEN-LAST:event_remove2MouseMoved

    private void remove2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseClicked
        if (item2C.isVisible() == true) {
            item2.setVisible(false);
            item2C.setVisible(false);
            price2.setVisible(false);
            remove2.setVisible(false);
            items.setItem(1, 0);
            price2.setText("0SR");
            qty2.setVisible(false);
        }
        String T = items.Total(price1.getText(), price2.getText());
        Tprice.setText(T);
    }//GEN-LAST:event_remove2MouseClicked

    private void remove2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseExited
        ImageIcon icon = new ImageIcon("icons/RemoveR.png");
        remove2.setIcon(icon);
    }//GEN-LAST:event_remove2MouseExited

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Home_Page().setVisible(true);
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
            java.util.logging.Logger.getLogger(Cart_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                Cart_Page frame = new Cart_Page();
                frame.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel CartPage;
    private javax.swing.JLabel Checkout;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JLabel Tprice;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item1C;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item2C;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel qty1;
    private javax.swing.JLabel qty2;
    private javax.swing.JLabel remove1;
    private javax.swing.JLabel remove2;
    // End of variables declaration//GEN-END:variables
}
