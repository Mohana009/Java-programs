import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Check {
    public static void main(String[] args) {
        String userName = "root";
        String pwd = "0000";
        String url = "jdbc:mysql://localhost:3306/mydb1";
        
        try{
            Connection con = DriverManager.getConnection(url, userName, pwd);
            if(con != null) System.out.println("Connection Successfull");
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
