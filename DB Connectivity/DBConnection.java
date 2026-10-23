import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class DBConnection {
    public static String getInsertQuery(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String dummy = sc.next();
        int age = sc.nextInt();
        String name = "\"" + dummy + "\"";
        String insertQuery = "INSERT INTO staff values(" + id + "," + name + "," + age + ")";
        return insertQuery;

    }
    public static void main(String[] args) {
        // 1. Create database url (Connection string)
        String url = "jdbc:mysql://localhost:3306/mydb1";
        // 2. Create a string consists of username
        String userName = "root";
        // 3. Create a string consists of password
        String password = "0000";

        //Establishing connection using DriverManager
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            if(con != null){
                System.out.println("Successfully connected to DB");
            }
            Statement st = con.createStatement();
            String query = "update staff set age = 30 where s_id = 2";

            //Using the statement object, execute SQL Queries
            st.executeUpdate(query);

            // String query2 = "UPDATE staff SET age = 21 WHERE s_name = 'Alice'";
            // st.executeUpdate(query2);

            //INSERT INTO staff VALUES(4, "Diana", 29);
            // int id = 4;
            // String name = "\"" + "Diana" + "\"";
            // int age = 26;
            // String insertQuery = "INSERT INTO staff VALUES(" + id + "," + name + "," + age + ")";

            // st.executeUpdate(getInsertQuery());

            String deleteQuery = "DELETE FROM staff WHERE s_id = 5";
            st.executeUpdate(deleteQuery);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
    }
}
