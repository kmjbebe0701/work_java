package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";

			// 1.JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 2. 질의를 할 Statement 만들기
			Statement stmt = con.createStatement();

			// 3. 데이터베이스 myjavadb 만들기
			int num = stmt.executeUpdate("create database myjavadb;");
			if (num == 1) {
				System.out.println("데이터 베이스 myjavadb가 생성되었습니다.");
			} else {
				System.out.println("이미 생성되어있는 데이터베이스입니다.");
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
		}
	}

}
