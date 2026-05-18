
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/world", "root", "root");
        dbManager.connect();

        try {
            ResultSet rs = dbManager.executeQuery("select * from world.city limit 10");
            
            System.out.printf("%-6s %-20s %-15s %-20s%n", "ID", "NAME", "COUNTRY CODE", "DISTRICT");
            System.out.println("---------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-6s %-20s %-15s %-20s%n", 
                    rs.getString(1), // ID
                    rs.getString(2), // Name
                    rs.getString(3), // CountryCode
                    rs.getString(4)  // District
                );
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
