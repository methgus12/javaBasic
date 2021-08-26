package encap.obj;

public class Hotel {
	
	//접근제어자 타입 변수명
	
	//멤버변수
	
	private Employee emp; //String a;
	private Chef chef;

	
	//기본생성자
	
	public Hotel(){
		this.emp = new Employee();
		this.chef = new Chef();
	
	}
	
	//emp setter
	
	public void setEmp(Employee emp) {//매개변수 자리는 무조건 선언 
		this.emp=emp;
	}
	//emp getter
	
	public Employee getEmp() { 
		return emp;
		
	}
	//chef setter
	
	public void setChef (Chef chef) {
		this.chef= chef;
		
	}
	//chef getter
	public Chef getCf() {
		return chef;
	}
	

}
