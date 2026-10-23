import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class Task2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password ="0000";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            if(con != null)
                System.out.println("Connected successfully");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SHOW DATABASES");

            while(rs.next()){
                System.out.println(rs.getString(1));
            }

        }
        catch(SQLException e){
            System.out.println(e);
        }
        
    }
}
