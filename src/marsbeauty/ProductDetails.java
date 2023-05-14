package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static marsbeauty.Home_Page.items;

public class ProductDetails extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    static Cart Items = Home_Page.items;
    int iNo = 1;

    public ProductDetails() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
        if (iNo == 1) {
            Item.setIcon(new ImageIcon("icons/Item1.png"));
        } else if (iNo == 2) {
            Item.setIcon(new ImageIcon("icons/Item2.png"));
        } else if (iNo == 3) {
            Item.setIcon(new ImageIcon("icons/Item3.png"));
        } else {
            Item.setIcon(new ImageIcon("icons/Item4.png"));
        }
    }

    public ProductDetails(int number) {
        iNo = number;
        initComponents();
        if (iNo == 1) {
            Item.setIcon(new ImageIcon("icons/Item1.png"));
        } else if (iNo == 2) {
            Item.setIcon(new ImageIcon("icons/Item2.png"));
        } else if (iNo == 3) {
            Item.setIcon(new ImageIcon("icons/Item3.png"));
        } else {
            Item.setIcon(new ImageIcon("icons/Item4.png"));
        }
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
        AddToCart = new javax.swing.JLabel();
        Item = new javax.swing.JLabel();
        BG1 = new javax.swing.JLabel();

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

        AddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddR.png"))); // NOI18N
        AddToCart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddToCartMouseMoved(evt);
            }
        });
        AddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartMouseExited(evt);
            }
        });
        jPanel1.add(AddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 553, -1, -1));

        Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/Item1.png"))); // NOI18N
        jPanel1.add(Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 136, 340, 340));

        BG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/10-Product Details.png"))); // NOI18N
        jPanel1.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddToCartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseMoved
        ImageIcon icon = new ImageIcon("icons/AddP.png");
        AddToCart.setIcon(icon);
    }//GEN-LAST:event_AddToCartMouseMoved

    private void AddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseClicked
        if (items.getItem(0) == 0 || items.getItem(0) == iNo) {
            items.setItem(0, iNo);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else if (items.getItem(1) == 0 || items.getItem(1) == iNo) {
            items.setItem(1, iNo);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else {
            message(red, "You can't add more than 2 products to your cart!", "Additon Failed");
        }
    }//GEN-LAST:event_AddToCartMouseClicked

    private void AddToCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseExited
        ImageIcon icon = new ImageIcon("icons/AddR.png");
        AddToCart.setIcon(icon);
    }//GEN-LAST:event_AddToCartMouseExited

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new FaceProduct().setVisible(true);
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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ProductDetails frame = new ProductDetails();
                frame.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddToCart;
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Item;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
