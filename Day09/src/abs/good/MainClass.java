package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1.추상 메서드를 사용하면 오버라이딩이 강제화 되기 때문에
		 * 프로그래머의 (오버라이딩) 실수를 줄일 수 있습니다. 
		 * 
		 * 2.다형성으로 ParentStore s2 = new Store2로 저장가능
		 * 
		 */
		
		
		//서울지점
		Store1 s1 = new Store1();
		System.out.println(s1.getStoreName());
		
		//꼭 오버라이딩이 필요했던 것들
		s1.apple();
		s1.grape();
		s1.orange();
		
		//오버라이딩 되지않은 것들
		s1.mango();

		System.out.println("----------------------");
		
		//부산지점
		Store2 s2 = new Store2();
		System.out.println(s2.getStoreName());
		
		//꼭 오버라이딩이 필요했던 것들
		s2.apple();
		s2.grape();
		s2.orange();
		
		//오버라이딩 되지않은 것들
		s2.mango();
		
		
		
		
	
	}
}
