package JDBC.example.step2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MembersDAO implements IMembersDAO{
	private String ur1 ="jdbc:oracle:thin:@localhost:1521:XE";
    private String uid ="hr"; //계정명
	private String upw ="hr"; //비밀번호
	
	//조회기능 (id를 받아서 조회)
	
	public Members select (String id) {
		
		
		
		Members vo= null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql= "select * from members where id =?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(ur1, uid, upw);
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//sql문실행 
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				String ids = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				vo = new Members(ids, pw, name, email);
				
			}else {//결과가 없는 경우
				
				
			}
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
				
			} catch (Exception e2) {
				
			}
			
		}return vo;//반환
	}

	
	
	@Override
	public int insert(String id, String pw, String name, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result =0; //결과반한변수 
		String sql ="insert into members values (?,?,?,?)";
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2
			conn= DriverManager.getConnection(ur1,uid,upw);
			
			//3
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		return result;
	}



	@Override
	public int update(String id, String pw, String name, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result =0;
		
		String sql ="update members set pw=?, name=?, email=? where id=?";
		
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2
			conn= DriverManager.getConnection(ur1, uid, upw);
			
			//3
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (Exception e2) {
			
			}
			
		}
		return result;
		
	} 
	
	
}



