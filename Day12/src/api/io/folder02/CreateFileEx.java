package api.io.folder02;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		
		//폴더를 생성하는 방법 : file 클래스이용
		
		try {
			File file = new File ("/Users/sohyeon/file/filetest");
			if ( !file.exists()) { //파일이 존재하면 true , 아니면 false=> !을이용하여반대
				file.mkdir(); //파일 생성
				System.out.println("폴더생성성공");
				
			} else {
				System.out.println("해당 폴더가 이미 존재합니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
