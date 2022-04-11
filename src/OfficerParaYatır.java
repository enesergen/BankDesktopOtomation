

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class OfficerParaYatır extends javax.swing.JFrame {

    static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    DefaultTableModel model;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.CUSTOMER";

    static int tabloMusteriSeciliIndexId = -1;
    static String tabloMusteriSeciliIndexUserName = "";
    static String tabloMusteriSeciliIndexPassword = "";
    static String tabloMusteriSeciliIndexTCNO = "";
    static String tabloMusteriSeciliIndexAd = "";
    static String tabloMusteriSeciliIndexSoyad = "";
    static String tabloMusteriSeciliIndexDogumTarih = "";
    static String tabloMusteriSeciliIndexDogumYer = "";
    static String tabloMusteriSeciliIndexBabaAd = "";
    static String tabloMusteriSeciliIndexAnneAd = "";
    static String tabloMusteriSeciliIndexAnneKızlıkSoyad = "";
    static String tabloMusteriSeciliIndexTelNO = "";
    static String tabloMusteriSeciliIndexEMail = "";
    static String tabloMusteriSeciliIndexAdres = "";
    static String tabloMusteriSeciliIndexSehir = "";
    static String tabloMusteriSeciliIndexHesapBakiye = "";
    static String tabloMusteriSeciliIndexKartBorcu = "";
    static String tabloMusteriSeciliIndexKrediBorcu = "";
    
    
    static int tabloMusteriSeciliIndexId1 = -1;
    static String tabloMusteriSeciliIndexUserName1 = "";
    static String tabloMusteriSeciliIndexPassword1 = "";
    static String tabloMusteriSeciliIndexTCNO1= "";
    static String tabloMusteriSeciliIndexAd1 = "";
    static String tabloMusteriSeciliIndexSoyad1 = "";
    static String tabloMusteriSeciliIndexDogumTarih1 = "";
    static String tabloMusteriSeciliIndexDogumYer1 = "";
    static String tabloMusteriSeciliIndexBabaAd1 = "";
    static String tabloMusteriSeciliIndexAnneAd1 = "";
    static String tabloMusteriSeciliIndexAnneKızlıkSoyad1 = "";
    static String tabloMusteriSeciliIndexTelNO1 = "";
    static String tabloMusteriSeciliIndexEMail1 = "";
    static String tabloMusteriSeciliIndexAdres1= "";
    static String tabloMusteriSeciliIndexSehir1 = "";
    static String tabloMusteriSeciliIndexHesapBakiye1 = "";
    static String tabloMusteriSeciliIndexKartBorcu1 = "";
    static String tabloMusteriSeciliIndexKrediBorcu1 = "";
   
    
    public OfficerParaYatır() {
         initComponents();
         populateTable();
        allCustomers.clear();
    }

  public void populateTable() {
        model = (DefaultTableModel) tblCustomers.getModel();
        allCustomers = getCustomers();
        for (Customer customer : allCustomers) {
            Object[] row = {
                customer.getId(), customer.getUserName(), customer.getPassword(),
                customer.getAd(), customer.getSoyAd(), customer.getDogumTarih(), customer.getDogumYer(),
                customer.getHesapBakiye(), customer.getKartBorcu(), customer.getKrediBorcu()
            };
            model.addRow(row);
        }
    }

    public ArrayList<Customer> getCustomers() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                allCustomers.add(new Customer(
                        resultSet.getDouble("HESAPBAKIYE"),
                        resultSet.getDouble("KARTBORCU"),
                        resultSet.getDouble("KREDIBORCU"),
                        resultSet.getString("USERNAME"),
                        resultSet.getString("PASSWORD"),
                        resultSet.getInt("ID"),
                        resultSet.getString("TCNO"),
                        resultSet.getString("AD"),
                        resultSet.getString("SOYAD"),
                        resultSet.getString("DOGUMTARIH"),
                        resultSet.getString("DOGUMYER"),
                        resultSet.getString("BABAAD"),
                        resultSet.getString("ANNEAD"),
                        resultSet.getString("ANNEKIZLIKSOYAD"),
                        resultSet.getString("TELNO"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("ADRES"),
                        resultSet.getString("SEHIR")
                ));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminAllCustomerOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCustomers;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTutar = new javax.swing.JTextField();
        txtParaCek = new javax.swing.JButton();
        txtParaYatır = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - MÜŞTERİ HESABINA PARA YATIRMA / ÇEKME İŞLEM EKRANI");

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USERNAME", "PASSWORD", "AD", "SOYAD", "DOGUM TARIH", "DOGUM YERI", "HESAP BAKIYE", "KART BORCU", "KREDİ BORCU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomers);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSearch.setText("Aranacak Kelime ");

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("GERİ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("İŞLEM YAPILACAK TUTAR");

        txtTutar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTutar.setText("0.0");

        txtParaCek.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtParaCek.setText("SEÇİLİ HESAPTAN PARA ÇEK");
        txtParaCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParaCekActionPerformed(evt);
            }
        });

        txtParaYatır.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtParaYatır.setText("SEÇİLİ HESABA PARA YATIR");
        txtParaYatır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParaYatırActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblMessage.setText("BUTONLARDAN BİRİNE TIKLANDIĞI ZAMAN BİLGİNİN ANLIK GÜNCELLENMESİ İÇİN SAYFA YENİLENECEKTİR...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 476, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(txtParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtParaYatır, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParaYatır, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblCustomers.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       OfficerHomePage officerHomePage=new OfficerHomePage();
       officerHomePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParaCekActionPerformed
        DB db = new DB();
        PreparedStatement statement = null;
        tabloMusteriSeciliIndexId = Integer.parseInt(model.getValueAt(tblCustomers.getSelectedRow(), 0).toString()); 
        String indexNo = String.valueOf(tabloMusteriSeciliIndexId);
        tabloMusteriSeciliIndexHesapBakiye= model.getValueAt(tblCustomers.getSelectedRow(), 7).toString();
        double maxCekme=Double.valueOf(tabloMusteriSeciliIndexHesapBakiye);
        double yeniBakiye=maxCekme-Double.valueOf(txtTutar.getText());
        
        
        try {
            if(Double.valueOf(txtTutar.getText())>maxCekme){
                lblMessage.setText("Maksimum çekebileceğiniz tutar Seçili Hesap Bakiyesi kadardır...");
            }else{
            connection = db.getConnection();
            statement = connection.prepareStatement("UPDATE ROOT.CUSTOMER SET HESAPBAKIYE=? WHERE ID="+indexNo);
            statement.setDouble(1, Double.valueOf(yeniBakiye));
            statement.execute();
            OfficerParaYatır officerParaYatır=new OfficerParaYatır();
            officerParaYatır.setVisible(true);
            this.dispose();
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OfficerParaYatır.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_txtParaCekActionPerformed

    private void txtParaYatırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParaYatırActionPerformed
         DB db = new DB();
        PreparedStatement statement = null;
        tabloMusteriSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblCustomers.getSelectedRow(), 0).toString()); 
        String indexNo = String.valueOf(tabloMusteriSeciliIndexId1);
        tabloMusteriSeciliIndexHesapBakiye1= model.getValueAt(tblCustomers.getSelectedRow(), 7).toString();
        double maxCekme=Double.valueOf(tabloMusteriSeciliIndexHesapBakiye1);
        double yeniBakiye=maxCekme+Double.valueOf(txtTutar.getText());
        
        
        try {
            
            connection = db.getConnection();
            statement = connection.prepareStatement("UPDATE ROOT.CUSTOMER SET HESAPBAKIYE=? WHERE ID="+indexNo);
            statement.setDouble(1, Double.valueOf(yeniBakiye));
            statement.execute();
            OfficerParaYatır officerParaYatır=new OfficerParaYatır();
            officerParaYatır.setVisible(true);
            this.dispose();
         
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OfficerParaYatır.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_txtParaYatırActionPerformed

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
            java.util.logging.Logger.getLogger(OfficerParaYatır.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerParaYatır.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerParaYatır.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerParaYatır.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerParaYatır().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JButton txtParaCek;
    private javax.swing.JButton txtParaYatır;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTutar;
    // End of variables declaration//GEN-END:variables
}
