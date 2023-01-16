package minipbl;
import controller.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.sql.DriverManager;

public class L_Lab extends javax.swing.JFrame {

    public Connection kon;
    public String sql ="";
    public Statement stat;
    public ResultSet rs;
    
    public L_Lab() {
        initComponents();
        tampilkandata();
        setLocationRelativeTo(this);
    }

    public void tampilkandata() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("ID ALAT");
        tabelhead.addColumn("ID RUANGAN");
        tabelhead.addColumn("NAMA ALAT");
        tabelhead.addColumn("JUMLAH");
        try{
            kon = koneksi.getKoneksi();
            String sql = "select * from alat_ruangan"; 
            Statement stat = kon.createStatement(); 
            ResultSet res = stat.executeQuery(sql);
            while (res.next()){
            tabelhead.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            tabeldata.setModel(tabelhead);
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
        btnSP1 = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        PTrans = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRuang = new javax.swing.JTextField();
        txtAlat = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
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

        btnSP1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSP1.setText("Data Ruangan Lab");
        btnSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSP1ActionPerformed(evt);
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
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnPnjm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnSP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistory)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 480));

        PTrans.setBackground(new Color (255,255,255,180));
        PTrans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Data Ruangan Lab");
        PTrans.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        PTrans.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

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
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        PTrans.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 910, 240));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("ID Alat");
        PTrans.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("ID Ruangan");
        PTrans.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setText("Nama Alat");
        PTrans.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel7.setText("Jumlah");
        PTrans.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuangActionPerformed(evt);
            }
        });
        PTrans.add(txtRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 90, -1));

        txtAlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlatActionPerformed(evt);
            }
        });
        PTrans.add(txtAlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        PTrans.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        PTrans.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, -1));

        btnHapus.setBackground(new java.awt.Color(0, 0, 0));
        btnHapus.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        PTrans.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        btnTambah.setBackground(new java.awt.Color(0, 0, 0));
        btnTambah.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Input");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        PTrans.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

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

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        L_SP ad = new L_SP();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSPActionPerformed

    private void btnPnjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPnjmActionPerformed
        L_Pinjam ad = new L_Pinjam();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPnjmActionPerformed

    private void btnLprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLprActionPerformed
        L_Kerusakan ad = new L_Kerusakan();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLprActionPerformed

    private void btnSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSP1ActionPerformed

    private void txtRuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuangActionPerformed

    private void txtAlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlatActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            kon = koneksi.getKoneksi();
            Statement stat = kon.createStatement();
            String sql = "update alat_ruangan SET id_alat = '"+txtId.getText()+"', id_ruangan = '"+txtRuang.getText()+"', nama_alat = '"+txtAlat.getText()+"', jumlah = '"+txtJumlah.getText()+"' WHERE id_alat = '"+txtId.getText()+"'";
            stat.executeUpdate(sql);
            tampilkandata();
            JOptionPane.showMessageDialog(null, "Berhasil Diedit");

        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            kon = koneksi.getKoneksi();
            Statement stat = kon.createStatement(); 
            String sql = "DELETE FROM alat_ruangan WHERE id_alat = '"+txtId.getText()+"'";
            stat.executeUpdate(sql);
            tampilkandata();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        }catch(Exception exc){
            System.err.println(exc.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked

    }//GEN-LAST:event_tabeldataMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try{
        kon = koneksi.getKoneksi();
        sql="insert into alat_ruangan values('"+txtId.getText()+"','"+txtRuang.getText()+"','"+txtAlat.getText()+"','"+txtJumlah.getText()+"')";
        stat=kon.createStatement();
        stat.execute(sql);
        txtId.setText("");
        txtRuang.setText("");
        txtAlat.setText("");
        txtJumlah.setText("");
        txtId.requestFocus();
        javax.swing.JOptionPane.showMessageDialog(null, "Data sudah diinput");
            tampilkandata();
          
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal Diinput");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(L_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L_Lab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel PTrans;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLpr;
    private javax.swing.JButton btnPnjm;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnSP1;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtAlat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtRuang;
    // End of variables declaration//GEN-END:variables
}
