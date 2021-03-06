/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
      
        initComponents();
       
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogOut = new javax.swing.JButton();
        btnCreditOperation = new javax.swing.JButton();
        btnExpense = new javax.swing.JButton();
        btnCustomerOperation = new javax.swing.JButton();
        btnOtherPerson = new javax.swing.JButton();
        btnOfficerOperation = new javax.swing.JButton();
        brnCardCreditOperation = new javax.swing.JButton();
        btnAdminSetting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBANK - YÖNETİCİ ANA EKRANI");
        setPreferredSize(new java.awt.Dimension(850, 450));

        btnLogOut.setText("OTURUMU KAPAT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnCreditOperation.setText("Banka Tüm Kredi İşlemleri");
        btnCreditOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditOperationActionPerformed(evt);
            }
        });

        btnExpense.setText("Banka Tüm Gider İşelmeri");
        btnExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpenseActionPerformed(evt);
            }
        });

        btnCustomerOperation.setText(" Banka Tüm Müşteri İşlemleri");
        btnCustomerOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerOperationActionPerformed(evt);
            }
        });

        btnOtherPerson.setText("Tüm Banka Harici Personel İşlemleri");
        btnOtherPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherPersonActionPerformed(evt);
            }
        });

        btnOfficerOperation.setText("Banka Tüm Memur İşlemleri");
        btnOfficerOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfficerOperationActionPerformed(evt);
            }
        });

        brnCardCreditOperation.setText("Banka Tüm  Kart İşlemleri");
        brnCardCreditOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCardCreditOperationActionPerformed(evt);
            }
        });

        btnAdminSetting.setText("YÖNETİCİ ŞİFRE DEĞİŞTİRME ");
        btnAdminSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSettingActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdminSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOtherPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 65, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOfficerOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCustomerOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreditOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brnCardCreditOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOfficerOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtherPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreditOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnCardCreditOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnOtherPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherPersonActionPerformed
       AdminAllOperationOtherWorker adminAllOperationOtherWorker=new AdminAllOperationOtherWorker();
       adminAllOperationOtherWorker.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnOtherPersonActionPerformed

    private void btnOfficerOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfficerOperationActionPerformed

        AdminAllOfficerOperations adminAllOfficerOperations = new AdminAllOfficerOperations();
        adminAllOfficerOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOfficerOperationActionPerformed

    private void btnCustomerOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerOperationActionPerformed
        
        AdminAllCustomerOperation adminAllCustomerOperation=new AdminAllCustomerOperation();
        adminAllCustomerOperation.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCustomerOperationActionPerformed

    private void btnExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpenseActionPerformed
       AdminAllExpenseOperation adminAllExpenseOperation=new AdminAllExpenseOperation();
       adminAllExpenseOperation.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnExpenseActionPerformed

    private void btnAdminSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSettingActionPerformed
      AdminChangePassword adminChangePassword=new AdminChangePassword();
      adminChangePassword.setVisible(true);
      
    }//GEN-LAST:event_btnAdminSettingActionPerformed

    private void btnCreditOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditOperationActionPerformed
        AdminAllCreditOperation adminAllCreditOperation=new AdminAllCreditOperation();
        adminAllCreditOperation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreditOperationActionPerformed

    private void brnCardCreditOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCardCreditOperationActionPerformed
       AdminAllCardOperation adminAllCardOperation=new AdminAllCardOperation();
       adminAllCardOperation.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_brnCardCreditOperationActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCardCreditOperation;
    private javax.swing.JButton btnAdminSetting;
    private javax.swing.JButton btnCreditOperation;
    private javax.swing.JButton btnCustomerOperation;
    private javax.swing.JButton btnExpense;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnOfficerOperation;
    private javax.swing.JButton btnOtherPerson;
    // End of variables declaration//GEN-END:variables
}
