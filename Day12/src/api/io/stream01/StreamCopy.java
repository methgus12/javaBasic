package api.io.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class StreamCopy {
	
	public static void main(String[] args) {
		
		//파일 복사로 옮기기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//읽어들일 경
			fis = new FileInputStream("/Users/sohyeon/eclipse-workspace/Day12/src/api/io/stream01/bolt.jpeg");
			
			//복사할 경로
			fos = new FileOutputStream("/Users/sohyeon/file/bolt.jpeg");
			
			byte [] arr = new byte [100];//100바이트 단위로 읽음.
			
			//while (true) {
			//	int result = fis.read(arr);
			//	if(result == -1) break;
			//	fos.write(arr, 0 , result); //arr의 0부터 result 길이까지 읽는다.
				
			//}
			
			int result ;
			while ((result = fis.read(arr)) != -1) {
				fos.write(arr, 0, result);
				
			}
			
			System.out.println("파일의 복사가 정상 처리되었습니당 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
