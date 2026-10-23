import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "0000";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new database name: ");
            String dbName = sc.next();
            String query = "CREATE DATABASE " + dbName;
            st.executeUpdate(query);
            System.out.println("Successfully created database " + dbName);

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
