
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
public class AdminAllOfficerOperations extends javax.swing.JFrame  implements TabloDoldur {

    static ArrayList<Officer> allOfficers = new ArrayList<Officer>();//tüm memur bilgileri
    DefaultTableModel model;

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.OFFICER";

    static int tabloMemurSeciliIndexId = -1;// seçili indexdeki ıd vericek burdan işlemleri yapacağız.
    static String tabloMemurSeciliIndexUserName = "";
    static String tabloMemurSeciliIndexPassword = "";
    static double tabloMemurSeciliIndexMaas = 0;
    static String tabloMemurSeciliIndexTCNO = "";
    static String tabloMemurSeciliIndexAd = "";
    static String tabloMemurSeciliIndexSoyad = "";
    static String tabloMemurSeciliIndexDogumTarih = "";
    static String tabloMemurSeciliIndexDogumYer = "";
    static String tabloMemurSeciliIndexBabaAd = "";
    static String tabloMemurSeciliIndexAnneAd = "";
    static String tabloMemurSeciliIndexAnneKızlıkSoyad = "";
    static String tabloMemurSeciliIndexTelNo = "";
    static String tabloMemurSeciliIndexEMail = "";
    static String tabloMemurSeciliIndexAdres = "";
    static String tabloMemurSeciliIndexSehir = "";
    
    static int tabloMemurSeciliIndexId1 = -1;// seçili indexdeki ıd vericek burdan işlemleri yapacağız.
    static String tabloMemurSeciliIndexUserName1 = "";
    static String tabloMemurSeciliIndexPassword1 = "";
    static double tabloMemurSeciliIndexMaas1 = 0;
    static String tabloMemurSeciliIndexTCNO1 = "";
    static String tabloMemurSeciliIndexAd1 = "";
    static String tabloMemurSeciliIndexSoyad1 = "";
    static String tabloMemurSeciliIndexDogumTarih1 = "";
    static String tabloMemurSeciliIndexDogumYer1 = "";
    static String tabloMemurSeciliIndexBabaAd1 = "";
    static String tabloMemurSeciliIndexAnneAd1 = "";
    static String tabloMemurSeciliIndexAnneKızlıkSoyad1 = "";
    static String tabloMemurSeciliIndexTelNo1 = "";
    static String tabloMemurSeciliIndexEMail1 = "";
    static String tabloMemurSeciliIndexAdres1 = "";
    static String tabloMemurSeciliIndexSehir1 = "";
   
    
    
   

    public AdminAllOfficerOperations() {
        initComponents();
        populateTable();
        allOfficers.clear();
    }

    public void populateTable() {
        model = (DefaultTableModel) tblOfficers.getModel();
        allOfficers = getOfficers();
        for (Officer officer : allOfficers) {
            Object[] row = {
                officer.getId(), officer.getKullaniciAd(), officer.getSifre(), officer.getMaas(),
                officer.getTcNo(), officer.getAd(), officer.getSoyAd(), officer.getDogumTarih(), officer.getDogumYer(),
                officer.getBabaAd(), officer.getAnneAd(), officer.getAnneKızlıkSoyAd(), officer.getTelNo(),
                officer.geteMail(), officer.getAdres(), officer.getSehir()
            };
            model.addRow(row);
        }
    }

