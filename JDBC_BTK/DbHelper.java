import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String name = "root";
    private String password = "1234";
    private String dbUrl = "jdbc:mariadb://localhost:3306/world_db";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, name, password);
    }
    public void errorMessage(SQLException e){
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error Code: " + e.getErrorCode());
    }
    
}
