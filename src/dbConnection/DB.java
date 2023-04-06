package dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    static Connection connection = null;
    private DB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if(DB.connection != null){
        return connection;
        }
        new DB();
        return connection;
    }
}
