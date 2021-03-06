
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
public class AdminAllCustomerOperation extends javax.swing.JFrame  implements TabloDoldur{

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
    static String tabloMusteriSeciliIndexAnneKÄ±zlÄ±kSoyad = "";
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
    static String tabloMusteriSeciliIndexAnneKÄ±zlÄ±kSoyad1 = "";
    static String tabloMusteriSeciliIndexTelNO1 = "";
    static String tabloMusteriSeciliIndexEMail1 = "";
    static String tabloMusteriSeciliIndexAdres1= "";
    static String tabloMusteriSeciliIndexSehir1 = "";
    static String tabloMusteriSeciliIndexHesapBakiye1 = "";
    static String tabloMusteriSeciliIndexKartBorcu1 = "";
    static String tabloMusteriSeciliIndexKrediBorcu1 = "";

    public AdminAllCustomerOperation() {
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        btnEditSelectedCustomer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - MÃÅTERÄ° Ä°ÅLEM EKRANI");
        setPreferredSize(new java.awt.Dimension(1500, 750));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("GERÄ°");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USERNAME", "PASSWORD", "AD", "SOYAD", "DOGUM TARIH", "DOGUM YERI", "HESAP BAKIYE", "KART BORCU", "KREDÄ° BORCU"
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
        if (tblCustomers.getColumnModel().getColumnCount() > 0) {
            tblCustomers.getColumnModel().getColumn(0).setResizable(false);
            tblCustomers.getColumnModel().getColumn(1).setResizable(false);
            tblCustomers.getColumnModel().getColumn(2).setResizable(false);
            tblCustomers.getColumnModel().getColumn(3).setResizable(false);
            tblCustomers.getColumnModel().getColumn(4).setResizable(false);
            tblCustomers.getColumnModel().getColumn(5).setResizable(false);
            tblCustomers.getColumnModel().getColumn(6).setResizable(false);
        }

        lblSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSearch.setText("Aranacak Kelime ");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnAddCustomer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddCustomer.setText("YENÄ° MÃÅTERÄ° EKLEME");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnEditSelectedCustomer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEditSelectedCustomer.setText("SEÃÄ°LÄ° MÃÅTERÄ° HESAP BORÃ KREDÄ° VE BÄ°LGÄ°LER GÃRME / DEÄÄ°ÅTÄ°RME");
        btnEditSelectedCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSelectedCustomerActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("SEÃÄ°LÄ° MÃÅTERÄ° SÄ°L");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(btnEditSelectedCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditSelectedCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
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
        tblCustomers.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnEditSelectedCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSelectedCustomerActionPerformed
        tabloMusteriSeciliIndexId = Integer.parseInt(model.getValueAt(tblCustomers.getSelectedRow(), 0).toString());

        AdminEditCustomer adminEditCustomer = new AdminEditCustomer();
        adminEditCustomer.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnEditSelectedCustomerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         tabloMusteriSeciliIndexId1 = Integer.parseInt(model.getValueAt(tblCustomers.getSelectedRow(), 0).toString());
         AdminDeleteCustomer adminDeleteCustomer=new AdminDeleteCustomer();
         adminDeleteCustomer.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
       AdminAddCustomer adminAddCustomer=new AdminAddCustomer();
       adminAddCustomer.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAddCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAllCustomerOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAllCustomerOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAllCustomerOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAllCustomerOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAllCustomerOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditSelectedCustomer;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
