package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.스캐너를 이용해서 파일명을 정확히 입력 받습니다.
		 * 2.file 폴더에 스캐너로 입력받은 파일명이 있다면 filecopy 폴더로 복사하세요 
		 * 3.파일명이 없는 경우에 대한 예외처리 , 복사도중발생하는 예외처리는 2가지로 해주세요 
		 * 
		 */
		
		// 1.스캐너를 이용해서 파일명을 정확히 입력 받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력하세용 > ");
		String name = scan.next();
		
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("/Users/sohyeon/file/" + name);
			fos = new FileOutputStream("/Users/sohyeon/filecopy/" + name);
			
			
			byte [] arr = new byte [100];

			int result;
			while ((result= fis.read(arr)) != -1 ) {
				fos.write(arr, 0, result);
			}
			System.out.println("파일의 복사가 정상적으로 이루어졌습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println(name + "파일을 찾을 수 없습니다.");
			
			
		}catch (IOException e) {
			System.out.println( "파일처리도중 에러가 발생했습니다.");
			
		}finally {
			try {
				fos.close();
				fis.close();
				
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
