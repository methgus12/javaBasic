package static_.singleton;

public class Singleton {
	
	//싱글톤 패턴 - 클래스가 여러번 호출되더라도 , 객체를 1개만 생성하도록 디자인 하는방법
	
	//1.접근제어자를 private 로 선언 -> 스스로 객체를 단 1개 생성한다.
	private static Singleton instance = new Singleton();
	
	//2.접근제어자를 이용해서 외부에서 객체 생성을 못하도록 생성자를 private 처리
	
	
	private Singleton() {
		
	}
	
	
	//3.외부에서 객체를 요구할 경우 1번에서 만들어둔 단 한개의 객체를 반환
	//getter 메서드 이용
	
	public static Singleton getInstance () {
		return instance;
		
	}
	private String s = "홍홍홍";
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s =s;
	}
}
