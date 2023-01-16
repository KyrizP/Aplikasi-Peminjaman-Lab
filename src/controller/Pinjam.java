package controller;
import controller.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pinjam {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null; 
    
    private String sql;
    public String id_ruangan;
    public String id_dosen;
    public String id_mahasiswa;
    public String tanggal_pinjam;
    public String waktu_pinjam;
    public String waktu_balik;
    
    public void save( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql = "INSERT INTO peminjam(id_ruangan,id_dosen,id_mahasiswa,tanggal_pinjam,waktu_pinjam,waktu_balik,persetujuan_dosen,persetujuan_laboran,status_ruangan)VALUE(?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, id_ruangan);
        pst.setString(2, id_dosen);
        pst.setString(3, id_mahasiswa);
        pst.setString(4, tanggal_pinjam);
        pst.setString(5, waktu_pinjam);
        pst.setString(6, waktu_balik);
        pst.setString(7, "");
        pst.setString(8, "");
        pst.setString(9, "");
        pst.execute();
        pst.close();
    }
    
}
