import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            // Create or open database file
            conn = DriverManager.getConnection("jdbc:sqlite:studentdb.db");
            System.out.println("Connected to SQLite database!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
