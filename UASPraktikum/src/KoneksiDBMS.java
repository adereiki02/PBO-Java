//library untuk menyambungkan database
import java.sql.*;


public class KoneksiDBMS {
    String driverdbms = "com.mysql.jdbc.Driver";
    String database = "jdbc:mysql://localhost/db_ade06455";
    String user = "adereiki02";
    String password = "";

    public KoneksiDBMS(){
    }

    public Connection BukaCn() throws SQLException 
    {
        Connection condbms = null;
        try{
            Class.forName(driverdbms);
            condbms = DriverManager.getConnection(database,user,password);
            
            return condbms;
        }
        catch (SQLException se){
            System.out.println("Ada kesalahan pada SQL !");
            return null;
        }
        catch (Exception ex){
            System.out.println("Koneksi gagal !");
            return null;
        }
    }
}
