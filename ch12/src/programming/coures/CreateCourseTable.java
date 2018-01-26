package programming.coures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCourseTable {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String sql = "CREATE TABLE course(" + 
				"id			int				NOT NULL, " + 
				"name		varchar(30)		NOT NULL, " + 
				"professor	varchar(30)		NOT NULL, " + 
				"maxnum		int				NOT NULL, " + 
				"PRIMARY KEY(id) " + 
				");";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("테이블 course이 생성되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
