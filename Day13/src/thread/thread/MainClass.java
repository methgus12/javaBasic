package thread.thread;

public class MainClass {
	
	public static void main(String[] args) {
		//Thread class 를 상속받아서 사용하는 방법
		
		ThreadTest t = new ThreadTest();
		t.setName("쓰레드1"); //쓰레드이름
		t.start();
		
		System.out.println("메인 쓰레드 종료");
		
		
	}

}
