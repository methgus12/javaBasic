package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회원정보입력");
		System.out.print("ID>");
		String id = scan.next();
		
		System.out.print("name>");
		String name = scan.next();
		
		System.out.print("EMAIL>");
		String email = scan.next();
		
		//DB연결에 필요한 변수
		String ur1 ="jdbc:oracle:thin:@localhost:1521:XE";
		String uid ="hr"; //계정명
		String upw ="hr"; //비밀번호
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//rs는 select가 아니라면 필요없습니다.
		
		String sql ="insert into emps(employee_id , last_name, email, hire_date,job_id)"
				+ "values(?,?,?,sysdate,100)";
		
		try {
			//드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//커넥션 생성
			conn = DriverManager.getConnection(ur1, uid, upw);
			
			//pstmt 생성
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3,email );
			
			//sql실행 =i,u,d excuteupdate()문으로 실행
			int result = pstmt.executeUpdate(); //성공시 1반환 실패하면0을반환
			
			if(result ==1) {//삽입성공
				System.out.println("정상적으로 완료!~");
			}else {//삽입실패
				System.out.println("입력에 실패했습니다 다시!");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (Exception e2) {// TODO: handle exception
			}
		}
		
	}

}
