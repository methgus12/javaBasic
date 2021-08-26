package thread.runable;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Runable 인터페이스를 상속하느 방법
		//쓰레드 클래스의 생성자 매개변수로 Runable 인터페이스를 구현하는 클래스를 전달 
		
		ThreadTest test = new ThreadTest();
		Thread t = new Thread(test, "이름>");
		t.start();
		
		System.out.println("메인쓰레드 종료");
		
	
	}
}
