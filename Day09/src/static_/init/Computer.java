package static_.init;

public class Computer {
	
	static String model = "gram=gram";
	static String company ="LG";
	int price =1000000;
	
	//일반멤버변수는 생성자에서 초기화
	Computer() {
		System.out.println("일반생성자가 호출됨");
	}
	
	//특징 - 클래스가 호출될 때 단 한번 실행됨 (static 변수의 초기화)
	
	static {
		
		System.out.println("static 초기화자가 실행됨");
		model ="gram";
		company ="LG";
	}

}
