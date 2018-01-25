package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateUnivDB {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL,"root", "koitt");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE DATABASE univ;");
			System.out.println("데이터베이스 univ가 생성되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
