package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex5_10 {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String SQL = "UPDATE city SET name = '서울특별시'WHERE name = '서울';";
		
		
			try {
				Class.forName(driverName);
				Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
				
				Statement stmt = con.createStatement();
				
				stmt.execute(SQL);			//서울을 서울특별시로 수정
				

			} catch (Exception e) {
				System.out.println("MySql 데이터베이스에 문제가 있습니다.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
	}

}
