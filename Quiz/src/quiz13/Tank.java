package quiz13;

public class Tank extends Unit {
	
	public Tank() {
		super(0,0,200);
	}
	//hold , move 의 기능은 동일

	@Override
	public void hold() {
		
		System.out.println("현재위치:" + x + "," + y);
		this.stop();

		
	}

	@Override
	public void move(int x, int y) {
				int length = (x-this.x)*(x-this.x) + (y-this.y) *(y-this.y);
				int distance=(int)Math.sqrt(length);
				
				this.x=x;
				this.y=y;
				System.out.println("이동거리:" + distance);
				
			
		
		
	}
	
}
