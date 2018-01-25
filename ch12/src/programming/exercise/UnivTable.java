package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UnivTable {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String sql = "CREATE TABLE department(" + 
				"id		int				NOT NULL, " + 
				"name	varchar(30)		NOT NULL, " + 
				"snum	int				NOT NULL, " + 
				"PRIMARY KEY(id) " + 
				");";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("테이블 department이 생성되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
