
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
public class AdminAddCustomer extends javax.swing.JFrame implements DoldurField{

   
    DB db = new DB();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    String sql1 = "INSERT INTO ROOT.CUSTOMER (USERNAME,PASSWORD,TCNO,AD,SOYAD,DOGUMTARIH,DOGUMYER,BABAAD,ANNEAD,ANNEKIZLIKSOYAD,TELNO,EMAIL,ADRES,SEHIR,HESAPBAKIYE,KARTBORCU,KREDIBORCU) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public AdminAddCustomer() {
        initComponents();
        
    }

    public void start() {
        try {
            connection = db.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql1);

            while (resultSet.next()) {
                
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
    
    public void insertCustomer(){
        try {
            PreparedStatement statement=null;
            connection=db.getConnection();
            statement=connection.prepareStatement(sql1);
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
            Logger.getLogger(AdminAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        lblDogumTarih = new javax.swing.JLabel();
        lblDogumYer = new javax.swing.JLabel();
        lblBabaAd = new javax.swing.JLabel();
        lblAnneAd = new javax.swing.JLabel();
        lblAnneKızlıkSoyad = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        lblSehir = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtDogumTarih = new javax.swing.JTextField();
        txtSehir = new javax.swing.JTextField();
        txtTC = new javax.swing.JTextField();
        txtDogumYer = new javax.swing.JTextField();
        txtBabaAd = new javax.swing.JTextField();
        txtAnneAd = new javax.swing.JTextField();
        txtAnneKızlıkSoyad = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblKartBorcu = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        txtKartBorcu = new javax.swing.JTextField();
        txtKrediBorcu = new javax.swing.JTextField();
        txtHesapBakiye = new javax.swing.JTextField();
        txtAdres = new java.awt.TextArea();
        btnAddCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - YENİ MÜŞTERİ EKLEME EKRANI");

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUserName.setText("KULLANLICI ADI");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPassword.setText("ŞİFRE");

        lblAd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAd.setText("ADI");

        lblSoyad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSoyad.setText("SOYADI");

        lblDogumTarih.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDogumTarih.setText("DOĞUM TARİHİ");

        lblDogumYer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDogumYer.setText("DOĞUM YERİ");

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

        lblAdres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAdres.setText("EV ADRESİ");

        lblSehir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSehir.setText("YAŞADIĞI ŞEHİR");

        lblTC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTC.setText("TC NO");

        lblKartBorcu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblKartBorcu.setText(" KART BORCU");

        lblBakiye.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBakiye.setText("HESAP BAKİYESİ");

        lblId1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblId1.setText("KREDİ BORCU");

        txtKartBorcu.setText("0.0");

        txtKrediBorcu.setText("0.0");

        txtHesapBakiye.setText("0.0");

        btnAddCustomer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddCustomer.setText("YENİ MÜŞTERİ EKLE");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("GERİ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("KAYIT ESNASINDA PARA YATIRMA KREDİ VEYA KREDİ ÇEKME İŞLEMİ YAPILMADIYSA O ALANLARI DEĞİŞTİRMENİZE GEREK YOKTUR ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDogumTarih))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAnneKızlıkSoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDogumYer)
                            .addComponent(txtBabaAd)
                            .addComponent(txtAnneAd)
                            .addComponent(txtAnneKızlıkSoyad)
                            .addComponent(txtTelNo)
                            .addComponent(txtEmail)
                            .addComponent(txtAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblKartBorcu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lblId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKrediBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHesapBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(184, 184, 184)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDogumYer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHesapBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBabaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKartBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnneAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKrediBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnneKızlıkSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnneKızlıkSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDogumTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        insertCustomer();

        AdminAllCustomerOperation adminAllCustomerOperation=new AdminAllCustomerOperation();
        adminAllCustomerOperation.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminAllCustomerOperation adminAllCustomerOperation=new AdminAllCustomerOperation();
        adminAllCustomerOperation.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblAnneAd;
    private javax.swing.JLabel lblAnneKızlıkSoyad;
    private javax.swing.JLabel lblBabaAd;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblDogumTarih;
    private javax.swing.JLabel lblDogumYer;
    private javax.swing.JLabel lblEmail;
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
