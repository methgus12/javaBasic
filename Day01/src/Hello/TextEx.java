package Hello;

public class TextEx {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 데이터 타입 char 
		
		char c1 = 'A';
		
		System.out.println(c1);
		
		char c2 =65;
		System.out.println(c2);
		
		//문자를 통일하기위해서 유니코드의 등장으로 크기를 2바이트로 지정을 하고 
		//부호없는 형태의 65536개의 글자표현이 가능 함 .
		
		char c3 ='가';
		char c4 = 44032;
		char c5='\uAC00'; //유니코드를표현하는 탈출문자
		
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//+들 사이에 "" 추가해줘야 가로표기됨 
		
		System.out.println(c3+""+c4+""+c5);
		
		System.out.println("----------------------");
		
		String s1="hello";
		String s2="world";
		
		System.out.println(s1 + s2);
		
		
		System.out.println("문자열의 길이:" +s1.length());
		
		System.out.println("----------------------");
		
		
		
//문자열의 연산 		
		
		System.out.println(100+200);
		System.out.println("100"+200);
		//즉 문자열이 다른 타입에 붙으면 결과는 항상 문자열이 됩니다. 
		
		
		System.out.println(100+200+"hello");
		System.out.println("hello"+100+200);
		//차이 비교해보고 , 이해하기
		
		
		//char 형 => 단일문자의 경우 연산에서 숫자로 표현 됨 
		System.out.println('A'+10); //75가 나
		
		System.out.println("A"+10); //A10이 나옴
		System.out.println("---------------------");
		
		String a ="여명";
		String b ="귀여움";
		int c = 25;
		
		System.out.println(a+"이는" + c + "치고는 " +b);
		
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
