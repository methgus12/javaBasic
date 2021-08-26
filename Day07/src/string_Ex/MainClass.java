package string_Ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		String str1= "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//500pg 책
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str3);//false equals 사용
		
		/*같은클래스 내부에서 문자열을 동일하게 선언하면 , 같은string 객체를 가르키게 됩니다. 
		하지만 직접 string 객체생성 명령을 내리거나 , 
		다른클래스에서 넘어오는 string은 다른 주소를 가지게 됩니다.
		그래서 문자열 비교시에 == 대신에 string 클래스가 제공하는 equals() 매서드를 사용해야합니다.
		 */ 
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		if(str1.equals("홍길동")) {
			System.out.println("문자열 자체가 같음");
			
		}
	}
}
