/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui1;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        tfsoto.setEditable(false);
        tfrawon.setEditable(false);
        tfbakso.setEditable(false);
        tfgudeg.setEditable(false);
        tftotal.setEditable(false);
        JOptionPane.showMessageDialog(rootPane, "Selamat Datang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbsoto = new javax.swing.JCheckBox();
        cbrawon = new javax.swing.JCheckBox();
        cbbakso = new javax.swing.JCheckBox();
        cbgudeg = new javax.swing.JCheckBox();
        lbljudul = new javax.swing.JLabel();
        tfsoto = new javax.swing.JTextField();
        tfrawon = new javax.swing.JTextField();
        tfbakso = new javax.swing.JTextField();
        tfgudeg = new javax.swing.JTextField();
        lblhitung = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        bthitung = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        tfbayar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfkembalian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbsoto.setText("Soto : 5000");
        cbsoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsotoActionPerformed(evt);
            }
        });

        cbrawon.setText("Rawon : 6000");
        cbrawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrawonActionPerformed(evt);
            }
        });

        cbbakso.setText("Bakso : 4000");
        cbbakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbaksoActionPerformed(evt);
            }
        });

        cbgudeg.setText("Gudeg : 8000");
        cbgudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgudegActionPerformed(evt);
            }
        });

        lbljudul.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbljudul.setText("Menu Makanan");

        tfsoto.setText("0");

        tfrawon.setText("0");

        tfbakso.setText("0");

        lblhitung.setText("Hitung :");

        bthitung.setText("Hitung");
        bthitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthitungActionPerformed(evt);
            }
        });

        btclear.setText("Clear");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        jLabel1.setText("Bayar :");

        jLabel2.setText("Kembalian :");

        jButton1.setText("Bayar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lbljudul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbsoto)
                                    .addComponent(cbbakso)
                                    .addComponent(cbrawon)
                                    .addComponent(cbgudeg))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblhitung)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfkembalian)
                            .addComponent(tfbayar)
                            .addComponent(tfrawon)
                            .addComponent(tfbakso)
                            .addComponent(tfgudeg)
                            .addComponent(tfsoto)
                            .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bthitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbljudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsoto)
                    .addComponent(tfsoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbrawon)
                    .addComponent(tfrawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbakso)
                    .addComponent(tfbakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbgudeg)
                    .addComponent(tfgudeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthitung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhitung)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbsotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsotoActionPerformed
        // TODO add your handling code here:
        if (cbsoto.isSelected() == true) {
            tfsoto.setEditable(true);
        } else {
            tfsoto.setEditable(false);
            tfsoto.setText("");
        }
    }//GEN-LAST:event_cbsotoActionPerformed

    private void cbrawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrawonActionPerformed
        // TODO add your handling code here:
        if (cbrawon.isSelected() == true) {
            tfrawon.setEditable(true);
        } else {
            tfrawon.setEditable(false);
            tfrawon.setText("");
        }
     
    }//GEN-LAST:event_cbrawonActionPerformed

    private void cbbaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbaksoActionPerformed
        // TODO add your handling code here:
        if (cbbakso.isSelected() == true) {
            tfbakso.setEditable(true);
        } else {
            tfbakso.setEditable(false);
            tfbakso.setText("");
        }
     
    }//GEN-LAST:event_cbbaksoActionPerformed

    private void cbgudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgudegActionPerformed
        // TODO add your handling code here:
        if (cbgudeg.isSelected() == true) {
            tfgudeg.setEditable(true);
        } else {
            tfgudeg.setEditable(false);
            tfgudeg.setText("");
        }
    
    }//GEN-LAST:event_cbgudegActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // TODO add your handling code here:
        cbsoto.setSelected(false);
        cbrawon.setSelected(false);
        cbbakso.setSelected(false);
        cbgudeg.setSelected(false);
        tftotal.setText("0");
        tfbakso.setText("0");
        tfrawon.setText("0");
        tfsoto.setText("0");
        tfgudeg.setText("0");
    }//GEN-LAST:event_btclearActionPerformed

    private void bthitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthitungActionPerformed
        // TODO add your handling code here
        int hitung,soto,bakso,rawon,gudeg;
        soto = 5000;
        rawon = 6000;
        bakso = 4000;
        gudeg = 8000;
        hitung = Integer.parseInt(tfbakso.getText())*bakso +
                 Integer.parseInt(tfsoto.getText())*soto +
                 Integer.parseInt(tfrawon.getText())*rawon +
                 Integer.parseInt(tfgudeg.getText())*gudeg;
        tftotal.setText(String.valueOf(hitung));
    }//GEN-LAST:event_bthitungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int bayar;
        bayar = Integer.parseInt(tfbayar.getText())-
                Integer.parseInt(tftotal.getText());
        tfkembalian.setText(String.valueOf(bayar));
        if (bayar<0){
            JOptionPane.showMessageDialog(rootPane, "Uang Anda Kurang");
        } 
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclear;
    private javax.swing.JButton bthitung;
    private javax.swing.JCheckBox cbbakso;
    private javax.swing.JCheckBox cbgudeg;
    private javax.swing.JCheckBox cbrawon;
    private javax.swing.JCheckBox cbsoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblhitung;
    private javax.swing.JLabel lbljudul;
    private javax.swing.JTextField tfbakso;
    private javax.swing.JTextField tfbayar;
    private javax.swing.JTextField tfgudeg;
    private javax.swing.JTextField tfkembalian;
    private javax.swing.JTextField tfrawon;
    private javax.swing.JTextField tfsoto;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
