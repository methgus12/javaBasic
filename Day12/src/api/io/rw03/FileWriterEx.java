package api.io.rw03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할때 , 사용하는 클래스는 fileWriter 
		 * 기본적으로 2byte 단위로 문자를 읽고 쓰기 때문에 문자쓰기에 적합
		 */
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/sohyeon/file/filetest.txt");
			String str = "아.. 어렵다.. 라고 생각하고 계시죠?\n\r 아 집에가고 싶다.";
			//글자 잘 정렬하기위해 \r
			//\n 줄바꿈 \r 은 글자를처음으로 돌려줌 두개를 같이 쓰세용가리 
			fw.write(str); //write 메서드는 문자열 자체를 받아줍니다.
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
