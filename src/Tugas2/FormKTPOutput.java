package Tugas2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NBC
 */
public class FormKTPOutput extends javax.swing.JFrame {

    /**
     * Creates new form FormKTPOutput
     */
    public FormKTPOutput() {
        initComponents();
    }
     public FormKTPOutput(String Agama,String Gol, String Status,String jk,String Warga,String Nama,String Tempat,String Tanggal,String Alamat,String RT,String RW,String Kelurahan,String Kecamatan,String Kota, String Kerja) {
        initComponents();
        JNama.setText(Nama);
        JAlamat.setText(Alamat);
       JKelurahan.setText(Kelurahan);
       JKerja.setText(Kerja);
       JJK.setText(jk);
       JKecamatan.setText(Kecamatan);
       JKota.setText(Kota);
       JRT.setText(RT);
       JRW.setText(RW);
       JTanggal.setText(Tanggal);
       JTempat.setText(Tempat);
      
       
       JJK.setText(""+jk);
       JWarga.setText(""+Warga);
       JAgama.setText(""+Agama);
       JStatus.setText(""+Status);
       JGol.setText(""+Gol);
     }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        Output = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JNama = new javax.swing.JLabel();
        JTempat = new javax.swing.JLabel();
        JSlash = new javax.swing.JLabel();
        JTanggal = new javax.swing.JLabel();
        JGol = new javax.swing.JLabel();
        JAlamat = new javax.swing.JLabel();
        JJK = new javax.swing.JLabel();
        JRT = new javax.swing.JLabel();
        JKecamatan = new javax.swing.JLabel();
        JKelurahan = new javax.swing.JLabel();
        JKota = new javax.swing.JLabel();
        JAgama = new javax.swing.JLabel();
        JStatus = new javax.swing.JLabel();
        JKerja = new javax.swing.JLabel();
        JWarga = new javax.swing.JLabel();
        JSlashRT = new javax.swing.JLabel();
        JRW = new javax.swing.JLabel();
        JBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Output.setBackground(new java.awt.Color(0, 153, 153));
        Output.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kartu Tanda Penduduk (KTP)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tempat/Tanggal Lahir");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Golongan Darah");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("RT/RW");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Kel/Desa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kecamatan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kota");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Agama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Status");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pekerjaan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kewarganegaaraan");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Alamat");

        JNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JNama.setText("jLabel5");

        JTempat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTempat.setText("jLabel5");

        JSlash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JSlash.setText("/");

        JTanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTanggal.setText("jLabel5");

        JGol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JGol.setText("jLabel5");

        JAlamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JAlamat.setText("jLabel5");

        JJK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JJK.setText("jLabel5");

        JRT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JRT.setText("jLabel5");

        JKecamatan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JKecamatan.setText("jLabel5");

        JKelurahan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JKelurahan.setText("jLabel5");

        JKota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JKota.setText("jLabel5");

        JAgama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JAgama.setText("jLabel5");

        JStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JStatus.setText("jLabel5");

        JKerja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JKerja.setText("jLabel5");

        JWarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JWarga.setText("jLabel5");

        JSlashRT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JSlashRT.setText("/");

        JRW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JRW.setText("jLabel5");

        JBExit.setBackground(new java.awt.Color(255, 255, 255));
        JBExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBExit.setText("EXIT");
        JBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OutputLayout = new javax.swing.GroupLayout(Output);
        Output.setLayout(OutputLayout);
        OutputLayout.setHorizontalGroup(
            OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputLayout.createSequentialGroup()
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15)))
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(61, 61, 61)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JAgama)
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addComponent(JRT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSlashRT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRW))
                    .addComponent(JAlamat)
                    .addComponent(JGol)
                    .addComponent(JNama)
                    .addGroup(OutputLayout.createSequentialGroup()
                        .addComponent(JTempat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSlash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTanggal))
                    .addComponent(JJK)
                    .addComponent(JKecamatan)
                    .addComponent(JKota)
                    .addComponent(JStatus)
                    .addComponent(JKerja)
                    .addComponent(JWarga)
                    .addComponent(JKelurahan))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        OutputLayout.setVerticalGroup(
            OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutputLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JNama))
                .addGap(18, 18, 18)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTempat)
                    .addComponent(JSlash)
                    .addComponent(JTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JJK))
                .addGap(26, 26, 26)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JGol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(JAlamat))
                .addGap(40, 40, 40)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JRT)
                    .addComponent(JSlashRT)
                    .addComponent(JRW))
                .addGap(18, 18, 18)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JKelurahan))
                .addGap(18, 18, 18)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JKecamatan))
                .addGap(23, 23, 23)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JKota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JAgama))
                .addGap(18, 18, 18)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JStatus))
                .addGap(25, 25, 25)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JKerja))
                .addGap(27, 27, 27)
                .addGroup(OutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JWarga))
                .addGap(28, 28, 28)
                .addComponent(JBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBExitActionPerformed

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
            java.util.logging.Logger.getLogger(FormKTPOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKTPOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKTPOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKTPOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKTPOutput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JAgama;
    private javax.swing.JLabel JAlamat;
    private javax.swing.JButton JBExit;
    private javax.swing.JLabel JGol;
    private javax.swing.JLabel JJK;
    private javax.swing.JLabel JKecamatan;
    private javax.swing.JLabel JKelurahan;
    private javax.swing.JLabel JKerja;
    private javax.swing.JLabel JKota;
    private javax.swing.JLabel JNama;
    private javax.swing.JLabel JRT;
    private javax.swing.JLabel JRW;
    private javax.swing.JLabel JSlash;
    private javax.swing.JLabel JSlashRT;
    private javax.swing.JLabel JStatus;
    private javax.swing.JLabel JTanggal;
    private javax.swing.JLabel JTempat;
    private javax.swing.JLabel JWarga;
    private javax.swing.JPanel Output;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
