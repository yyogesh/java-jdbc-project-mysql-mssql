import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=Dapper;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
//        Import package
//        load and register driver
//        create connection
//        create statement
//        execute statement
//        process the results
//        close
        // **************************
//        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
//        // Or:
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
        }
        catch (Exception ex) {
            System.err.println("Error connecting to the database: " + ex.getMessage());
        }
    }
}
