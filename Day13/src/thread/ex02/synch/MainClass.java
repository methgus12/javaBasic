package thread.ex02.synch;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ThreadTest t = new ThreadTest();
		
		Thread test1 = new Thread(t, "A");
		Thread test2 = new Thread(t, "B");
		
		test1.start();
		test2.start();
		
		
		
		
	}

}
