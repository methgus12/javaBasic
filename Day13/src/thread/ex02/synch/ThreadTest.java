package thread.ex02.synch;

public class ThreadTest implements Runnable {
int num = 0;

	@Override
	public synchronized void run() { //synchronized ..!
		//a가 먼저 진행되고 끝난 후에 그다음이진행됨

		for(int i=1; i <= 10 ; i++) { 
			
			if(Thread.currentThread().getName().equals("A")) {
			num++; 
		}
			
			System.out.println("쓰레드이름>"+ Thread.currentThread().getName()+", num >" + num); 

			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				
			}
		}
		
	}

}
