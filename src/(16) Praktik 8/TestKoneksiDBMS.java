import java.sql.*;

public class TestKoneksiDBMS {
    public static void main(String[] args) {
    	
        try {
            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();

            if (con != null) {
                System.out.println("Koneksi BERHASIL");
            } else {
                System.out.println("Koneksi GAGAL");
            }

            con.close();
        } 
        catch (SQLException e) 
        {
            System.err.println("Kesalahan Perintah SQL :" + e.getMessage());
        }
    }
}
