package static_.mathod;

public class Count {
	public int a; //일반멤버변수
	public static int b ; //정적멤버변수
	
	//일반메서드- 일반멤버변수 , 정적멤버변수(static)모두 사용가능 !
	public int method1() {
		a=10;
		return ++b;
		
	}
	
	//정적메서드- 정적멤버변수(static) , 정적메서드 만 사용가능 ! , 일반 멤버변수,메서드사 불가
	//즉 같은 static끼리만 가능 !
	public static int method2() {
		//a=10; 일반 멤버변수 불가 
		//아래처럼 사용가능 ! 객체생성을 통해서 가능 ~
		Count c = new Count();
		c.a =10;
		return ++b;
		
	}
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a=10;
		System.out.println(b);
		
		
		
	}

}
