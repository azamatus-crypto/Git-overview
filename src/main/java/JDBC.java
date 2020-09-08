import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String url="jdbc://localhost:3306/tutorial";
        String username="root";
        String password="123456789a";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            statement.close();
            connection.close();*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
