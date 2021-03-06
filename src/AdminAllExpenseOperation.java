
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
public class AdminAllExpenseOperation extends javax.swing.JFrame  implements TabloDoldur {

    ArrayList<Expense> allExpenses = new ArrayList<Expense>();
    DefaultTableModel model;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql = "SELECT * FROM ROOT.EXPENSE";

    static int tabloGiderSeciliIndexId = -1;
    static String tabloGiderSeciliIndexGiderAd = "";
    static String tabloGiderSeciliIndexAc─▒klama = "";
    static double tabloGiderSeciliIndexTutar = 0;

    static int tabloGiderSeciliIndexId1 = -1;
    static String tabloGiderSeciliIndexGiderAd1 = "";
    static String tabloGiderSeciliIndexAc─▒klama1 = "";
    static double tabloGiderSeciliIndexTutar1 = 0;

    public AdminAllExpenseOperation() {
        initComponents();
        populateTable();
        allExpenses.clear();
    }

    public ArrayList<Expense> getExpenses() {
        DB db = new DB();
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                allExpenses.add(new Expense(
                        resultSet.getInt("ID"),
                        resultSet.getString("GIDERADI"),
                        resultSet.getString("ACIKLAMA"),
                        resultSet.getDouble("TUTAR")
                ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminAllExpenseOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allExpenses;

    }

    public void populateTable() {
        model = (DefaultTableModel) tblExpenses.getModel();
        allExpenses = getExpenses();
        for (Expense expense : allExpenses) {
            Object[] row = {
                expense.getId(), expense.getGiderAdi(), expense.getAc─▒klama(), expense.getTutar()
            };
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpenses = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        brnEditSelectedRow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - HAR─░C─░ HARCAMA G─░DER ─░┼×LEMLER─░");

        tblExpenses.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblExpenses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "GIDER ADI", "A├çIKLAMA", "TUTAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExpenses);

        btnBack.setText("Geri");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSearch.setText("Aranacak ─░fade    :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setText("YEN─░ G─░DER EKLEME");
        btnAdd.setMaximumSize(new java.awt.Dimension(150, 30));
        btnAdd.setMinimumSize(new java.awt.Dimension(150, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setText("SE├ç─░L─░ SATIR G─░DER S─░L");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        brnEditSelectedRow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        brnEditSelectedRow.setText("SE├ç─░L─░ SATIR G─░DER AYRINTILI G├ľR / B─░LG─░ G├ťNCELLE");
        brnEditSelectedRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnEditSelectedRowActionPerformed(evt);
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
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brnEditSelectedRow, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
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
        tblExpenses.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AdminAddExpense adminAddExpense = new AdminAddExpense();
        adminAddExpense.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        tabloGiderSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblExpenses.getSelectedRow(), 0).toString());
        tabloGiderSeciliIndexGiderAd1 = (model.getValueAt(tblExpenses.getSelectedRow(), 1).toString());
        tabloGiderSeciliIndexAc─▒klama1 = (model.getValueAt(tblExpenses.getSelectedRow(), 2).toString());
        tabloGiderSeciliIndexTutar1 = Double.valueOf(model.getValueAt(tblExpenses.getSelectedRow(), 3).toString());
        AdminDeleteExpense adminDeleteExpense = new AdminDeleteExpense();
        adminDeleteExpense.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void brnEditSelectedRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnEditSelectedRowActionPerformed

        // System.out.println(model.getValueAt(tblOfficers.getSelectedRow(),0));   //yukarda se├žili sat─▒rdaki se├žili column daki de─čeri okuyor string olarak.
        tabloGiderSeciliIndexId = Integer.parseInt(model.getValueAt(tblExpenses.getSelectedRow(), 0).toString());
        tabloGiderSeciliIndexGiderAd = (model.getValueAt(tblExpenses.getSelectedRow(), 1).toString());
        tabloGiderSeciliIndexAc─▒klama = (model.getValueAt(tblExpenses.getSelectedRow(), 2).toString());
        tabloGiderSeciliIndexTutar = Double.valueOf(model.getValueAt(tblExpenses.getSelectedRow(), 3).toString());
        AdminEditExpense adminEditExpense = new AdminEditExpense();
        adminEditExpense.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brnEditSelectedRowActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAllExpenseOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllExpenseOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllExpenseOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllExpenseOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllExpenseOperation().setVisible(true);
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
    private javax.swing.JTable tblExpenses;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
