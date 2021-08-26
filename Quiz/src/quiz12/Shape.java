package quiz12;

public abstract class Shape {//모양
	//abstract 매서드가 되려면 클래스도 되야함!
	private String name;
	
	
	//기본생성자 
	public Shape(String name) {
		
		this.name = name;
		
	}
	
	//도형의 넓이를 구하는 메소드
	public abstract double getArea();
	
	//일반메서드
	public String getName() {
		return "도형이름" + name;

	}
	
	
	
}
