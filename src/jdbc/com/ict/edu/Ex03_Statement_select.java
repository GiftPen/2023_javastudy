package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// customer 테이블에서 박씨 성을 가진 사람의 모든정보 검색하자
public class Ex03_Statement_select {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속 할 수 있도록 도와 주는 클래스
		Connection conn = null ;
		// 2.  SQL 구문 작성을 도와주는 클래스
		Statement stmt = null ;
		
		// 3-1. select문의 결과를 받는 클래스
		ResultSet rs = null ;
		// 3-2. select문을 제외한(delete, update, insert) 결과를 받는 변수
		int result = 0 ;
		// 4.  jdbc 드라이버 로딩 :  오라클 , MYSQL등 각각 내용이 다르다.
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 5. 접속하기 위한 정보 저장
				//    오라클, MYSQL 각각 내용이 다르다.
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "C##KIMJAEHOON";
				String password = "1111";
				
				// 6. 접속하기 :
				conn = DriverManager.getConnection(url,user,password);
				
				// 7. SQL작성하기    customer 테이블에서 박씨 성을 가진 사람의 모든정보 검색하자
				String sg1 = "select * from customer where  NAME like '박%' ";
				
				// 8. SQL를 보낼 수 있는 구문 만들기
				stmt = conn.createStatement();
				
				// 9. SQL를 담아서 보내고 결과 받기
				// 9-1. select
				rs = stmt.executeQuery(sg1);
				
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
	}
}
