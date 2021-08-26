package Hello;

public class VariableEX {
	
	public static void main (String[]args) {
		
		/*변수의 선언방법
		 * 데이터 타입 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 유형임
		 * 정수만 저장가능
		 * 
		 */
		//변수의 선언
		
		int num;
		
		//초기화
		
		num = 10;
		
		
		System.out.println(num);
		
		//변수의 선언과 초기화를 동시에
		//위에 이미 변수를 num으로 지정, 동일한 이름의 변수는 지정 불가
		//즉 다른 이름의 변수 선언 해야함
		
		int num2 = 10;
		
		System.out.println(num2);
		
		//변수의 변경
		num=100;
		num2=200;
		
		//변수는 다른변수의 값, 또는 연산의 결과를 저장할 수 있음
		
		int result = num + num2;
		
		System.out.println(result);
		
		//1. 변수명 result 2 , result의 값과 10을 더한 결과를 저장
		
		int result2 = result + 10 ;
		
		System.out.println(result2);
		
		result2 =100;
		result2=num;
		
		System.out.println(num);
		System.out.println("----------------------");
		
		//문자를 저장하는 타임 : String 
		//int 와 달리 String은 키워드가 아님 그래서 앞문자 대문자 !
		
		
		String a ="홍길동";
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
