package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url;
                url="jdbc:mysql://localhost:3306/lab";
                String username = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,username,password);
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Error Koneksi");
            }
        }return koneksi;
    }static Object getConnetion(){
        throw new UnsupportedOperationException("NOt Yet");
    }
}
