package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "world_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			
			String sqlCT = "CREATE TABLE city(" + 
					"id		int				NOT NULL auto_increment, " + 		//아이디
					"name	varchar(50)		NOT NULL, " + 		//이름
					"major	varchar(20)		NULL, " + 			//시장이름
					"pop	int				NULL, " + 			//인구
					"PRIMARY KEY(id) " + 
					");";

			
			// JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			//질의를 할 Statement 만들기
			Statement stmt = con.createStatement();
			
			//데이터베이스 world_0에 테이블 city만들기
			stmt.executeUpdate(sqlCT);
			
			System.out.println("테이블 city가 생성되었습니다.");
			
			//데이터 베이스 world_0의 테이블 city만들기
			stmt.executeUpdate("INSERT INTO city (name, major, pop)VALUES ('서울', '이명길', 20000000);");
			stmt.executeUpdate("INSERT INTO city (name, major, pop)VALUES ('인천', '김동훈', 3500000);");
			stmt.executeUpdate("INSERT INTO city (name, major, pop)VALUES ('대구', '강수복', 3000000);");
			stmt.executeUpdate("INSERT INTO city (name, major, pop)VALUES ('부산', '남기문', 5000000);");
			stmt.executeUpdate("INSERT INTO city (name, major, pop)VALUES ('목포', '신용현', 2000000);");
			System.out.println("테이블 city에 5개의 레코드가 삽입되었습니다.");
			
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
		} catch (SQLException e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다.");
		}

	}

}
