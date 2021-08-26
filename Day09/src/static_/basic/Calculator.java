package static_.basic;

public class Calculator {
	
	/*
	 * 계산기마다 색깔이나 결과값은 다르기 때문에 일반멤버변수가 됩니다.
	 * 반면에 
	 * 계산기 마다 원주율은 동일하기 때문에 static으로 선언하는게 좋습니다.
	 * 
	 */
	private int result ; //일반변수
	private String color; //일반변수
	public static double pi= 3.14;//static 가능 
	
	/*
	 * 일반 멤버변수를 참조하고 있는 메서드를 static으로 선언하면 안됩니다. 
	 * 
	 */
	
	public void setColor(String color) {
		this.color = color ;
		
		
	}
	
	public String getColor() {
		return color;
	}
	
	//result에 누적하는 add()	메서드
	public void add(int a) {
		result += a;

	}
	//3.result 값을 반환 받는 getResult() 생성하세요 
		public int getResult(int result) { //static 붙으면 안됩니당 
			return result;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버변수를 쓰지않고 , 
	 * 범용성 있게 사용하는 메서드는 static 키워드를 쓰는 편이 좋다.
	 */
		
	public static double areaCircle(int r) {
		return pi *  r * r;
		
	}
	
	public static double areaRect(int side) {
		return side * side;
	}
	
	
}
