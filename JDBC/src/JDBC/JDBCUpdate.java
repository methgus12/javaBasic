package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdate {
	/*
	 * scanner을 이용해서 받으시면됩니당.
	 * emps에서 수정할 id를 받아서 이름 , 이메일 , 급여를 수정하는 jdbc 프로그램을 작성해보세
	 * 
	 */
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("수정할 아이디를선택하세요>");
	String id = scan.next();
	
	System.out.print("Name >");
	String name = scan.next();
	
	System.out.print("Email >");
	String email = scan.next();
	
	System.out.print("salary");
	int salary = scan.nextInt();
	
	//DB연결변수
	String ur1 = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid="hr";
	String upw="hr";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String sql= "update emps set last_name =? , email=?,salary=?"
			+ "where employee_id=?";
			
	
		
	try {
		//드라이버로
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//커넥션생성
		conn = DriverManager.getConnection(ur1, uid, upw);
		
		//pstmt생성
		pstmt =conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setInt(3,salary);
		pstmt.setString(4, id);
		
		int result =pstmt.executeUpdate();
		
		if (result ==1) {
			System.out.println("수정에 성공하였습니당");
		} else {
			System.out.println("다시입력해주세요!");
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	
	}finally {
		
		try {
			conn.close();
			pstmt.close();
			
		} catch (Exception e2) {
			
		}
	}
	
	}
}
