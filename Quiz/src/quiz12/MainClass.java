package quiz12;

public class MainClass {
	public static void main(String[] args) {
		/*
		 *1. 원형은 생성될 때 이름과 , 변의 길이를 받도록 처리
		 *2. getArea() 는 원의 넓이를 구하도록 오버라이딩 
		 *3. main 생성해서 도형이름을 확인 
		 *4. PI는는 상수형태로 선언하세요  
		 * 
		 */
		
		//둘다 답같음
		CirCle c = new CirCle("원형", 5);
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
		Shape s = new CirCle("소현" , 5);
		System.out.println(c.getName());
		System.out.println(c.getArea());

	}

}
