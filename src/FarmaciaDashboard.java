/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

public class FarmaciaDashboard extends javax.swing.JFrame {
    
    private String username = "";

    /**
     * Creates new form FarmaciaDashboard
     */
    public FarmaciaDashboard() {
        initComponents();
    }
    
    public FarmaciaDashboard(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(10, 10, 10));
        jLabel1.setFont(new java.awt.Font("Coco Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Panel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 420, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1920, 20));

        jButton3.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/sell.png"))); // NOI18N
        jButton3.setText(" Vender Medicina");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 280, 90));

        jButton4.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/bill.png"))); // NOI18N
        jButton4.setText(" Ver Factura");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, 280, 90));

        jButton5.setFont(new java.awt.Font("Coco Gothic", 1, 20)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/add.png"))); // NOI18N
        jButton5.setText(" Agregar Medicina ");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 280, 90));

        jButton6.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/profile-user_64572.png"))); // NOI18N
        jButton6.setText(" Perfil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 280, 90));

        jLabel2.setBackground(new java.awt.Color(10, 10, 10));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("v1.0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 1050, -1, -1));

        jButton7.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/sell.png"))); // NOI18N
        jButton7.setText(" Ver Medicina");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 280, 90));

        jButton9.setFont(new java.awt.Font("Coco Gothic", 1, 20)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/update.png"))); // NOI18N
        jButton9.setText(" Actualizar Medicina");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 280, 90));

        jButton8.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/logout.png"))); // NOI18N
        jButton8.setText(" Cerrar Sesión");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 680, 280, 90));

        jButton10.setFont(new java.awt.Font("Coco Gothic", 1, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/exit.png"))); // NOI18N
        jButton10.setText(" Salir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, 280, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/Dashboard_Background.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "¿Quieres cerrar sesión?", "Seleccionar", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "¿Quieres cerrar la aplicación?", "Seleccionar", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Profile(username).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FarmaciaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarmaciaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarmaciaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarmaciaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmaciaDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
