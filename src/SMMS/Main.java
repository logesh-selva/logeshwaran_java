package SMMS;

import java.sql.SQLException;

public class Main {
	static   insertvalue ins           ;
	static   getvalue get;
	public static void main(String[] args)  {
 		get = new getvalue();
		try {
			get.getmethod();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//	}
 		ins = new insertvalue();
		try {
			ins.insert();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		
}}