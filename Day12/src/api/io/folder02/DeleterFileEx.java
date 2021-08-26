package api.io.folder02;

import java.io.File;

public class DeleterFileEx {
	public static void main(String[] args) {
		
		
		//폴더를 삭제하는 방법
		try {
			File file = new File("/Users/sohyeon/file/filetest");
			if( file.exists()) {
				file.delete();	 //폴더삭제
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제할 폴더가 없습니다.");
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
