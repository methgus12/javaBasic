package thread.runable;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println("현재스레드>" + Thread.currentThread().getName());
		System.out.println("쓰레드 시작");
		
		for(int i=1; i <=10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초멈춤 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	

}
