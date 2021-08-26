package basic;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		//스캐너를 이용하여 정수하나를 입력받습니다. 
		//입력받은 정수가 음수,0,홀수,짝수인지 구분하는 조건문을 만들어보세요 .
		// x % 2 ==0  짝수, x % 2 != 0  홀수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
	
		
		int sc = scan.nextInt();
		
		if (sc > 0) {
			System.out.println("양수");
			if (sc  % 2 == 0) {
				System.out.println("짝수");
			} else if (sc  % 2 != 0) {
				System.out.println("홀수");
			} 
			
		} else if (sc < 0) {
			System.out.println("음수");
			if (sc  % 2 == 0) {
				System.out.println("짝수");
			} else if (sc  % 2 != 0) {
				System.out.println("홀수");
			} 
			
		} else if (sc == 0) {
			System.out.println("0"); 
		} 
		
		

		
		
	}

}
