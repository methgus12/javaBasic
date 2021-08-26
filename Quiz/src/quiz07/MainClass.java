package quiz07;

public class MainClass {
	public static void main(String[] args) {
	
		SonicAp so = new SonicAp("대한항공");
		
		so.takeOff();
		so.fly();
		so.flyMode=1;
		so.fly();
		so.land();

		
		//이륙, 착륙  부모메서드 사용가능
		

		
	}

}
