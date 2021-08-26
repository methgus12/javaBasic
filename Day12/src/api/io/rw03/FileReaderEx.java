package api.io.rw03;

import java.io.FileReader;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 *문자기반으로 읽어들이는 클래스는 fileReader 클래스입니다.
		 *2byte 단위로 읽어들이기 때문에 ,문자를 쓰기 적합합니다.
		 */
		
		FileReader fr = null;
		
		try {
			fr= new FileReader("/Users/sohyeon/file/filetest.txt");
			
			while(true) {
				int result = fr.read();
				
				if (result ==-1) break;
				System.out.print((char)result);	
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
