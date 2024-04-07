package ConnectionMetaDataInfo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMetaDataInfo {
    private static final String dbURL = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=Dapper;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
    public static void main(String[] args) {

        Connection conn = null;

        try {

//            String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
//            String user = "sa";
//            String pass = "secret";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
