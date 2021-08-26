package api.io.buffered04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Bufferd가 붙은 클래스는 입출력 성능 향상을 위한 클래스이며, Output은 바이트 기반
		 * Buffered는 생성자 매개변수로 입출력 클래스를 전달 받습니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		
		//OutputStream fos = null;
		BufferedOutputStream bf = null;
		
		
		try {
			
			//fos = new FileOutputStream("/Users/sohyeon/file/filetest02.txt");
			//bf = new BufferedOutputStream(fos);
			
			bf = new BufferedOutputStream(new FileOutputStream("/Users/sohyeon/file/filetest02.txt"));
			System.out.print("입력할 문장>");
			String str = scan.nextLine();
			
			bf.write(str.getBytes());//바이트 기반이기 때문에 매개변수로 바이트 배열을 받습니다.
			bf.flush(); //모은것을 전송=> 모은 버퍼를 전송
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}

}
