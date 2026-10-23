import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
class DBConnection2 {
	public static void main(String[] args)
	{
		// url
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String username = "root"; // "root"
		String password = "0000"; // "root pwd"
		// Establish the connection
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null)
				System.out.println("Successfully Connected");

            //Create a statement object (Let's you run SQL Queries)
            Statement st = con.createStatement();

            //Run SQL Queries using statement st
            ResultSet rs = st.executeQuery("SELECT * FROM staff");
            //Running a loop on result set
            while(rs.next()){
                // System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
		
		
	}
}