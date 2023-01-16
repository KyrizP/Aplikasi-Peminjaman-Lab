package controller;
import controller.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lapor {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null; 
    
    private String sql;
    public String id_ruangan;
    public String detail_rusak;
    
    public void report( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql = "INSERT INTO kerusakan(id_ruangan,detail_rusak,foto)VALUE(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, id_ruangan);
        pst.setString(2, detail_rusak);
        pst.setString(3, "");
        pst.execute();
        pst.close();
    }
}

