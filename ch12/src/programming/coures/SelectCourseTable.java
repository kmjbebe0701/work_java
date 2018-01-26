package programming.coures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCourseTable {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			String sql = "SELECT * FROM course";
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			ResultSet result = pstmt.executeQuery();

			while (result.next()) {
				System.out.printf("%3d %20s\t %5s\t %5d \n",
						result.getInt(1), result.getString(2),result.getString(3), result.getInt(4));

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
