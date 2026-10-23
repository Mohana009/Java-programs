import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Task5Solution {
  public static ArrayList<String> displayOptions(ResultSet rs) throws SQLException {
    ArrayList<String> entries = new ArrayList<>();
    int i = 1;
    while (rs.next()) {
      entries.add(rs.getString(1));
      System.out.println(i + ". " + rs.getString(1));
      i++;
    }
    return entries;
  }
  public static void displayBookData(ResultSet rs) throws SQLException {
    int bookCount = 0;
    while (rs.next()) {
      System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
       + " " + rs.getDouble(5));
       bookCount++;
    }
    String x = bookCount > 1 ? "S" : "";
    System.out.println("A TOTAL OF " + bookCount + " BOOK" + x + " FOUND....");
  }
  public static ArrayList<String> fetchData(Statement st, int choice) throws SQLException {
    String field = switch(choice) {
      case 1 -> "name";
      case 2 -> "author";
      case 3 -> "genre";
      default -> throw new SQLException("Invalid choice");
    };
    String isDistinct = choice == 2 || choice == 3 ? "DISTINCT " : "";
    return displayOptions(st.executeQuery("SELECT " + isDistinct + field + " from books"));
  }
  public static void fetchFinalData(Statement st, int choice, String value) throws SQLException {
    String field = switch(choice) {
      case 1 -> "name";
      case 2 -> "author";
      case 3 -> "genre";
      default -> throw new SQLException("Invalid choice");
    };
    displayBookData(st.executeQuery("SELECT * FROM books WHERE " + field + " = " + "\'" + value + "\'"));
  }
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/mydb";
    String userName = "pavan";
    String password = "pavan";
    Scanner read = new Scanner(System.in);
    try {
      Connection con = DriverManager.getConnection(url, userName, password);
      if (con != null) {
        System.out.println("Successfully connected to db");
      }
      Statement st = con.createStatement();
      while (true)
      {
        System.out.println("Enter\n1. Search by name\n2. Search by author\n3. Search by genre: ");
        int choice = read.nextInt();
        if (choice != 1 && choice != 2 && choice != 3) {
          throw new SQLException("Invalid choice");
        }
        ArrayList<String> entries = fetchData(st, choice);
        System.out.println("Enter your choice here: ");
        int specificChoice = read.nextInt();
        if (specificChoice > entries.size() || specificChoice < 1) {
          throw new SQLException("Invalid choice");
        }
        fetchFinalData(st, choice, entries.get(specificChoice - 1));
      }
    }
    catch (SQLException e) {
      System.out.println(e);
    }
    finally {
      read.close();
    }
  }
}
