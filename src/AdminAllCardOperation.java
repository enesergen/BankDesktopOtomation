
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
public class AdminAllCardOperation extends javax.swing.JFrame implements TabloDoldur{

    ArrayList<Card> allCards = new ArrayList<Card>();
    DefaultTableModel model;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.CARD";

    static int tabloKartSeciliIndexId = -1;
    static int tabloKartSeciliIndexCustomerId = -1;
    static String tabloKartSeciliIndexAd = "";
    static String tabloKartSeciliIndexSoyAd = "";
    static String tabloKartSeciliIndexKartNo = "";
    static double tabloKartSeciliIndexLimit = 0;
    static boolean tabloKartSeciliIndexDurum;
    static boolean tabloKartSeciliIndexOnay;

    static int tabloKartSeciliIndexId1 = -1;
    static int tabloKartSeciliIndexCustomerId1 = -1;
    static String tabloKartSeciliIndexAd1 = "";
    static String tabloKartSeciliIndexSoyAd1 = "";
    static String tabloKartSeciliIndexKartNo1 = "";
    static double tabloKartSeciliIndexLimit1 = 0;
    static boolean tabloKartSeciliIndexDurum1;
    static boolean tabloKartSeciliIndexOnay1;

    public AdminAllCardOperation() {
        initComponents();
        populateTable();
        allCards.clear();
    }

    public void populateTable(){
          model = (DefaultTableModel) tblCards.getModel();
          allCards=getCards();
          for(Card card:allCards){
              Object [] row={
                 card.getId(),card.getCustomerId(),card.getAd(),card.getSoyad(),
                  card.getKartNo(),card.getLimit(),card.isDurum()
              };
                 if (card.isDurum() == false) {
                model.addRow(row);
            }
          }
        
        
    }
    
    public ArrayList<Card> getCards() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
             while (resultSet.next()){
                 allCards.add(new Card(
                         resultSet.getInt("ID"),
                         resultSet.getInt("CUSTOMERID"),
                         resultSet.getString("AD"),
                         resultSet.getString("SOYAD"),
                         resultSet.getString("KARTNO"),
                         resultSet.getDouble("LIMIT"),
                         resultSet.getBoolean("DURUM"),
                         resultSet.getBoolean("ONAY")
                 ));
                 
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminAllCardOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCards;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCards = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnAllCard = new javax.swing.JButton();
        lblBaslik = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - BEKLEYEN KART BAŞVURU EKRANI");

        tblCards.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblCards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MÜŞTERİ ID", "AD", "SOYAD", "KART NO", "LIMIT", "İŞLEM GÖRME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(tblCards);

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearch.setText("Aranacak İfade    :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnAllCard.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAllCard.setText("TÜM KART LİSTESİ (BEKLEYEN VE İŞLEM GÖREN)");
        btnAllCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCardActionPerformed(evt);
            }
        });

        lblBaslik.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBaslik.setText("BEKLEYEN KART BAŞVURULARI");

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnYes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnYes.setText("SEÇİLİ SATIR KART ONAY İŞLEMİ ");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNo.setText("SEÇİLİ SATIR KART RED İŞLEMİ ");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAllCard, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAllCard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblCards.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAllCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCardActionPerformed
        AdminAllCardTable adminAllCardTable=new AdminAllCardTable();
        adminAllCardTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAllCardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminHomePage adminHomePage = new AdminHomePage();
        adminHomePage.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        tabloKartSeciliIndexId = Integer.parseInt(model.getValueAt(tblCards.getSelectedRow(), 0).toString());
        tabloKartSeciliIndexCustomerId = Integer.parseInt(model.getValueAt(tblCards.getSelectedRow(), 1).toString());
        tabloKartSeciliIndexAd = (model.getValueAt(tblCards.getSelectedRow(), 2).toString());
        tabloKartSeciliIndexSoyAd = (model.getValueAt(tblCards.getSelectedRow(), 3).toString());
        tabloKartSeciliIndexKartNo = (model.getValueAt(tblCards.getSelectedRow(), 4).toString());
        tabloKartSeciliIndexLimit = Double.valueOf(model.getValueAt(tblCards.getSelectedRow(), 5).toString());
        tabloKartSeciliIndexDurum = Boolean.valueOf(model.getValueAt(tblCards.getSelectedRow(), 6).toString());
        AdminCardOnay adminCardOnay = new AdminCardOnay();
        adminCardOnay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        tabloKartSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblCards.getSelectedRow(), 0).toString());
        tabloKartSeciliIndexCustomerId1 = Integer.parseInt(model.getValueAt(tblCards.getSelectedRow(), 1).toString());
        tabloKartSeciliIndexAd1 = (model.getValueAt(tblCards.getSelectedRow(), 2).toString());
        tabloKartSeciliIndexSoyAd1 = (model.getValueAt(tblCards.getSelectedRow(), 3).toString());
        tabloKartSeciliIndexKartNo1 = (model.getValueAt(tblCards.getSelectedRow(), 4).toString());
        tabloKartSeciliIndexLimit1 = Double.valueOf(model.getValueAt(tblCards.getSelectedRow(), 5).toString());
        tabloKartSeciliIndexDurum1 = Boolean.valueOf(model.getValueAt(tblCards.getSelectedRow(), 6).toString());
        AdminCardRed adminCardRed = new AdminCardRed();
        adminCardRed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAllCardOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllCardOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllCardOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllCardOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllCardOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllCard;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaslik;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCards;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
