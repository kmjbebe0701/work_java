package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDeptTable {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			String sql = "INSERT INTO department VALUES(?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2,  "경영학과");
			pstmt.setInt(3, 120);
			pstmt.executeUpdate();

			pstmt.setInt(1, 2);
			pstmt.setString(2, "컴퓨터공학과");
			pstmt.setInt(3, 60);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "기계공학과");
			pstmt.setInt(3, 80);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "전자공학과");
			pstmt.setInt(3, 80);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "국어국문학과");
			pstmt.setInt(3, 40);
			pstmt.executeUpdate();
			System.out.println("5개의 정보가 삽입되었습니다.");

			pstmt.close();

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
