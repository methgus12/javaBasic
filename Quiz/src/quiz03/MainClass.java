package quiz03;

public class MainClass {
	
	public static void main(String[] args) {
		
		//player 클래스를 부모클래스로 사용 
		//공통 기능을 가지도록 처리
		//마법사와 전사는 player를 상속 받고
		//각각의 생성자도만들어주세요
		//마법사와 전사를 객체생성
		Wizard w= new Wizard("전사", 500,1000, 5, 5);
		
		w.info();
		
		Warrior w2= new Warrior("마법사", 600,700, 4, 9);
		
		w2.info();
	
	
	
	}

}
