package quiz13;

public class Marin extends Unit {
	
	//마린의 공격력이 업그레이드 되면 객체마다 동일 한 값을 갖습니다.
	public static int attack =5;
	
	public Marin() {
		super(0,0,40);
		
	}
	/*
	 * hold()의 기능 
	 * 마린의 현재위치를 출력 , stop 메서드 호출
	 */

	@Override
	public void hold() {
		System.out.println("현재위치:" + x + "," + y);
		
		//stop 메서드 호출
		this.stop();

	}

	/*
	 *move()의 기능 
	 *1.현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구합니다.
	 * 루트값- (Math.sqrt(값)
	 * 
	 * 2.현재 좌표값을 매개변수의 좌표값으로 변경.
	 * 3.이동한 거리를 정수형으로 출력
	 * 
	 */
	@Override
	public void move(int x, int y) {
		// *1.현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구합니다.
		// 루트값- (Math.sqrt(값)
		
		int length = (x-this.x)*(x-this.x) + (y-this.y) *(y-this.y);
		int distance=(int)Math.sqrt(length);
		//2.현재 좌표값을 매개변수의 좌표값으로 변경.
		this.x=x;
		this.y=y;
		//3.이동한 거리를 정수형으로 출력
		System.out.println("이동거리:" + distance);
		
		
	}
	
}
