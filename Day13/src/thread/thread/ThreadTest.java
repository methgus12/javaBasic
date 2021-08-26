package thread.thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("현재쓰레드이름>" + getName());// 클래스를 상속 받았기 때문에 사용가능
		System.out.println("스레드시작");
		
		for(int i =1; i <=10; i++) {
			System.out.println(i);
			try {
				sleep(1000); //클래스를 상속받았기때문에사용가능
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	} 
	
	

}
