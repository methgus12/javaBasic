package api.io.buffered04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStringEx {
	public static void main(String[] args) {
		/*
		 * BufferedInputStream은 바이트 기반 성능향상 스트림입니다.
		 * 한글을 쓰기에는 적합하지않아요 
		 */
		
		FileInputStream fis = null;
		BufferedInputStream bf= null;
		
		try {
			//fis = new FileInputStream("/Users/sohyeon/file/filetest02.txt");
			//bf = new BufferedInputString(fis);
			
			//위의 두줄과 같은문
			bf = new BufferedInputStream(new FileInputStream("/Users/sohyeon/file/filetest02.txt"));
			
			while (true) {
				int result = bf.read();	
				if (result == -1) break;
				
				System.out.print((char)result);//한글 처리안됨 , 영어만 정상으로보여요 
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e2) {
				
			}
		}
	
		
		
	}

}
