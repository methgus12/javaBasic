package JDBC.example.step2;

public class Members {
	
	//members 테이블의 값을 저장하는 용도의 클래스
	//은닉된 클래스로생성 ,getter , setter을 이용해서 조회
	
	private String id;
	private String pw;
	private String name;
	private String email;
	
	//모든변수를 받아서 초기화 하는 생성자 , 기본생성자를 만듬
	public Members() {
		
	}
	public Members(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
