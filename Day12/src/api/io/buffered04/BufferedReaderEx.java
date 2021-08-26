package api.io.buffered04;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		
		/*
		 * 2byte 기반 성능형상 스트림
		 * BufferedReader 
		 * 한줄을 통째로 읽는다 readLine 
		 */
		
		FileReader fr= null;
		BufferedReader br = null;
		
		try {
			
			//fr = new FileReader("/Users/sohyeon/file/filetest03.txt");
			//br= new BufferedReader(fr);
			
			br = new BufferedReader(new FileReader("/Users/sohyeon/file/filetest03.txt"));
			
			String str;
			
			while((str = br.readLine()) != null) {//읽은 값이 null이 아니면 계속 읽겠다.
				System.out.println(str);
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
				fr.close();
				
			} catch (Exception e2) {
				
			}
		}
	}

}
