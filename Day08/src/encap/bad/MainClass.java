package encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//멤버변수가 public으로 선언되면 , 잘못된 값이 저장되거나
		//누구든지 사용할 수 있다는 문제가 있습니다.
		
		
		MyBirth me = new MyBirth();
		
		me.year =2020;
		me.month=7;
		me.day=100; 
		me.ssn="이게뭐죠?";

		me.info();
		//잘못된 값이 저장된 형태
		
		//안좋은 방법 좋은방법은 encap.good 참고
		
	}

}
