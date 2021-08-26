package JDBC.example.step2;

public interface IMembersDAO {
	
	public Members select (String id);
	
	//인터페이스에 insert정의
	public int insert(String id , String pw, String name , String email);
	
	//update 정의
	public int update(String id,String pw, String name , String email);
	

}
