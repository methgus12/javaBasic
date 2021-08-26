package inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b= new Basic();
		b.method1(); //override
		b.method2();
		b.method3();

		System.out.println(b.PI);
		System.out.println(b.ABC);
		
		System.out.println("-------------------------");
		/*
		 * 인터페이스도 하나의 타입이 될 수 있습니다.
		 * 인터페이스에 객체를 저장했을때 , 다형성의 형태로 동일하게 실행됩니다.
		 */
		
		Inter1 i1 = b; //Inter i1 = new Basic();
		i1.method1();
	//	i1.method2();불가
	//	i1.method3();불가
		
		Inter2 i2=b; //Inter2 i2 = new Basic();
		i2.method2(); //2번만가능 ~
		
		//다형성을 구현하는매우 중요한 역할 .
		//여러 형태를 만들어줍니다.
		
		System.out.println("-------------------------");
		
		//인터페이스도 클래스 캐스팅을 사용 할 수 있습니다.
		
		Basic bb= (Basic)i1;
		
		
	}
}
