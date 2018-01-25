package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex5_9 {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String SQL = "DELETE FROM city WHERE name = '목포';";
		
		
			try {
				Class.forName(driverName);
				Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
				
				Statement stmt = con.createStatement();
				
				stmt.execute(SQL);			//목포삭제
				

			} catch (Exception e) {
				System.out.println("MySql 데이터베이스에 문제가 있습니다.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
	}

}
