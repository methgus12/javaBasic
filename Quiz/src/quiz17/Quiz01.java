package quiz17;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		/*
		 * Math.ceil 을 이용해서 1-10 까지 값이 전달되면 1을 반환.
		 * 11-20 까지 값이 전달되면 2를 반환
		 * 21-30 까지 값이 전달되면 3을 반환
		 *
		 */
		
		
		System.out.println(method(13));
		System.out.println(method2(23));
	
	}
	
	public static int method(int num ) {
		
		double d = Math.ceil(num -1) * 0.1 +1;
		int result = (int)d;
		
		return result;
	}
	
	//강사님 코드
	
	public static int method2(int n) {

		return (int)Math.ceil(n/10.0);
	}
}
