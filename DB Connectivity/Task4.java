import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "0000";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();   //Let's us to run sql queries
            ResultSet rs = st.executeQuery("SHOW DATABASES");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            System.out.println("Select one from existing databases: ");
            //Taking user choice database
            Scanner sc = new Scanner(System.in);
            String dbName = sc.next();
            String query = "USE " + dbName;
            try{
                //Trying to connect to the database of user's choice
                st.executeUpdate(query);
                System.out.println("Successfully connected to " + dbName);
                //Printing the tables is selected database
                ResultSet rs2 = st.executeQuery("SHOW TABLES");
                System.out.println("Tables in " + dbName);
                while(rs2.next()){
                    System.out.println(rs2.getString(1));
                }
            }
            catch(Exception e){
                //If the user choice doesn't exist
                System.out.println("Selected database doesn't exist");
                System.out.println(e);
            }

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
