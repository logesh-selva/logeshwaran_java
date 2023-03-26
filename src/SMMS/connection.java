package SMMS;
import java.sql.*;
public class connection {
	protected final String url = "jdbc:mysql://localhost:3306/btrs";
	protected final String user_name = "root";
	protected final String password = "1234";
	public Connection getconnection() throws SQLException {
		return DriverManager.getConnection(url,user_name,password);
	}
}
