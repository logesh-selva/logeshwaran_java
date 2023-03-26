package SMMS;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertvalue {
	Scanner scanner = new Scanner(System.in);
	private static int rollnumber,total;
	private static String SchoolName;
	private static int[] subject = new int[5];
	private static String student_name,date;
	connection get = new connection();
	public int value = 1;
	public void insert () throws SQLException {
//		String Query = "insert into employee values(?,?,?,?,?,?,?);";
		System.out.println("Enter a School Name :");
		SchoolName = scanner.nextLine();
		System.out.println("Enter a rollumber :");
		rollnumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a name : ");
		student_name=scanner.nextLine();
		System.out.println("Enter a Birth Date :(FORMET : YYYY-MM-DD)");
		date = scanner.nextLine();
		System.out.println("Enter Tamil mark : ");
		subject[0]=scanner.nextInt();
		System.out.println("Enter English mark ");
		subject[1]=scanner.nextInt();
		System.out.println("Enter Maths mark : ");
		subject[2]=scanner.nextInt();
		System.out.println("Enter Science mark : ");
		subject[3]=scanner.nextInt();
		System.out.println("Enter Social Science : ");
		subject[4]=scanner.nextInt();
		Connection con = get.getconnection();
		for(int i:subject)
			total+=i;
		String Query = "insert into student values('"+SchoolName+"',"+rollnumber+",'"+student_name+"','"+date+"',"+subject[0]+","+subject[1]+","+subject[2]+","+subject[3]+","+subject[4]+","+total+");";
		Statement st =  con.createStatement();
		
		int  rows = st.executeUpdate(Query);
		
//		if(temp==5 )?
//		con.commit()commit;
		System.out.println("NUMBER OF ROWS AFFECTED : " + rows);
		con.close();
	}
}
