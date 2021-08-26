package abs.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//재정의를 빼먹는다면 , 잘못된 메서드의 실행결과로 이어질수 있다는 뜻입니다.
		
		Store1 s = new Store1();
		s.apple();
		s.grape();
		s.orange();
	}

}
