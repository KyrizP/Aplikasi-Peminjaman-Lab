package minipbl;
import java.sql.Connection;
import javax.swing.JOptionPane;
import controller.koneksi;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class L_Pinjam extends javax.swing.JFrame {

    public Connection kon;
    public String sql ="";
    public Statement stat;
    public ResultSet rs;
    
    public L_Pinjam() {
        initComponents();
        tampilpinjam();
        setLocationRelativeTo(this);
    }

    public void tampilpinjam() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("ID");
        tabelhead.addColumn("NIM");
        tabelhead.addColumn("NAMA");
        tabelhead.addColumn("DOSEN");
        tabelhead.addColumn("RUANGAN");
        tabelhead.addColumn("TANGGAL");
        tabelhead.addColumn("WAKTU PINJAM");
        tabelhead.addColumn("WAKTU BALIK");
        tabelhead.addColumn("ACC DOSEN");
        tabelhead.addColumn("ACC LABORAN");
        try{
            kon = koneksi.getKoneksi();
            String sql = "select peminjam.id_pinjam, mahasiswa.nim, mahasiswa.nama, dosen.nama_dosen, ruangan.no_ruangan, peminjam.tanggal_pinjam, peminjam.waktu_pinjam, peminjam.waktu_balik, peminjam.persetujuan_dosen, peminjam.persetujuan_laboran from peminjam inner join mahasiswa on mahasiswa.id_mahasiswa=peminjam.id_mahasiswa inner join dosen on dosen.id_dosen=peminjam.id_dosen inner join ruangan on ruangan.id_ruangan=peminjam.id_ruangan"; 
            Statement stat = kon.createStatement(); 
            ResultSet res = stat.executeQuery(sql);
            while (res.next()){
            tabelhead.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tabelpinjam.setModel(tabelhead);
        }catch (Exception e) {}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSP = new javax.swing.JButton();
        btnPnjm = new javax.swing.JButton();
        btnLpr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnLab = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        PTrans = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpinjam = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnVerifikasi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboacc = new javax.swing.JComboBox();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

        btnSP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSP.setText("Data Sparepart");
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });

        btnPnjm.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPnjm.setText("Data Peminjaman");
        btnPnjm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPnjmActionPerformed(evt);
            }
        });

        btnLpr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLpr.setText("Data Laporan Kerusakan");
        btnLpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLprActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dashboard");

        btnLab.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLab.setText("Data Ruangan Lab");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        btnHistory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHistory.setText("History Perbaikan");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4))
            .addComponent(btnPnjm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistory)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 480));

        PTrans.setBackground(new Color (255,255,255,180));
        PTrans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelpinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelpinjam);

        PTrans.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 950, 270));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Data Peminjaman Laboratorium");
        PTrans.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 0, -1, -1));

        btnVerifikasi.setBackground(new java.awt.Color(0, 0, 0));
        btnVerifikasi.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnVerifikasi.setForeground(new java.awt.Color(255, 255, 255));
        btnVerifikasi.setText("VERIFIKASI");
        btnVerifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifikasiActionPerformed(evt);
            }
        });
        PTrans.add(btnVerifikasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setText("ACC LABORAN");
        PTrans.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        comboacc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ACCEPT", "REJECT" }));
        PTrans.add(comboacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, -1));
        PTrans.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 60, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("ID");
        PTrans.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        L_SP ad = new L_SP();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSPActionPerformed

    private void btnPnjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPnjmActionPerformed

    }//GEN-LAST:event_btnPnjmActionPerformed

    private void btnLprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLprActionPerformed
        L_Kerusakan ad = new L_Kerusakan();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLprActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login ad = new Login();
        JOptionPane.showMessageDialog(null, "Anda Telah Logout");
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnVerifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifikasiActionPerformed
        try{
            kon = koneksi.getKoneksi();
            Statement stat = kon.createStatement();
            String sql = "UPDATE peminjam SET id_pinjam = '"+txtid.getText()+"', persetujuan_laboran = '"+comboacc.getSelectedItem()+"' WHERE id_pinjam = '"+txtid.getText()+"'";
            stat.executeUpdate(sql);
            tampilpinjam();
            JOptionPane.showMessageDialog(null, "Berhasil Verifikasi");

        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Gagal Verifikasi");
        }
    }//GEN-LAST:event_btnVerifikasiActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        L_Lab ad = new L_Lab();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        L_History ad = new L_History();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(L_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L_Pinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel PTrans;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLpr;
    private javax.swing.JButton btnPnjm;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnVerifikasi;
    private javax.swing.JComboBox comboacc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpinjam;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
