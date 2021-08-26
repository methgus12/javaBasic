package abs.bad;

public class Store1 extends parentStore {

	@Override
	public void apple() {
		System.out.println("서울지점 사과는 500원입니다.");
		
	}

	@Override
	public void grape() {
		System.out.println("서울지점 포도는 600원입니다.");
		
	}
	
	//프로그래머가 실수로 orange의 오버라이딩을 빼먹었다면 ??
	

	
	
	
}
