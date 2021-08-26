package quiz12;

public class CirCle extends Shape {
	/*
	 *1. 원형은 생성될 때 이름과 , 변의 길이를 받도록 처리
	 *2. getArea() 는 원의 넓이를 구하도록 오버라이딩 
	 *3. main 생성해서 도형이름을 확인 
	 *4. PI는는 상수형태로 선언하세요  
	 * 
	 */
	private int radius;
	
	// PI는는 상수형태로 선언하세요  
	static final double PI = 3.14;
	
	// 원형은 생성될 때 이름과 , 변의 길이를 받도록 처리
	public CirCle (String name , int radius) {
		super(name);
		this.radius= radius;
		
	}

	
	// getArea() 는 원의 넓이를 구하도록 오버라이딩 
	@Override
	public double getArea() {
		
		return PI * radius * radius;
	}
	
	
	
}
