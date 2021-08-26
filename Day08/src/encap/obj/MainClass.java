package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		//hotel 안에 있는 Employee의 working 메서드 실행 
	
		
		Hotel h = new Hotel();
		
		Employee e = h.getEmp();
	
		e.working();
		
		//h.getEmp().working();
		
		//호텔안에있는 쉐프를 새로운 쉐프로 변경
		
		
		Hotel h2 = new Hotel();
		
		//Chef c = new Chef();
		//h.setChef(c);
		h.setChef(new Chef());
		
		
	
	}

}
