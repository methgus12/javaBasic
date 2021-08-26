package exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		/*
		 * 메서드, 생성자에서 발생되는 예외를 떠넘기는 키워드가 throws입니다.
		 *throws 구문이 붙어있는 메서드, 생성자를 호출할때 예외처리를 대신 진행해야합니다.
		 *
		 *즉 , 예외처리를 강요할때 사용
		 * 
		 */
		
		try {
			//greeting(5);
			calc(0);
		} catch (Exception e) {
			System.out.println("배열이 참조범위를 벗어났습니다.");
			
		}
		
		//대표적인 throws 처리된 메서드..
		
		try {
			Class.forName("#$F#&");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 정확히 입력하세요.");
		}
		
		//대표적인 throws처리된 메서드
		
		try {
			new FileInputStream("@F#");
		} catch (FileNotFoundException e) {
			
			System.out.println("파일위치를 정확히 입력하세요.");
		}
	}
	
	private static String [] arr = {"hello" , "안녕", "니하오", "사요나라"};
	public static void greeting(int index) throws Exception {
		
		System.out.println(arr[index]);
		
		
	}public static void calc (int num) throws ArithmeticException {
		System.out.println(10/num);
	}

}
