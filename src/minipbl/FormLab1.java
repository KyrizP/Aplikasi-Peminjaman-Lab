package minipbl;
import controller.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class FormLab1 extends javax.swing.JFrame {

    public Connection kon;
    public String sql ="";
    public Statement stat;
    public ResultSet rs;
    
    public FormLab1() {
        initComponents();
        
        setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSts = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        btnPnjm = new javax.swing.JButton();
        btnLpr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PTrans = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboRuangan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnip = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APLIKASI PEMINJAMAN LABORATORIUM");

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(319, 319, 319)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLogout))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnSts.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSts.setText("Status Peminjaman");
        btnSts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStsActionPerformed(evt);
            }
        });

        btnLab.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLab.setText("List Laboratorium");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        btnPnjm.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPnjm.setText("Form Peminjaman");
        btnPnjm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPnjmActionPerformed(evt);
            }
        });

        btnLpr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLpr.setText("Form Laporan Kerusakan");
        btnLpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLprActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4))
            .addComponent(btnPnjm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnPnjm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLpr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSts)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 480));

        PTrans.setBackground(new Color (255,255,255,180));
        PTrans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("List Laboratorium");
        PTrans.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        comboRuangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Nomor Ruangan", "701", "702" }));
        comboRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRuanganActionPerformed(evt);
            }
        });
        PTrans.add(comboRuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, 160, -1));

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        PTrans.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 910, 260));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        PTrans.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("ID Ruangan");
        PTrans.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("NIP Laboran");
        PTrans.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnipActionPerformed(evt);
            }
        });
        PTrans.add(txtnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        jPanel1.add(PTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 970, 470));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg3.jpg"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login ad = new Login();
        JOptionPane.showMessageDialog(null, "Anda Telah Logout");
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnStsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStsActionPerformed
        FormStatus1 ad = new FormStatus1();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStsActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnPnjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPnjmActionPerformed
        FormPinjam1 ad = new FormPinjam1();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPnjmActionPerformed

    private void btnLprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLprActionPerformed
        FormLapor1 ad = new FormLapor1();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLprActionPerformed

    private void comboRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRuanganActionPerformed
        DefaultTableModel tabelhead = new DefaultTableModel();
        switch(comboRuangan.getSelectedIndex()){ 
            case 0:
                break;
            case 1:
                txtid.setText("1");
                txtnip.setText("1187654321");
                tabelhead.addColumn("NO RUANGAN");
                tabelhead.addColumn("ALAT-ALAT");
                tabelhead.addColumn("JUMLAH");
                try{
                    kon = koneksi.getKoneksi();
                    String sql = "select ruangan.no_ruangan, alat_ruangan.nama_alat, alat_ruangan.jumlah from alat_ruangan inner join ruangan on ruangan.id_ruangan=alat_ruangan.id_ruangan where alat_ruangan.id_ruangan = 1"; 
                    Statement stat = kon.createStatement(); 
                    ResultSet res = stat.executeQuery(sql);
                    while (res.next()){
                    tabelhead.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
                    }
                    tabeldata.setModel(tabelhead);
                }catch (Exception e) {}
                break;
            default:
                txtid.setText("2");
                txtnip.setText("1187654321");
                tabelhead.addColumn("NO RUANGAN");
                tabelhead.addColumn("ALAT-ALAT");
                tabelhead.addColumn("JUMLAH");
                try{
                    kon = koneksi.getKoneksi();
                    String sql = "select ruangan.no_ruangan, alat_ruangan.nama_alat, alat_ruangan.jumlah from alat_ruangan inner join ruangan on ruangan.id_ruangan=alat_ruangan.id_ruangan where alat_ruangan.id_ruangan = 2"; 
                    Statement stat = kon.createStatement(); 
                    ResultSet res = stat.executeQuery(sql);
                    while (res.next()){
                    tabelhead.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
                    }
                    tabeldata.setModel(tabelhead);
                }catch (Exception e) {}
                break;
        }
    }//GEN-LAST:event_comboRuanganActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnipActionPerformed

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
            java.util.logging.Logger.getLogger(FormLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel PTrans;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLpr;
    private javax.swing.JButton btnPnjm;
    private javax.swing.JButton btnSts;
    private javax.swing.JComboBox<String> comboRuangan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnip;
    // End of variables declaration//GEN-END:variables
}