    public ArrayList<Officer> getOfficers() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                allOfficers.add(new Officer(
                        resultSet.getString("USERNAME"),
                        resultSet.getString("PASSWORD"),
                        resultSet.getDouble("MAAS"),
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
            Logger.getLogger(AdminAllOfficerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allOfficers;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOfficers = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        brnEditSelectedRow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - TÜM MEMUR İŞLEMLERİ");
        setPreferredSize(new java.awt.Dimension(1500, 800));

        tblOfficers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblOfficers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USERNAME", "PASSWORD", "MAAS", "TCNO", "AD", "SOYAD", "DOGUM TARIH", "DOGUM YER", "BABA ADI", "ANNE ADI", "ANNE KIZLIK SOYADI", "TELEFON", "E MAIL", "ADRES", "SEHIR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOfficers);

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearch.setText("Aranacak İfade    :");

        brnEditSelectedRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        brnEditSelectedRow.setText("SEÇİLİ SATIR MEMUR AYRINTILI GÖR / MAAŞ GÜNCELLE");
        brnEditSelectedRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnEditSelectedRowActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setText("SEÇİLİ SATIR MEMURU SİL");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setText("YENİ MEMUR EKLEME");
        btnAdd.setMaximumSize(new java.awt.Dimension(150, 30));
        btnAdd.setMinimumSize(new java.awt.Dimension(150, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminHomePage adminHomePage = new AdminHomePage();
        adminHomePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblOfficers.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));


    }//GEN-LAST:event_txtSearchKeyReleased

    private void brnEditSelectedRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnEditSelectedRowActionPerformed

        // System.out.println(model.getValueAt(tblOfficers.getSelectedRow(),0));   //yukarda seçili satırdaki seçili column daki değeri okuyor string olarak.
        tabloMemurSeciliIndexId = Integer.parseInt(model.getValueAt(tblOfficers.getSelectedRow(), 0).toString());
        tabloMemurSeciliIndexUserName = (model.getValueAt(tblOfficers.getSelectedRow(), 1).toString());
        tabloMemurSeciliIndexPassword = (model.getValueAt(tblOfficers.getSelectedRow(), 2).toString());
        tabloMemurSeciliIndexMaas = Double.valueOf(model.getValueAt(tblOfficers.getSelectedRow(), 3).toString());
        tabloMemurSeciliIndexTCNO = (model.getValueAt(tblOfficers.getSelectedRow(), 4).toString());
        tabloMemurSeciliIndexAd = (model.getValueAt(tblOfficers.getSelectedRow(), 5).toString());
        tabloMemurSeciliIndexSoyad = (model.getValueAt(tblOfficers.getSelectedRow(), 6).toString());
        tabloMemurSeciliIndexDogumTarih = (model.getValueAt(tblOfficers.getSelectedRow(), 7).toString());
        tabloMemurSeciliIndexDogumYer = (model.getValueAt(tblOfficers.getSelectedRow(), 8).toString());
        tabloMemurSeciliIndexBabaAd = (model.getValueAt(tblOfficers.getSelectedRow(), 9).toString());
        tabloMemurSeciliIndexAnneAd = (model.getValueAt(tblOfficers.getSelectedRow(), 10).toString());
        tabloMemurSeciliIndexAnneKızlıkSoyad = (model.getValueAt(tblOfficers.getSelectedRow(), 11).toString());
        tabloMemurSeciliIndexTelNo = (model.getValueAt(tblOfficers.getSelectedRow(), 12).toString());
        tabloMemurSeciliIndexEMail = (model.getValueAt(tblOfficers.getSelectedRow(), 13).toString());
        tabloMemurSeciliIndexAdres = (model.getValueAt(tblOfficers.getSelectedRow(), 14).toString());
        tabloMemurSeciliIndexSehir = (model.getValueAt(tblOfficers.getSelectedRow(), 15).toString());

        AdminEditOfficer adminEditOfficer = new AdminEditOfficer();
        adminEditOfficer.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_brnEditSelectedRowActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        AdminAddOfficer adminAddOfficer = new AdminAddOfficer();
        adminAddOfficer.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
         tabloMemurSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblOfficers.getSelectedRow(), 0).toString());
        tabloMemurSeciliIndexUserName1 = (model.getValueAt(tblOfficers.getSelectedRow(), 1).toString());
        tabloMemurSeciliIndexPassword1 = (model.getValueAt(tblOfficers.getSelectedRow(), 2).toString());
        tabloMemurSeciliIndexMaas1 = Double.valueOf(model.getValueAt(tblOfficers.getSelectedRow(), 3).toString());
        tabloMemurSeciliIndexTCNO1 = (model.getValueAt(tblOfficers.getSelectedRow(), 4).toString());
        tabloMemurSeciliIndexAd1 = (model.getValueAt(tblOfficers.getSelectedRow(), 5).toString());
        tabloMemurSeciliIndexSoyad1 = (model.getValueAt(tblOfficers.getSelectedRow(), 6).toString());
        tabloMemurSeciliIndexDogumTarih1 = (model.getValueAt(tblOfficers.getSelectedRow(), 7).toString());
        tabloMemurSeciliIndexDogumYer1 = (model.getValueAt(tblOfficers.getSelectedRow(), 8).toString());
        tabloMemurSeciliIndexBabaAd1 = (model.getValueAt(tblOfficers.getSelectedRow(), 9).toString());
        tabloMemurSeciliIndexAnneAd1 = (model.getValueAt(tblOfficers.getSelectedRow(), 10).toString());
        tabloMemurSeciliIndexAnneKızlıkSoyad1 = (model.getValueAt(tblOfficers.getSelectedRow(), 11).toString());
        tabloMemurSeciliIndexTelNo1 = (model.getValueAt(tblOfficers.getSelectedRow(), 12).toString());
        tabloMemurSeciliIndexEMail1 = (model.getValueAt(tblOfficers.getSelectedRow(), 13).toString());
        tabloMemurSeciliIndexAdres1 = (model.getValueAt(tblOfficers.getSelectedRow(), 14).toString());
        tabloMemurSeciliIndexSehir1 = (model.getValueAt(tblOfficers.getSelectedRow(), 15).toString());

        
        
        
        AdminDeleteOfficer adminDeleteOfficer=new AdminDeleteOfficer();
        adminDeleteOfficer.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAllOfficerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllOfficerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllOfficerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllOfficerOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllOfficerOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnEditSelectedRow;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblOfficers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
