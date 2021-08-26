package basic;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		/*
		 * 두 정수를 입력 받습니다. 
		 * 두 수의 크기는 정해지지 않았습니다 .
		 * 두 수의 사이의 합을 구하는 프로그램을 작성.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>>");
		int aa = scan.nextInt();
		
		System.out.print("정수입력>>");
		int bb = scan.nextInt();
		
		int sum = 0;
		
		if (aa < bb) {
			for (int i = aa; i <= bb; i++) {
				sum += i;} 
		} else if (bb < aa ) { 
			for (int i = bb; i <= aa; i++) {
				sum += i;} 
			}System.out.println("두수 사이의 합> " + sum );
			
	}
	
	/*
	 * 강사님 코드 , 삼항연사자를 이용!
	 * for (int i = (aa==bb? 0: aa>bb ? bb:aa); i <=(aa==bb?0 : aa> bb? aa:bb) ; i++) {
				sum += i;
		}
			
		}	System.out.println(sum);
			
	 */
		
			

}
