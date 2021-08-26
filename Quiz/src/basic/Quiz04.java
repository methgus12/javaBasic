package basic;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요 " );
	
		System.out.print("키를 입력하세요 :" );
		int point = scan.nextInt(); //정수형 키
		
	
		System.out.print("나이를 입력하세요:" );
		int point2 =scan.nextInt();
		
		//둘중에 하나라도 안되면 안된다 ! &&이용해서 연결할 수 있음!
		
		if (point >= 140 && point2 >=8) {
			System.out.println("놀이기구 탑승이 가능합니다");
			
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다");
		} 
		
		scan.close(); //스캐너 강제종료 
		
	
			
		
			
	
	//키가 140이상이고 , 나이가 8세 이상이어야 놀이기구 탑승이 가능합니다.
	
	
	}
	
}
	
	
	
	
			


