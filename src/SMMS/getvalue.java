package SMMS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class getvalue {
	private static String Query = "SELECT * FROM student";
	connection new_conection = new connection();
	
	public void getmethod() throws SQLException{
		Connection con = new_conection.getconnection();
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
		
		System.out.println("Rollnumber   : "+ rs.getInt(1));
		System.out.println("Student Name : "+ rs.getString(2));
		System.out.println("Tamil mark   : "+ rs.getInt(3));
		System.out.println("English mark : "+ rs.getInt(4));
		System.out.println("Maths mark   : "+ rs.getInt(5));
		System.out.println("Science mark : "+ rs.getInt(6));
		System.out.println("Social mark  : "+ rs.getInt(7));
		
	}
	con.close();
	}
}
