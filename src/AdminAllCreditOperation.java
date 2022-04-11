
import java.sql.Connection;
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
public class AdminAllCreditOperation extends javax.swing.JFrame  implements TabloDoldur {

    ArrayList<Credit> allCredits = new ArrayList<Credit>();
    DefaultTableModel model;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.CREDIT";

    static int tabloKrediSeciliIndexId = -1;
    static int tabloKrediSeciliIndexCustomerId = -1;
    static String tabloKrediSeciliIndexAd = "";
    static String tabloKrediSeciliIndexSoyAd = "";
    static double tabloKrediSeciliIndexMiktar = 0;
    static String tabloKrediSeciliIndexAcıklama = "";
    static boolean tabloKrediSeciliIndexDurum;
    static boolean tabloKrediSeciliIndexOnay;

    static int tabloKrediSeciliIndexId1 = -1;
    static int tabloKrediSeciliIndexCustomerId1 = -1;
    static String tabloKrediSeciliIndexAd1 = "";
    static String tabloKrediSeciliIndexSoyAd1 = "";
    static double tabloKrediSeciliIndexMiktar1 = 0;
    static String tabloKrediSeciliIndexAcıklama1 = "";
    static boolean tabloKrediSeciliIndexDurum1;
    static boolean tabloKrediSeciliIndexOnay1;

    public AdminAllCreditOperation() {
        initComponents();
        populateTable();
        allCredits.clear();
    }

    public ArrayList<Credit> getCredits() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                allCredits.add(new Credit(
                        resultSet.getInt("ID"),
                        resultSet.getInt("CUSTOMERID"),
                        resultSet.getString("AD"),
                        resultSet.getString("SOYAD"),
                        resultSet.getDouble("MIKTAR"),
                        resultSet.getString("ACIKLAMA"),
                        resultSet.getBoolean("DURUM"),
                        resultSet.getBoolean("ONAY")
                ));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminAllCreditOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCredits;
    }

    public void populateTable() {
        model = (DefaultTableModel) tblCredits.getModel();
        allCredits = getCredits();
        for (Credit credit : allCredits) {
            Object[] row = {
                credit.getId(), credit.getCustomerId(), credit.getAd(),
                credit.getSoyAd(), credit.getMiktar(), credit.getAciklama(), credit.isDurum()
            };
            if (credit.isDurum() == false) {
                model.addRow(row);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCredits = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnNo = new javax.swing.JButton();
        btnYes = new javax.swing.JButton();
        btnAllCredit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBaslik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK -BEKLEYEN KREDİ İŞLEM EKRAN");

        tblCredits.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblCredits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MÜŞTERİ ID", "AD", "SOYAD", "MİKTAR", "AÇIKLAMA", "İŞLEM GÖRME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCredits);

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearch.setText("Aranacak İfade    :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNo.setText("SEÇİLİ SATIR KREDİ RED İŞLEMİ ");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        btnYes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnYes.setText("SEÇİLİ SATIR KREDİ ONAY İŞLEMİ ");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnAllCredit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAllCredit.setText("TÜM KREDİ LİSTESİ (BEKLEYEN VE İŞLEM GÖREN)");
        btnAllCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCreditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("İ.ŞLEM GÖRME DURUMU (TİK YOK İSE): BAŞVURU BEKLEME AŞAMASINDA DEMEK ONAY VEYA RED BEKLİYOR DEMEK.");

        lblBaslik.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBaslik.setText("BEKLEYEN KREDİ BAŞVURULARI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257)
                                .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAllCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAllCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
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
        tblCredits.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        tabloKrediSeciliIndexId = Integer.parseInt(model.getValueAt(tblCredits.getSelectedRow(), 0).toString());
        tabloKrediSeciliIndexCustomerId = Integer.parseInt(model.getValueAt(tblCredits.getSelectedRow(), 1).toString());
        tabloKrediSeciliIndexAd =  (model.getValueAt(tblCredits.getSelectedRow(), 2).toString());
        tabloKrediSeciliIndexSoyAd = (model.getValueAt(tblCredits.getSelectedRow(), 3).toString());
        tabloKrediSeciliIndexMiktar = Double.valueOf(model.getValueAt(tblCredits.getSelectedRow(), 4).toString());
        tabloKrediSeciliIndexAcıklama = (model.getValueAt(tblCredits.getSelectedRow(), 5).toString());
        tabloKrediSeciliIndexDurum=Boolean.valueOf(model.getValueAt(tblCredits.getSelectedRow(), 6).toString());
        AdminCreditOnay adminCreditOnay=new AdminCreditOnay();
        adminCreditOnay.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
         tabloKrediSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblCredits.getSelectedRow(), 0).toString());
        tabloKrediSeciliIndexCustomerId1 = Integer.parseInt(model.getValueAt(tblCredits.getSelectedRow(), 1).toString());
        tabloKrediSeciliIndexAd1 =  (model.getValueAt(tblCredits.getSelectedRow(), 2).toString());
        tabloKrediSeciliIndexSoyAd1 = (model.getValueAt(tblCredits.getSelectedRow(), 3).toString());
        tabloKrediSeciliIndexMiktar1 = Double.valueOf(model.getValueAt(tblCredits.getSelectedRow(), 4).toString());
        tabloKrediSeciliIndexAcıklama1 = (model.getValueAt(tblCredits.getSelectedRow(), 5).toString());
        tabloKrediSeciliIndexDurum1=Boolean.valueOf(model.getValueAt(tblCredits.getSelectedRow(), 6).toString());
        
        AdminCreditRed adminCreditRed=new AdminCreditRed();
        adminCreditRed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnAllCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCreditActionPerformed
       AdminAllCreditTable adminAllCreditTable=new AdminAllCreditTable();
       adminAllCreditTable.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAllCreditActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAllCreditOperation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllCreditOperation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllCreditOperation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllCreditOperation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllCreditOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllCredit;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaslik;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCredits;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
