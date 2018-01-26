package programming.coures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertCourseTable {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			String sql = "INSERT INTO course VALUES(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2,  "영어 회화");
			pstmt.setString(3,  "권해동");
			pstmt.setInt(4, 200);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 2);
			pstmt.setString(2,  "국어의 이해");
			pstmt.setString(3,  "신용현");
			pstmt.setInt(4, 120);
			pstmt.executeUpdate(); 
			
			pstmt.setInt(1, 3);
			pstmt.setString(2,  "한국 근대사");
			pstmt.setString(3,  "전성욱");
			pstmt.setInt(4, 80);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2,  "대화의 기법");
			pstmt.setString(3,  "김희천");
			pstmt.setInt(4, 60);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 5);
			pstmt.setString(2,  "컴퓨터 개론");
			pstmt.setString(3,  "권순락");
			pstmt.setInt(4, 40);
			pstmt.executeUpdate();


			System.out.println("5개의 정보가 삽입되었습니다.");

			pstmt.close();

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
