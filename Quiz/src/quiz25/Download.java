package quiz25;

public class Download implements Runnable {
	
	String star = "*";
	
	@Override
	public void run() {
		
		System.out.print("동영상 다운로드를 시작합니다:");
	
		
		for(int i =1; i <= 10 ; i++) {
			System.out.print(star + " ");
			
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
			
		}System.out.println("\n동영상 다운로드가 완료되었습니다.");
		
		
	}


}
