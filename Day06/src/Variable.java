
public class Variable {//main없는설계용 클래스
	
	//멤버변수 : 초기화하지 않으면 기본값으로 자동 초기화
	
	int a;
	
	void printNumber(int c) {
		int b=1;
		
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b); //초기화하지않으면사용할 수 없음 
		System.out.println("매게변수 : " + c);//초기화 하지않아도 사용가능 
		
		
		
	}
	

}
