/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ConnectionProvider;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;
import DAO.FarmaciaUtils;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import common.OpenPDF;

public class SellMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    private int finalTotalPrice = 0;
    private String billId = "";
    private String username = "";
    
    
    /**
     * Creates new form SellMedicine
     */
    public SellMedicine() {
        initComponents();
    }
    
    public SellMedicine(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }
    
    private void medicineName(String nameOrUniqueId){
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        model.setRowCount(0);
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from medicine where name like '" +nameOrUniqueId+ "%' or uniqueId like '" +nameOrUniqueId+ "%'");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("uniqueId")+"- "+rs.getString("name")});
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearMedicineFields(){
        txtUniqueId.setText("");
        txtName.setText("");
        txtCompany.setText("");
        txtPricePerUnit.setText("");
        txtNoOfUnits.setText("");
        txtTotalPrice.setText("");
    }
    
    public String getUniqueId(String prefix){
        return prefix + System.nanoTime();
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
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        txtUniqueId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPricePerUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNoOfUnits = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblFinalTotalPrice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Vender Medicina");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1280, -1));

        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 280, -1));

        medicinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicinas"
            }
        ));
        medicinesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 430, -1));
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 280, -1));

        jLabel3.setText("ID de la medicina");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 280, -1));

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 280, -1));

        jLabel5.setText("Nombre de la compania");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel6.setText("Precio por unidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, -1, -1));
        getContentPane().add(txtPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 280, -1));

        jLabel7.setText("Numero de unidades");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, -1, -1));

        txtNoOfUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoOfUnitsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoOfUnitsKeyReleased(evt);
            }
        });
        getContentPane().add(txtNoOfUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 280, -1));
        getContentPane().add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 280, -1));

        jLabel8.setText("Precio total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicina ID", "Nombre", "Compania", "Precio por unidad", "Nu. de unidades", "Precio total"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 590, 230));

        jButton1.setText("Comprar y imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 150, 30));

        lblFinalTotalPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFinalTotalPrice.setText("00");
        getContentPane().add(lblFinalTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("$ARS:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, -1, -1));

        btnAddToCart.setText("Agregar al carrito");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 200, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/close32.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAssets/white_background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(finalTotalPrice != 0){
            billId = getUniqueId("Bill-");
            
            DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
            if(cartTable.getRowCount() != 0){
                for(int i=0;i<cartTable.getRowCount();i++){
                    try{
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        st.executeUpdate("update medicine set quantity=quantity-"+Integer.parseInt(dtm.getValueAt(i, 4).toString()) + " where uniqueId="+Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                
                try{
                    SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                    Calendar cal = Calendar.getInstance();
                    Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement("insert into bill(billId,billDate,totalPaid,generatedBy) values(?,?,?,?)");
                    ps.setString(1, billId);
                    ps.setString(2, myFormat.format(cal.getTime()));
                    ps.setInt(3, finalTotalPrice);
                    ps.setString(4, username);
                    ps.executeUpdate();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
                //Creacion de la factura ---
                com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
                try{
                    PdfWriter.getInstance(doc, new FileOutputStream(FarmaciaUtils.billPath+""+billId+".pdf"));
                    doc.open();
                    Paragraph pharmacyName = new Paragraph("                                                                        Sistema de gestión de Farmacia\n");
                    doc.add(pharmacyName);
                    Paragraph starLine = new Paragraph("********************************************************************************************************************************************************");
                    doc.add(starLine);
                    Paragraph details = new Paragraph("\tID de Factura: "+billId+"\nFecha: "+ new Date()+"\nPrecio Total: "+finalTotalPrice);
                    doc.add(details);
                    doc.add(starLine);
                    PdfPTable tbl = new PdfPTable(6); 
                    tbl.addCell("ID de Medicina");
                    tbl.addCell("Nombre");
                    tbl.addCell("Compania");
                    tbl.addCell("Precio por unidad");
                    tbl.addCell("Numero de unidad");
                    tbl.addCell("Precio sub Total");
                    for(int i=0;i<cartTable.getRowCount();i++){
                        String a = cartTable.getValueAt(i, 0).toString();
                        String b = cartTable.getValueAt(i, 1).toString();
                        String c = cartTable.getValueAt(i, 2).toString();
                        String d = cartTable.getValueAt(i, 3).toString();
                        String e = cartTable.getValueAt(i, 4).toString();
                        String f = cartTable.getValueAt(i, 5).toString();
                        tbl.addCell(a);
                        tbl.addCell(b);
                        tbl.addCell(c);
                        tbl.addCell(d);
                        tbl.addCell(e);
                        tbl.addCell(f);
                    }
                    doc.add(tbl);
                    doc.add(starLine);
                    Paragraph thanksMsg = new Paragraph("Gracias por su visita");
                    doc.add(thanksMsg);
                    OpenPDF.openById(String.valueOf(billId));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                doc.close();
                setVisible(false);
                new SellMedicine(username).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Porfavor agregue alguna medicina al carrito.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        medicineName("");
        txtUniqueId.setEditable(false);
        txtName.setEditable(false);
        txtCompany.setEditable(false);
        txtPricePerUnit.setEditable(false);
        txtTotalPrice.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:    
        String search = txtSearch.getText();
        medicineName(search);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void medicinesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesTableMouseClicked
        // TODO add your handling code here:
        int index = medicinesTable.getSelectedRow();
        TableModel model = medicinesTable.getModel();
        String nameOrUniqueId = model.getValueAt(index, 0).toString();
        
        String uniqueId[] = nameOrUniqueId.split("-",0);
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from medicine where uniqueId=" +uniqueId[0]+ "");
            while(rs.next()){
                txtUniqueId.setText(uniqueId[0]);
                txtName.setText(rs.getString("name"));
                txtCompany.setText(rs.getString("companyName"));
                txtPricePerUnit.setText(rs.getString("price"));
                txtNoOfUnits.setText("");
                txtTotalPrice.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicinesTableMouseClicked

    private void txtNoOfUnitsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfUnitsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfUnitsKeyPressed

    private void txtNoOfUnitsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfUnitsKeyReleased
        // TODO add your handling code here:
        String noOfUnits = txtNoOfUnits.getText();
        if(!noOfUnits.equals("")){
            String price = txtPricePerUnit.getText();
            if(!noOfUnits.matches(numberPattern)){
                JOptionPane.showMessageDialog(null, "El campo de numero de unidades es invalido.");
            }
            int totalPrice = Integer.parseInt(noOfUnits) * Integer.parseInt(price);
            txtTotalPrice.setText(String.valueOf(totalPrice));
        }else{
            txtTotalPrice.setText("");
        }
    }//GEN-LAST:event_txtNoOfUnitsKeyReleased

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        String noOfUnits = txtNoOfUnits.getText();
        String uniqueId = txtUniqueId.getText();
        
        if(!noOfUnits.equals("") && !uniqueId.equals("")){
            String name = txtName.getText();
            String companyName = txtCompany.getText();
            String pricePerUnit = txtPricePerUnit.getText();
            String totalPrice = txtTotalPrice.getText();
            int checkStock = 0;
            int checkMedicineAlreadyExistInCart = 0;
            
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from medicine where uniqueId=" +uniqueId+ "");
                while(rs.next()){
                    if(rs.getInt("quantity") >= Integer.parseInt(noOfUnits)){
                        checkStock = 1;
                }else{
                        JOptionPane.showMessageDialog(null, "El medicamento está en stock. Solo quedan "+rs.getInt("quantity"));
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            if(checkStock == 1){
                DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
                if(cartTable.getRowCount() != 0){
                    for(int i = 0; i < cartTable.getRowCount();i++){
                        if(Integer.parseInt(dtm.getValueAt(i, 0).toString()) == Integer.parseInt(uniqueId)){
                            checkMedicineAlreadyExistInCart = 1;
                            JOptionPane.showMessageDialog(null, "La medicina ya existe en el carrito.");
                        }
                    }
                }
                if(checkMedicineAlreadyExistInCart == 0){
                    dtm.addRow(new Object[]{uniqueId,name,companyName,pricePerUnit,noOfUnits,totalPrice});
                    finalTotalPrice = finalTotalPrice + Integer.parseInt(totalPrice);
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Agregado correctamente.");
                }
                clearMedicineFields();
            }      
        }else{
            JOptionPane.showMessageDialog(null, "El campo de numero de unidades y de medicina están vacios.");
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
        int index = cartTable.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar esta medicina?", "Seleccionar", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            TableModel model = cartTable.getModel();
            String total = model.getValueAt(index, 5).toString();
            finalTotalPrice = finalTotalPrice - Integer.parseInt(total);
            lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) cartTable.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_cartTableMouseClicked

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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFinalTotalPrice;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoOfUnits;
    private javax.swing.JTextField txtPricePerUnit;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUniqueId;
    // End of variables declaration//GEN-END:variables
}
