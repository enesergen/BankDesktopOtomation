
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
public class AdminAllOperationOtherWorker extends javax.swing.JFrame  implements TabloDoldur{

    static ArrayList<Worker> allWorkers = new ArrayList<Worker>();
    DefaultTableModel model;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.OTHERWORKER";

    static int tabloCalisanSeciliIndexId = -1;
    static String tabloCalisanSeciliIndexTC = "";
    static String tabloCalisanSeciliIndexAd = "";
    static String tabloCalisanSeciliIndexSoyad = "";
    static String tabloCalisanSeciliIndexGorev = "";
    static double tabloCalisanSeciliIndexMaas = 0;

    static int tabloCalisanSeciliIndexId1 = -1;
    static String tabloCalisanSeciliIndexTC1 = "";
    static String tabloCalisanSeciliIndexAd1 = "";
    static String tabloCalisanSeciliIndexSoyad1 = "";
    static String tabloCalisanSeciliIndexGorev1 = "";
    static double tabloCalisanSeciliIndexMaas1 = 0;

    public AdminAllOperationOtherWorker() {
        initComponents();
        populateTable();
        allWorkers.clear();
    }

    public void populateTable() {
        model = (DefaultTableModel) tblWorkers.getModel();
        allWorkers = getWorkers();
        for (Worker worker : allWorkers) {
            Object[] row = {
                worker.getId(), worker.getTC(), worker.getAd(), worker.getSoyad(), worker.getGorev(), worker.getMaas()
            };
            model.addRow(row);
        }
    }

    public ArrayList<Worker> getWorkers() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                allWorkers.add(new Worker(
                        resultSet.getInt("ID"),
                        resultSet.getString("TC"),
                        resultSet.getString("AD"),
                        resultSet.getString("SOYAD"),
                        resultSet.getString("GOREV"),
                        resultSet.getDouble("MAAS")
                ));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminAllOperationOtherWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allWorkers;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkers = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        brnEditSelectedRow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - DİĞER ÇALIŞAN EKRANI");
        setPreferredSize(new java.awt.Dimension(1500, 800));

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblWorkers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblWorkers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TCNO", "AD", "SOYAD", "GÖREV", "MAAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkers);

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearch.setText("Aranacak İfade    :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setText("YENİ GÖREVLİ EKLEME");
        btnAdd.setMaximumSize(new java.awt.Dimension(150, 30));
        btnAdd.setMinimumSize(new java.awt.Dimension(150, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        brnEditSelectedRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        brnEditSelectedRow.setText("SEÇİLİ SATIR ÇALIŞAN AYRINTILI GÖR / BİLGİ - MAAŞ GÜNCELLE");
        brnEditSelectedRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnEditSelectedRowActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setText("SEÇİLİ SATIR ÇALIŞAN SİL");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
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
        tblWorkers.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

       AdminAddWorker adminAddWorker=new AdminAddWorker();
       adminAddWorker.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void brnEditSelectedRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnEditSelectedRowActionPerformed

        // System.out.println(model.getValueAt(tblOfficers.getSelectedRow(),0));   //yukarda seçili satırdaki seçili column daki değeri okuyor string olarak.
        tabloCalisanSeciliIndexId = Integer.parseInt(model.getValueAt(tblWorkers.getSelectedRow(), 0).toString());
        tabloCalisanSeciliIndexTC = (model.getValueAt(tblWorkers.getSelectedRow(), 1).toString());
        tabloCalisanSeciliIndexAd = (model.getValueAt(tblWorkers.getSelectedRow(), 2).toString());
        tabloCalisanSeciliIndexSoyad = (model.getValueAt(tblWorkers.getSelectedRow(), 3).toString());
        tabloCalisanSeciliIndexGorev = (model.getValueAt(tblWorkers.getSelectedRow(), 4).toString());
        tabloCalisanSeciliIndexMaas = Double.valueOf(model.getValueAt(tblWorkers.getSelectedRow(), 5).toString());
        
        AdminEditWorker adminEditWorker=new AdminEditWorker();
        adminEditWorker.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brnEditSelectedRowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        tabloCalisanSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblWorkers.getSelectedRow(), 0).toString());
        tabloCalisanSeciliIndexTC1 = (model.getValueAt(tblWorkers.getSelectedRow(), 1).toString());
        tabloCalisanSeciliIndexAd1 = (model.getValueAt(tblWorkers.getSelectedRow(), 2).toString());
        tabloCalisanSeciliIndexSoyad1 = (model.getValueAt(tblWorkers.getSelectedRow(), 3).toString());
        tabloCalisanSeciliIndexGorev1 = (model.getValueAt(tblWorkers.getSelectedRow(), 4).toString());
        tabloCalisanSeciliIndexMaas1 = Double.valueOf(model.getValueAt(tblWorkers.getSelectedRow(), 5).toString());
        AdminDeleteWorker adminDeleteWorker=new AdminDeleteWorker();
        adminDeleteWorker.setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminAllOperationOtherWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllOperationOtherWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllOperationOtherWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllOperationOtherWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllOperationOtherWorker().setVisible(true);
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
    private javax.swing.JTable tblWorkers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
