package marsbeauty;

import javax.swing.*;

public class Wishlist extends javax.swing.JFrame {

    public Wishlist() {
        initComponents();
        ToCart.setVisible(false);
        ToSetting.setVisible(false);
        ToWishlist.setVisible(false);
        ToCart.setVisible(false);
        ToAllCategories.setVisible(false);
        ToHome.setVisible(false);
        LogoutB.setVisible(false);
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
        BackB = new javax.swing.JLabel();
        like1 = new javax.swing.JLabel();
        cart1 = new javax.swing.JLabel();
        BGP1 = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        like = new javax.swing.JLabel();
        BGP = new javax.swing.JLabel();
        WLBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(375, 667));

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

        BackB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/backR.png"))); // NOI18N
        BackB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BackBMouseMoved(evt);
            }
        });
        BackB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackBMouseExited(evt);
            }
        });
        jPanel1.add(BackB, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 31, 24, 24));

        like1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/LP.png"))); // NOI18N
        jPanel1.add(like1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 248, 16, 16));

        cart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddCartR.png"))); // NOI18N
        cart1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cart1MouseMoved(evt);
            }
        });
        cart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cart1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cart1MouseExited(evt);
            }
        });
        jPanel1.add(cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 325, 55, 29));

        BGP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/Product2.png"))); // NOI18N
        jPanel1.add(BGP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 125, 161, 244));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/AddCartR.png"))); // NOI18N
        cart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cartMouseMoved(evt);
            }
        });
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartMouseExited(evt);
            }
        });
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 325, 55, 29));

        like.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/LP.png"))); // NOI18N
        like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                likeMouseClicked(evt);
            }
        });
        jPanel1.add(like, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 248, 16, 16));

        BGP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/Product1.png"))); // NOI18N
        jPanel1.add(BGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 125, 161, 244));

        WLBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/14-Wishlist.png"))); // NOI18N
        jPanel1.add(WLBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void likeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeMouseClicked

    }//GEN-LAST:event_likeMouseClicked

    private void BackBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseMoved
        ImageIcon icon = new ImageIcon("icons/backP.png");
        BackB.setIcon(icon);
    }//GEN-LAST:event_BackBMouseMoved

    private void BackBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseClicked
        this.dispose();
        new Home_Page().setVisible(true);
    }//GEN-LAST:event_BackBMouseClicked

    private void BackBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBMouseExited
        ImageIcon icon = new ImageIcon("icons/backR.png");
        BackB.setIcon(icon);
    }//GEN-LAST:event_BackBMouseExited

    private void cartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        cart.setIcon(icon);
    }//GEN-LAST:event_cartMouseMoved

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        cart.setIcon(icon);
    }//GEN-LAST:event_cartMouseClicked

    private void cartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        cart.setIcon(icon);
    }//GEN-LAST:event_cartMouseExited

    private void cart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart1MouseClicked
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        cart1.setIcon(icon);
    }//GEN-LAST:event_cart1MouseClicked

    private void cart1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart1MouseMoved
        ImageIcon icon = new ImageIcon("icons/AddCartP.png");
        cart1.setIcon(icon);
    }//GEN-LAST:event_cart1MouseMoved

    private void cart1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart1MouseExited
        ImageIcon icon = new ImageIcon("icons/AddCartR.png");
        cart1.setIcon(icon);
    }//GEN-LAST:event_cart1MouseExited

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
        //        new welcome_page().setVisible(true);
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
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wishlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGP;
    private javax.swing.JLabel BGP1;
    private javax.swing.JLabel BackB;
    private javax.swing.JLabel LogoutB;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel ToAllCategories;
    private javax.swing.JLabel ToCart;
    private javax.swing.JLabel ToHome;
    private javax.swing.JLabel ToSetting;
    private javax.swing.JLabel ToWishlist;
    private javax.swing.JLabel WLBG;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel cart1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel like;
    private javax.swing.JLabel like1;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
