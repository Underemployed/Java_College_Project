/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.management.system;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

/**
 *
 * @author nithi
 */
public class Transaction extends javax.swing.JFrame {

    /**
     * Creates new form Transaction

     */
    private String AccountNo;
    public Transaction(String AccountNo) {
        initComponents();
        this.AccountNo= AccountNo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bdeposit = new javax.swing.JButton();
        btransactionHistory = new javax.swing.JButton();
        bchangepin = new javax.swing.JButton();
        bwithdraw = new javax.swing.JButton();
        bbalancecheck = new javax.swing.JButton();
        bcancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(673, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLEASE SELECT YOUR TRANSACTION");

        bdeposit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bdeposit.setText("Deposit");
        bdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdepositActionPerformed(evt);
            }
        });

        btransactionHistory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btransactionHistory.setText("Transaction History");
        btransactionHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btransactionHistoryActionPerformed(evt);
            }
        });

        bchangepin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bchangepin.setText("Change PIN");
        bchangepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bchangepinActionPerformed(evt);
            }
        });

        bwithdraw.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bwithdraw.setText("Withdraw");
        bwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwithdrawActionPerformed(evt);
            }
        });

        bbalancecheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bbalancecheck.setText("Balance Check");
        bbalancecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbalancecheckActionPerformed(evt);
            }
        });

        bcancel.setBackground(new java.awt.Color(255, 0, 51));
        bcancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bcancel.setForeground(new java.awt.Color(255, 255, 255));
        bcancel.setText("Cancel");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(bwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btransactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bbalancecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(bchangepin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(bdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(bwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btransactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbalancecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bchangepin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(bdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_bcancelActionPerformed

    private void bbalancecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbalancecheckActionPerformed
        // TODO add your handling code here:
                try {
            Conn conn = new Conn();
            String query = "SELECT Balance FROM Accounts WHERE AccountNumber ="+AccountNo +";";
            ResultSet result = conn.s.executeQuery(query);

            if(result.next()) {
                JOptionPane.showMessageDialog(null, "<html><span style='font-size: 20px; font-weight: bold; font-family: Arial;'>Balance: " + result.getString("Balance") + "</span></html>", "Balance Check", JOptionPane.INFORMATION_MESSAGE);

            }else{
                JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN.", "Error", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
                new LoginForm().setVisible(true);
            }
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_bbalancecheckActionPerformed

    private void bdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdepositActionPerformed
        // TODO add your handling code here:
        new DepositForm(AccountNo).setVisible(true);
    }//GEN-LAST:event_bdepositActionPerformed

    private void bwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwithdrawActionPerformed
        // TODO add your handling code here:
        new WithdrawForm(AccountNo).setVisible(true);
    }//GEN-LAST:event_bwithdrawActionPerformed

    private void btransactionHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btransactionHistoryActionPerformed
        // TODO add your handling code here:
        new TransactionHistory(AccountNo).setVisible(true);
    }//GEN-LAST:event_btransactionHistoryActionPerformed

    private void bchangepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bchangepinActionPerformed
        // TODO add your handling code here:
        new ChangePin(AccountNo).setVisible(true);

    }//GEN-LAST:event_bchangepinActionPerformed

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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbalancecheck;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bchangepin;
    private javax.swing.JButton bdeposit;
    private javax.swing.JButton btransactionHistory;
    private javax.swing.JButton bwithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
