package App;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    
    public static Connection MySQl(){
    
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("root");        
            ds.setPassword("");
            ds.setServerName("localhost");
            ds.setDatabaseName("banyan_tobacco");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            System.out.println("database connected!");
            return c;
            
        } catch (SQLException e) {
            
            System.err.println("database tidak ada " + e.getMessage());
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        
        
        try {
            Connection conn = Koneksi.MySQl();
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            
        }
    }
}
