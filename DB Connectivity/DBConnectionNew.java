import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class DBConnection {
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
		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
		
		
	}
}
