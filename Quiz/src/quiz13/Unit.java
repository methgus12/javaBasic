package quiz13;

public abstract class Unit {
	
	public int x; //좌표값
	public int y;
	public int hp; //체력
	
	public Unit (int x, int y , int hp) {
		this.x =x;
		this.y =y;
		this.hp = hp;
		
	}
		
		//움직이는 기능
	public abstract void hold();//위치정보확인
	public abstract void move(int x, int y);//이동기능
		
	public void stop() {
		System.out.println("stop!");
	}
		


}
