package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statment_delete {
	public static void main(String[] args) {
		// 접속 러치를 위한 클래스 3개
		Connection conn = null ;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##KIMJAEHOON";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
		
			
			// DELETE 삭제하기
			String sql = "DELETE FROM customer WHERE NAME = '이강인' ";
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			// 성공하면 select문을 이용해서 보자
			sql = "select * from customer order by custid asc";
			//stmt = conn.createStatement(); // 생략가능
			rs = stmt.executeQuery(sql);
			
			if(result > 0) {
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
				
			}else {
				System.out.println("사업 실패");
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}
			
		} catch (Exception e) {
			System.out.println("제대로된 데이터를 넣어주세요 : "  + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
