package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FaceProduct extends javax.swing.JFrame {

    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));
    static Cart items = Home_Page.items;

    public FaceProduct() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
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
        AddToCart2 = new javax.swing.JLabel();
        AddToCart1 = new javax.swing.JLabel();
        AddToCart3 = new javax.swing.JLabel();
        AddToCart4 = new javax.swing.JLabel();
        ProductDetail4 = new javax.swing.JLabel();
        ProductDetail2 = new javax.swing.JLabel();
        ProductDetail3 = new javax.swing.JLabel();
        ProductDetail1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 0, 300, 666));

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

        AddToCart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddToCartR.png"))); // NOI18N
        AddToCart2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddToCart2MouseMoved(evt);
            }
        });
        AddToCart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCart2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCart2MouseExited(evt);
            }
        });
        jPanel1.add(AddToCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 319, 60, 40));

        AddToCart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddToCartR.png"))); // NOI18N
        AddToCart1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddToCart1MouseMoved(evt);
            }
        });
        AddToCart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCart1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCart1MouseExited(evt);
            }
        });
        jPanel1.add(AddToCart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 319, 60, 40));

        AddToCart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddToCartR.png"))); // NOI18N
        AddToCart3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddToCart3MouseMoved(evt);
            }
        });
        AddToCart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCart3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCart3MouseExited(evt);
            }
        });
        jPanel1.add(AddToCart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 574, 60, 40));

        AddToCart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddToCartR.png"))); // NOI18N
        AddToCart4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddToCart4MouseMoved(evt);
            }
        });
        AddToCart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCart4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCart4MouseExited(evt);
            }
        });
        jPanel1.add(AddToCart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 574, 60, 40));

        ProductDetail4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductDetail4MouseClicked(evt);
            }
        });
        jPanel1.add(ProductDetail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 140, 140));

        ProductDetail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductDetail2MouseClicked(evt);
            }
        });
        jPanel1.add(ProductDetail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 150, 130));

        ProductDetail3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductDetail3MouseClicked(evt);
            }
        });
        jPanel1.add(ProductDetail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 140));

        ProductDetail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductDetail1MouseClicked(evt);
            }
        });
        jPanel1.add(ProductDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 134, 140, 140));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/9- Product.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void BackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseMoved

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new AllCategories().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        Back.setIcon(icon);
    }//GEN-LAST:event_BackMouseExited

    private void ProductDetail3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductDetail3MouseClicked
        this.dispose();
        new ProductDetails(3).setVisible(true);
    }//GEN-LAST:event_ProductDetail3MouseClicked

    private void ProductDetail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductDetail2MouseClicked
        this.dispose();
        new ProductDetails(2).setVisible(true);
    }//GEN-LAST:event_ProductDetail2MouseClicked

    private void AddToCart2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart2MouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        AddToCart2.setIcon(icon);
    }//GEN-LAST:event_AddToCart2MouseMoved

    private void AddToCart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart2MouseClicked
        if (items.getItem(0) == 0 || items.getItem(0) == 2) {
            items.setItem(0, 2);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else if (items.getItem(1) == 0 || items.getItem(1) == 2) {
            items.setItem(1, 2);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else {
            message(red, "You can't add more than 2 products to your cart!", "Additon Failed");
        }
    }//GEN-LAST:event_AddToCart2MouseClicked

    private void AddToCart2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart2MouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        AddToCart2.setIcon(icon);
    }//GEN-LAST:event_AddToCart2MouseExited

    private void AddToCart3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart3MouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        AddToCart3.setIcon(icon);
    }//GEN-LAST:event_AddToCart3MouseMoved

    private void AddToCart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart3MouseClicked
        if (items.getItem(0) == 0 || items.getItem(0) == 3) {
            items.setItem(0, 3);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else if (items.getItem(1) == 0 || items.getItem(1) == 3) {
            items.setItem(1, 3);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else {
            message(red, "You can't add more than 2 products to your cart!", "Additon Failed");
        }    }//GEN-LAST:event_AddToCart3MouseClicked

    private void AddToCart3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart3MouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        AddToCart3.setIcon(icon);
    }//GEN-LAST:event_AddToCart3MouseExited

    private void AddToCart4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart4MouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        AddToCart4.setIcon(icon);
    }//GEN-LAST:event_AddToCart4MouseMoved

    private void AddToCart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart4MouseClicked
        if (items.getItem(0) == 0 || items.getItem(0) == 4) {
            items.setItem(0, 4);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else if (items.getItem(1) == 0 || items.getItem(1) == 4) {
            items.setItem(1, 4);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else {
            message(red, "You can't add more than 2 products to your cart!", "Additon Failed");
        }    }//GEN-LAST:event_AddToCart4MouseClicked

    private void AddToCart4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart4MouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        AddToCart4.setIcon(icon);
    }//GEN-LAST:event_AddToCart4MouseExited

    private void AddToCart1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart1MouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        AddToCart1.setIcon(icon);
    }//GEN-LAST:event_AddToCart1MouseMoved

    private void AddToCart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart1MouseClicked
        if (items.getItem(0) == 0 || items.getItem(0) == 1) {
            items.setItem(0, 1);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else if (items.getItem(1) == 0 || items.getItem(1) == 1) {
            items.setItem(1, 1);
            message(green, "This product has been added to your cart successfully!", "Additon Succeed");
        } else {
            message(red, "You can't add more than 2 products to your cart!", "Additon Failed");
        }    }//GEN-LAST:event_AddToCart1MouseClicked

    private void AddToCart1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCart1MouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        AddToCart1.setIcon(icon);
    }//GEN-LAST:event_AddToCart1MouseExited

    private void ProductDetail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductDetail1MouseClicked
        this.dispose();
        new ProductDetails(1).setVisible(true);
    }//GEN-LAST:event_ProductDetail1MouseClicked

    private void ProductDetail4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductDetail4MouseClicked
        this.dispose();
        new ProductDetails(4).setVisible(true);
    }//GEN-LAST:event_ProductDetail4MouseClicked

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
            java.util.logging.Logger.getLogger(FaceProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddToCart1;
    private javax.swing.JLabel AddToCart2;
    private javax.swing.JLabel AddToCart3;
    private javax.swing.JLabel AddToCart4;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel ProductDetail1;
    private javax.swing.JLabel ProductDetail2;
    private javax.swing.JLabel ProductDetail3;
    private javax.swing.JLabel ProductDetail4;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
