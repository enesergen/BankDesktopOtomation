
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class CustomerHomePage extends javax.swing.JFrame {
        static int id=-1;
        static String username="";
        static String password="";
        static String tcNo="";
        static String ad="";
        static String soyad="";
        static String dogumTarih="";
        static String dogumYer="";
        static String babaAd="";
        static String anneAd="";
        static String anneKizlikSoyad="";
        static String telNo="";
        static String eMail="";
        static String adres="";
        static String sehir="";
        static double hesapBakiye=0;
        static double kartBorcu=0;
        static double krediBorcu=0;
        
        DB db=new DB();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet;
     
        
    
    
    
    public CustomerHomePage() {
        initComponents();
        btnMyAccount.setText("HESABIM VE BİLGİLERİM");
        start();
    }

    public void start(){
            try {
                connection=db.getConnection();
                statement=connection.createStatement();
                resultSet=statement.executeQuery("SELECT * FROM ROOT.CUSTOMER WHERE USERNAME='"+CustomerLogin.customerUsername +"'  AND PASSWORD='"+CustomerLogin.customerPassword+"'");
                while(resultSet.next()){
                    id=resultSet.getInt("ID");
                    username=resultSet.getString("USERNAME");
                    password=resultSet.getString("PASSWORD");
                    tcNo=resultSet.getString("TCNO");
                    ad=resultSet.getString("AD");
                    soyad=resultSet.getString("SOYAD");
                    dogumTarih=resultSet.getString("DOGUMTARIH");
                    dogumYer=resultSet.getString("DOGUMYER");
                    babaAd=resultSet.getString("BABAAD");
                    anneAd=resultSet.getString("ANNEAD");
                    anneKizlikSoyad=resultSet.getString("ANNEKIZLIKSOYAD");
                    telNo=resultSet.getString("TELNO");
                    adres=resultSet.getString("ADRES");
                    sehir=resultSet.getString("SEHIR");
                    hesapBakiye=resultSet.getDouble("HESAPBAKIYE");
                    kartBorcu=resultSet.getDouble("KARTBORCU");
                    krediBorcu=resultSet.getDouble("KREDIBORCU");
                    
                    
                }
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(CustomerHomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMyAccount = new javax.swing.JButton();
        btnMyCard = new javax.swing.JButton();
        btnCreateNewAccount4 = new javax.swing.JButton();
        btnAppCard = new javax.swing.JButton();
        btnCreditApp = new javax.swing.JButton();
        btnTransferOperation = new javax.swing.JButton();
        btnOtherPaymentOperation = new javax.swing.JButton();
        brnLogOut = new javax.swing.JButton();
        btnCustomerSetting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - MÜŞTERİ  ANA İŞLEM EKRANI");

        btnMyAccount.setText("HESABIM / HESAPLARIM");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });

        btnMyCard.setText("KARTIM / KARTLARIM");
        btnMyCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCardActionPerformed(evt);
            }
        });

        btnCreateNewAccount4.setText("HESABIM VE BİLGİLER");
        btnCreateNewAccount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAccount4ActionPerformed(evt);
            }
        });

        btnAppCard.setText("KART BAŞVURUSUNDA BULUN");
        btnAppCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppCardActionPerformed(evt);
            }
        });

        btnCreditApp.setText("KREDİ BAŞVURUSUNDA BULUN");
        btnCreditApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditAppActionPerformed(evt);
            }
        });

        btnTransferOperation.setText("TÜM HAVALE / EFT İŞLEMLERİ");
        btnTransferOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferOperationActionPerformed(evt);
            }
        });

        btnOtherPaymentOperation.setText("DİĞER TÜM ÖDEME İŞLEMLERİ");
        btnOtherPaymentOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherPaymentOperationActionPerformed(evt);
            }
        });

        brnLogOut.setText("OTURUMU KAPAT");
        brnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnLogOutActionPerformed(evt);
            }
        });

        btnCustomerSetting.setText("HESAP ŞİFRE DEĞİŞTİRME");
        btnCustomerSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSettingActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCustomerSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTransferOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCreateNewAccount4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAppCard, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 150, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreditApp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOtherPaymentOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateNewAccount4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAppCard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreditApp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtherPaymentOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnLogOutActionPerformed
        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brnLogOutActionPerformed

    private void btnCreateNewAccount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAccount4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateNewAccount4ActionPerformed

    private void btnCustomerSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSettingActionPerformed
       CustomerChangePassword customerChangePassword=new CustomerChangePassword();
       customerChangePassword.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCustomerSettingActionPerformed

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        CustomerMyAccount customerMyAccount=new CustomerMyAccount();
        customerMyAccount.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void btnAppCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppCardActionPerformed
        CustomerCardBasvur customerCardBasvur=new CustomerCardBasvur();
        customerCardBasvur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAppCardActionPerformed

    private void btnMyCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCardActionPerformed
       CustomerMyCard customerMyCard=new CustomerMyCard();
       customerMyCard.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMyCardActionPerformed

    private void btnTransferOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferOperationActionPerformed
        CustomerHavaleEft customerHavaleEft=new CustomerHavaleEft();
        customerHavaleEft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTransferOperationActionPerformed

    private void btnCreditAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditAppActionPerformed
        CustomerCreditBasvuru customerCreditBasvuru=new CustomerCreditBasvuru();
        customerCreditBasvuru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreditAppActionPerformed

    private void btnOtherPaymentOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherPaymentOperationActionPerformed
        CustomerOtherPayment customerOtherPayment=new CustomerOtherPayment();
        customerOtherPayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOtherPaymentOperationActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnLogOut;
    private javax.swing.JButton btnAppCard;
    private javax.swing.JButton btnCreateNewAccount4;
    private javax.swing.JButton btnCreditApp;
    private javax.swing.JButton btnCustomerSetting;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCard;
    private javax.swing.JButton btnOtherPaymentOperation;
    private javax.swing.JButton btnTransferOperation;
    // End of variables declaration//GEN-END:variables
}
