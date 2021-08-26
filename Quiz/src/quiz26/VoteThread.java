package quiz26;

import java.util.Random;

public class VoteThread implements Runnable {
	
	/*
	 * 쓰레드 객체는 3개가 생성되어야합니다.
	 * run() 메서드에서는 랜덤값을 이용해서 
	 * 각 구의 개표진행사항을 화면에 출력하면 됩니다.
	 * 
	 * StringBuffer을 이용해서 출력합니다.
	 * 조건 : 개표율은 100을 넘지 않습니다.
	 * 
	 */

	
	int num = 0;
	Random ran = new Random();
	StringBuffer br = new StringBuffer();
	
	
	public void run() { 
		String name = Thread.currentThread().getName();
		
		while(true){
			
			int r =	ran.nextInt(10) + 1; 
			num += r;
			if(num >= 100) {
				br.delete(0, num);
				
				num=100;
				
				for(int i=1; i <= num; i++) { //개표율100 넘었을경우
					br.append("*");
				}System.out.println( name+ "| 개표율>" + num + "%>" + br.toString());
				break;//탈출

			} else {//개표율 100이하
			
			for(int i =1; i < r ; i++ ) {
				br.append("*");
			}
			System.out.println(  name+"| 개표율>" + num + "%>" + br.toString());
			
			
			
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				
			}		
		}
		}
		
}
}
	
