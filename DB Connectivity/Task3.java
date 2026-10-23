import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class Task3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "0000";
        Scanner sc = new Scanner(System.in);
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            if(con != null) System.out.println("success!!!");
            ResultSet rs = st.executeQuery("SHOW DATABASES");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            System.out.println("Select one database: ");
            String dbName = sc.next();
            String query = "USE " + dbName;
            try{
                st.executeUpdate(query);
                System.out.println("Connected to " + dbName + " database");
            }
            catch(SQLException e){
                System.out.println("Database not found");
                System.out.println(e);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
