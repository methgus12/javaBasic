package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JDBCSelect {
	
	public static void main(String[] args) {
		
		//1.데이터 베이스 연결에 필요한 변수선언
		//연결주소 형식 : 정해진 이름 : 아이피주소:포트번호:데이터베이스명
		String ur1 ="jdbc:oracle:thin:@localhost:1521:XE";
		
		String uid ="hr";//계정
		String upw ="hr";//비밀번호
		String sql = "select employee_id , last_name, hire_date, salary,department_id"
				+ " from employees";
		
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		//데이터베이스 연결구문은 throws를 던지고 있기 때문에 try 구문안에서 작성을 합니다.
		try {
			//2.드라이브로드 (호출) 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//3.connection 객체생성 -drivermanager 클래스가 제공하는 getConnection(주소, 아이디, 비밀번호)
			//java.sql에 있는것으로 import 필수
			conn = DriverManager.getConnection(ur1, uid, upw);
			
			//4.statement 객체생성 - connection객체로부터생성
			//pstmt는 매개변수로 실행할 sql문을 받습니다.
			
			pstmt=conn.prepareStatement(sql);
			
			//5.sql문 쿼리실행-select 문은 excuteQuery()로실행 , i,u,d문은 excuteUpdate() 구문실행
			rs = pstmt.executeQuery();
			
			//6.select문의 실행결과가 하나라도 존재하면 ,resultset의 next() 메서드는 true 반환
			int count =0;
			while(rs.next()) {
				//한 행에 대해서 처리할 작업
				//문자열-getString
				//숫자 -getInt
				//날짜-date or TimeStamp
				String id = rs.getString("employee_id");//아이
				String name = rs.getString("last_name");//이
				Timestamp hire_date =rs.getTimestamp("hire_date");//날짜
				int salary = rs.getInt("salary"); //급여
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(hire_date);
				System.out.println(salary);
				System.out.println("_______________");
			
			}
			
		
			
		} catch (Exception e) {
			e.printStackTrace();//오류결과출력
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				
			}
			
		}
		
	}
}
