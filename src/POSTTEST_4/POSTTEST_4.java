package POSTTEST_4;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NBC
 */
public class POSTTEST_4 extends javax.swing.JFrame {

    /**
     * Creates new form POSTTEST_4
     */
    public POSTTEST_4() {
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

        Jeja = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFTelp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFbb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Sliderdis = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        RBReguler = new javax.swing.JRadioButton();
        RBExpress = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        TFHarga = new javax.swing.JTextField();
        labeldis = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BProses = new javax.swing.JButton();
        BUlangi = new javax.swing.JButton();
        BKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("FORM PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("No. Telepon :");

        TFNama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFNamaCaretUpdate(evt);
            }
        });
        TFNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFNamaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Nama :");

        TFTelp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFTelpCaretUpdate(evt);
            }
        });
        TFTelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFTelpMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Berat Barang :");

        TFbb.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFbbCaretUpdate(evt);
            }
        });
        TFbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFbbMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Kg");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TFNama)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(TFTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TFbb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Atur Diskon");

        Sliderdis.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderdisStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Jenis Jasa");

        Jeja.add(RBReguler);
        RBReguler.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        RBReguler.setText("Reguler");
        RBReguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRegulerActionPerformed(evt);
            }
        });

        RBExpress.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        RBExpress.setText("Express");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Total Harga");

        labeldis.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        labeldis.setText("50%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Sliderdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(RBReguler)
                                .addGap(18, 18, 18)
                                .addComponent(RBExpress)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labeldis))
                    .addComponent(TFHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sliderdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldis))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBReguler)
                    .addComponent(RBExpress))
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        BProses.setBackground(new java.awt.Color(255, 255, 255));
        BProses.setText("PROSES");
        BProses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BProsesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BProsesMouseExited(evt);
            }
        });
        BProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProsesActionPerformed(evt);
            }
        });

        BUlangi.setBackground(new java.awt.Color(255, 255, 255));
        BUlangi.setText("RESET");
        BUlangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUlangiActionPerformed(evt);
            }
        });

        BKeluar.setBackground(new java.awt.Color(255, 255, 255));
        BKeluar.setText("EXIT");
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BProses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUlangi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BKeluar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BProses)
                    .addComponent(BUlangi)
                    .addComponent(BKeluar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String jenisjasa;
    Float Diskon,Total,Harga;
    private void RBRegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRegulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBRegulerActionPerformed

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BKeluarActionPerformed

    private void SliderdisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderdisStateChanged
        // TODO add your handling code here:
        labeldis.setText(String.valueOf(Sliderdis.getValue())+"%");
    }//GEN-LAST:event_SliderdisStateChanged

    private void TFNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNamaMouseClicked
        // TODO add your handling code here:
        TFNama.setText("");
    }//GEN-LAST:event_TFNamaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TFNama.setText("");
        TFTelp.setText("");
        TFbb.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void TFTelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFTelpMouseClicked
        // TODO add your handling code here:
        TFTelp.setText("");
    }//GEN-LAST:event_TFTelpMouseClicked

    private void TFbbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFbbMouseClicked
        // TODO add your handling code here:
        TFbb.setText("");
    }//GEN-LAST:event_TFbbMouseClicked

    private void BProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProsesActionPerformed
        // TODO add your handling code here:
        if(RBReguler.isSelected()){
            Diskon = Float.valueOf(Sliderdis.getValue());
            Total = 11500*(Float.valueOf(TFbb.getText()))-((Diskon/100)*11500);
            Harga = Total;
        }
        else if(RBExpress.isSelected()){
            Diskon = Float.valueOf(Sliderdis.getValue());
            Total = 11500*(Float.valueOf(TFbb.getText()))-((Diskon/100)*11500);
            Harga = 1.5f*Total;
        }
            TFHarga.setText("Rp "+""+Harga);
    }//GEN-LAST:event_BProsesActionPerformed

    private void TFNamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFNamaCaretUpdate
        // TODO add your handling code here:
        if(TFNama.getText().length() !=0 && TFTelp.getText().length() !=0 && TFbb.getText().length() !=0){
            BProses.setEnabled(true);
        }
        else{
            BProses.setEnabled(false);
        }
    }//GEN-LAST:event_TFNamaCaretUpdate

    private void TFTelpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFTelpCaretUpdate
        // TODO add your handling code here:
        if(TFNama.getText().length() !=0 && TFTelp.getText().length() !=0 && TFbb.getText().length() !=0){
            BProses.setEnabled(true);
        }
        else{
            BProses.setEnabled(false);
        }
    }//GEN-LAST:event_TFTelpCaretUpdate

    private void TFbbCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFbbCaretUpdate
        // TODO add your handling code here:
        if(TFNama.getText().length() !=0 && TFTelp.getText().length() !=0 && !TFbb.getText().matches("[0]")){
            BProses.setEnabled(true);
        }
        else{
            BProses.setEnabled(false);
        }
    }//GEN-LAST:event_TFbbCaretUpdate

    private void BUlangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUlangiActionPerformed
        // TODO add your handling code here:
        TFNama.setText("");
        TFTelp.setText("");
        TFbb.setText("");
        Jeja.clearSelection();
        TFHarga.setText("");
    }//GEN-LAST:event_BUlangiActionPerformed

    private void BProsesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BProsesMouseEntered
        // TODO add your handling code here:
        BProses.setBackground(Color.black);
        BProses.setForeground(Color.red);
        BUlangi.setBackground(Color.black);
        BUlangi.setForeground(Color.red);
        BKeluar.setBackground(Color.black);
        BKeluar.setForeground(Color.red);
    }//GEN-LAST:event_BProsesMouseEntered

    private void BProsesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BProsesMouseExited
        // TODO add your handling code here:
        BProses.setBackground(Color.white);
        BProses.setForeground(Color.black); 
        BUlangi.setBackground(Color.white);
        BUlangi.setForeground(Color.black); 
        BKeluar.setBackground(Color.white);
        BKeluar.setForeground(Color.black); 
    }//GEN-LAST:event_BProsesMouseExited

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
            java.util.logging.Logger.getLogger(POSTTEST_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSTTEST_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSTTEST_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSTTEST_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSTTEST_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BProses;
    private javax.swing.JButton BUlangi;
    private javax.swing.ButtonGroup Jeja;
    private javax.swing.JRadioButton RBExpress;
    private javax.swing.JRadioButton RBReguler;
    private javax.swing.JSlider Sliderdis;
    private javax.swing.JTextField TFHarga;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFTelp;
    private javax.swing.JTextField TFbb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labeldis;
    // End of variables declaration//GEN-END:variables
}
