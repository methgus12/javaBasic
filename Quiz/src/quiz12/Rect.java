package quiz12;

public class Rect extends Shape{
	private int side;
	
	public Rect(String name , int side) {
		super(name);
		this.side=side;
		
	}
	
	@Override
	public double getArea() {
		this.side = side;
		
		return side * side;
	}
	
	public String getName() {
		return "오버라이딩 된 " + super.getName();
	}

}
