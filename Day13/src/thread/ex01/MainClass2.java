package thread.ex01;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		//객체1개 , 쓰래드 n개 (1개의 객체를 실행)
		
		ThreadTest t = new ThreadTest();
		
		Thread test1= new Thread(t,"A"); //A 쓰레드
		Thread test2 = new Thread(t, "B"); //B쓰레드
		
		test1.start();
		test2.start();
		
		System.out.println("메인 쓰레드 종료");
		
	}

}
