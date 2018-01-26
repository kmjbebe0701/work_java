package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDeptTable {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			String sql = "SELECT * FROM department";
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			ResultSet result = pstmt.executeQuery();

			while (result.next()) {
				System.out.printf("%3d%20s\t%5d \n",result.getInt(1), result.getString(2), result.getInt(3));

			}

			result.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
