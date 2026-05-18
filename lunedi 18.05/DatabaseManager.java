
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {

    private final String dbDriver;

    private final String dbUrl;

    private final String dbUsername;

    private final String dbPassword;

    private Connection conn;

    public DatabaseManager(String dbDriver, String dbUrl, String dbUsername, String dbPassword) {
        this.dbDriver = dbDriver;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public void connect() {
        try {
            // Register the JDBC driver
            Class.forName(dbDriver);

            // Open the connection
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            if (conn != null) {
                System.out.println("Successfully connected.");
            } else {
                System.out.println("Failed to connect.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql) throws Exception {
        Statement stmt =  this.conn.createStatement();
        return stmt.executeQuery(sql);
    }

}
