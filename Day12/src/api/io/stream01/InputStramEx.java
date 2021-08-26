package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class InputStramEx {
	public static void main(String[] args) {
		
		/*
		 * 1.파일을 바이트 단위로 읽을 때 사용하는 클래스 fileinputstream class
		 * 2.생성자 매개변수로 읽어들일 파일의 전체경로
		 * 
		 */
		
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("/Users/sohyeon/file/filetest.txt");
			//1byte 단위로 읽
			while(true) {
				int result = fis.read();	
				if(result ==-1) break;
				System.out.print((char)result);
			}
		//byte [] arr = new byte[100];
		//int result = fis.read(arr);
		//System.out.println(Arrays.toString(arr));
		//int i=0;
		//while (true) {
			//if(arr[i] ==0)break;
			//System.out.print((char)arr[i]);
			//i++;
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
