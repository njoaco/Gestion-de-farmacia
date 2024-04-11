/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;

public class AddMedicine extends javax.swing.JFrame {
    
    public String numberPattern = "^[0-9]*$";

    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Medicina");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1030, 10));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 310, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 310, -1));

        jLabel4.setText("Compania");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 310, -1));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/close32.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 40, 40));
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 310, -1));

        jLabel6.setText("Precio por unidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 310, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 100, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/white_background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String uniqueId = txtUniqueId.getText();
        String name = txtName.getText();
        String companyName = txtCompany.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        
        if(uniqueId.equals("")){
            JOptionPane.showMessageDialog(null, "Campo ID vacio.");
        }else if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Campo de nombre vacio.");
        }else if(companyName.equals("")){
            JOptionPane.showMessageDialog(null, "Campo de compania vacio.");
        }else if(quantity.equals("")){
            JOptionPane.showMessageDialog(null, "Campo de cantidad vacio.");
        }else if(!quantity.matches(numberPattern)){
            JOptionPane.showMessageDialog(null, "Campo de cantidad es invalido.");
        }else if(price.equals("")){
            JOptionPane.showMessageDialog(null, "Campo de precio vacio.");
        } else if (!price.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Campo de precio es invalido.");
        }else{
            try{
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into medicine (uniqueId, name, companyName, quantity, price) values(?,?,?,?,?)");
            ps.setString(1, uniqueId);
            ps.setString(2, name);
            ps.setString(3, companyName);
            ps.setString(4, quantity);
            ps.setString(5, price);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medicina agregada correctamente.");
            setVisible(true);
            new AddMedicine().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUniqueId;
    // End of variables declaration//GEN-END:variables
}