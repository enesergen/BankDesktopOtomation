
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class OfficerEditCustomerSure extends javax.swing.JFrame implements DoldurField {
String indexNo = String.valueOf(OfficerEditCustomer.tabloMusteriSeciliIndexId);
    ArrayList<Customer> customer = new ArrayList<Customer>();
    DB db = new DB();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql1 = "SELECT * FROM ROOT.CUSTOMER WHERE ID=" + indexNo;
    
    public OfficerEditCustomerSure() {
        initComponents();
        start();
    }

     public void start() {
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql1);

            while (resultSet.next()) {
                txtId.setText(String.valueOf(resultSet.getInt("ID")));
                txtUserName.setText(resultSet.getString("USERNAME"));
                txtPassword.setText(resultSet.getString("PASSWORD"));
                txtTC.setText(resultSet.getString("TCNO"));
                txtAd.setText(resultSet.getString("AD"));
                txtSoyad.setText(resultSet.getString("SOYAD"));
                txtDogumTarih.setText(resultSet.getString("DOGUMTARIH"));
                txtDogumYer.setText(resultSet.getString("DOGUMYER"));
                txtBabaAd.setText(resultSet.getString("BABAAD"));
                txtAnneAd.setText(resultSet.getString("ANNEAD"));
                txtAnneKızlıkSoyad.setText(resultSet.getString("ANNEKIZLIKSOYAD"));
                txtTelNo.setText(resultSet.getString("TELNO"));
                txtEmail.setText(resultSet.getString("EMAIL"));
                txtAdres.setText(resultSet.getString("ADRES"));
                txtSehir.setText(resultSet.getString("SEHIR"));
                txtHesapBakiye.setText(String.valueOf(resultSet.getDouble("HESAPBAKIYE")));
                txtKartBorcu.setText(String.valueOf(resultSet.getDouble("KARTBORCU")));
                txtKrediBorcu.setText(String.valueOf(resultSet.getDouble("KREDIBORCU")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminEditCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        lblDogumTarih = new javax.swing.JLabel();
        lblDogumYer = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAd = new javax.swing.JTextField();
        txtTC = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtDogumTarih = new javax.swing.JTextField();
        txtDogumYer = new javax.swing.JTextField();
        lblBabaAd = new javax.swing.JLabel();
        lblAnneAd = new javax.swing.JLabel();
        lblAnneKızlıkSoyad = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSehir = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        txtBabaAd = new javax.swing.JTextField();
        txtAnneAd = new javax.swing.JTextField();
        txtAnneKızlıkSoyad = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSehir = new javax.swing.JTextField();
        txtAdres = new java.awt.TextArea();
        lblBakiye = new javax.swing.JLabel();
        lblKartBorcu = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        txtHesapBakiye = new javax.swing.JTextField();
        txtKartBorcu = new javax.swing.JTextField();
        txtKrediBorcu = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSaveAndClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - MÜŞTERİ BİLGİ GÜNCELLEME İŞLEM EKRANI");
        setPreferredSize(new java.awt.Dimension(1800, 700));

        lblId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblId.setText("ID");

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUserName.setText("KULLANLICI ADI");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPassword.setText("ŞİFRE");

        lblAd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAd.setText("ADI");

        lblSoyad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSoyad.setText("SOYADI");

        lblTC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTC.setText("TC NO");

        lblDogumTarih.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDogumTarih.setText("DOĞUM TARİHİ");

        lblDogumYer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDogumYer.setText("DOĞUM YERİ");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblBabaAd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBabaAd.setText("BABA ADI");

        lblAnneAd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAnneAd.setText("ANNE ADI");

        lblAnneKızlıkSoyad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAnneKızlıkSoyad.setText("ANNE KIZLIK SOYADI");

        lblTelNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTelNo.setText("TELEFON NUMARASI");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEmail.setText("E-MAIL ADRESİ");

        lblSehir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSehir.setText("YAŞADIĞI ŞEHİR");

        lblAdres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAdres.setText("EV ADRESİ");

        lblBakiye.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBakiye.setText("HESAP BAKİYESİ");

        lblKartBorcu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblKartBorcu.setText(" KART BORCU");

        lblId1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblId1.setText("KREDİ BORCU");

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("GERİ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSaveAndClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSaveAndClose.setText("BİLGİLERİ KAYDET VE GERİ DÖN");
        btnSaveAndClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAndCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoyad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDogumYer)
                            .addComponent(txtDogumTarih))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelNo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnneAd, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(txtBabaAd)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnneKızlıkSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnneKızlıkSoyad)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(lblKartBorcu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHesapBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKrediBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSehir)
                            .addComponent(txtAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnSaveAndClose))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHesapBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnneKızlıkSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnneKızlıkSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKrediBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSaveAndClose, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        OfficerEditCustomer officerEditCustomer=new OfficerEditCustomer();
        officerEditCustomer.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveAndCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAndCloseActionPerformed
        DB db = new DB();
        PreparedStatement statement = null;

        try {
            connection = db.getConnection();
            statement = connection.prepareStatement(
                "UPDATE ROOT.CUSTOMER SET USERNAME=?,PASSWORD=?,TCNO=?,AD=?,SOYAD=?,DOGUMTARIH=?,DOGUMYER=?,BABAAD=?,ANNEAD=?,ANNEKIZLIKSOYAD=?,TELNO=?,EMAIL=?,ADRES=?,SEHIR=?,HESAPBAKIYE=?,KARTBORCU=?,KREDIBORCU=? WHERE ID=" + indexNo);

            statement.setString(1, txtUserName.getText());
            statement.setString(2, txtPassword.getText());
            statement.setString(3, txtTC.getText());
            statement.setString(4, txtAd.getText());
            statement.setString(5, txtSoyad.getText());
            statement.setString(6, txtDogumTarih.getText());
            statement.setString(7, txtDogumYer.getText());
            statement.setString(8, txtBabaAd.getText());
            statement.setString(9, txtAnneAd.getText());
            statement.setString(10, txtAnneKızlıkSoyad.getText());
            statement.setString(11, txtTelNo.getText());
            statement.setString(12, txtEmail.getText());
            statement.setString(13, txtAdres.getText());
            statement.setString(14, txtSehir.getText());
            statement.setDouble(15, Double.valueOf(txtHesapBakiye.getText()));
            statement.setDouble(16, Double.valueOf(txtKartBorcu.getText()));
            statement.setDouble(17, Double.valueOf(txtKrediBorcu.getText()));

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AdminEditCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        OfficerEditCustomer officerEditCustomer=new OfficerEditCustomer();
        officerEditCustomer.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSaveAndCloseActionPerformed

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
            java.util.logging.Logger.getLogger(OfficerEditCustomerSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerEditCustomerSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerEditCustomerSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerEditCustomerSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerEditCustomerSure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveAndClose;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblAnneAd;
    private javax.swing.JLabel lblAnneKızlıkSoyad;
    private javax.swing.JLabel lblBabaAd;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblDogumTarih;
    private javax.swing.JLabel lblDogumYer;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblKartBorcu;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSehir;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtAd;
    private java.awt.TextArea txtAdres;
    private javax.swing.JTextField txtAnneAd;
    private javax.swing.JTextField txtAnneKızlıkSoyad;
    private javax.swing.JTextField txtBabaAd;
    private javax.swing.JTextField txtDogumTarih;
    private javax.swing.JTextField txtDogumYer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHesapBakiye;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKartBorcu;
    private javax.swing.JTextField txtKrediBorcu;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSehir;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
