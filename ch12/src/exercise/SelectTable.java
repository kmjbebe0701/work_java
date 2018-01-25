package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String SQL = "SELECT * FROM city;";
		
		//JDBC 드라이버 코드
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			ResultSet result = stmt.executeQuery(SQL);
			System.out.println("  ====테이블 city 내용 조회====  ");
			while (result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}
			
			stmt.close();
			con.close();
	
		} catch (Exception e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		

	}

}
