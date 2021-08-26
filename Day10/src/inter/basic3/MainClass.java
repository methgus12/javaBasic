package inter.basic3;

public class MainClass {
	
		public static Printed p;
		
		public static void main(String[] args) {
			
		
		//p= new LG();
		
		p = new Samsung();
		
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "blue");
		p.copy(10);
		p.turnOff();
		
		
		}	
	

}
