package overloading.basic;

public class Basic {
	
	/*
	 * 오버로딩 : 같은 이름의 메서드 , 생성자를 여러개 생성하는 것 
	 * 규칙 
	 * 1.이름이 같다.
	 * 2.반환유형은 오버로딩에 영향을 미치지않는다.
	 * 3.매개변수의 타입 or 종류 or 순서가 다르면 된다. 
	 */
	
	void input(int a) {
		
		System.out.println("정수 1개 입력");

	}
	//int input (int a) {반환유형이 다르다고 같은 이름이가능한것은 아님, 반환유형은 영향을 미치지않음
	
	void input (String s) {
		System.out.println("문자열 1개입력");
	}
	
	void input (int a, double b) {
		System.out.println("정수 1개, 실수1개입력");
	}
	
	void input (double a , int b) {
		System.out.println("실수 1개, 정수1개입력");
	}
		
	void input (char c, int b , double a) {
		System.out.println("문자, 정수, 실수 1개입력");
		
	}
}
