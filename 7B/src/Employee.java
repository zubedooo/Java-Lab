import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String mydb = "javalab";
	String user = "root";
	String pass = "m1y3s5q7l9";
	Connection conn;
	PreparedStatement stmt;
	Statement stmt1;
	public void display() {	
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url + mydb, user, pass);
			stmt =  conn.prepareStatement("insert into Employee values (?, ?)");
			stmt1 = conn.createStatement();
			String ssn = "1ms";
			String name = "Aishwarya";
			stmt.setString(1,ssn);
			stmt.setString(2,name);
			stmt.executeUpdate();
			ResultSet rs = stmt1.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		Employee e = new Employee();
		e.display();
	}
}


