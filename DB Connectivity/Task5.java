import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Task5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb1";
        String userName = "root";
        String password = "0000";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            if(con != null) System.out.println("Successfully connected to database");
            Statement st = con.createStatement();
            //not completed
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
