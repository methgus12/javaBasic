package api.io.stream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * outputstram 은 byte 기반으로 출력스트림
		 * 1.fileoutputstream 은 파일을 쓸때 사용하는 스트림
		 * 2.생성자 매개값으로 파일명 포함 , 전체경로를지정합니다.
		 * 3.io패키지는 모든 클래스가 생성자에서 throws 키워드가 있기때문에 try catch를함께 써야합니다. 

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명>");
		String name = scan.next();
		FileOutputStream fos = null; 
		try {
		fos = new FileOutputStream("/Users/sohyeon/file" + name + ".txt");
		System.out.println("문장을 입력해주세용>");
		scan.nextLine(); //next 다음에 nextLine을 쓰려고 할때 그냥 넘어가버리는 문제해결 
		
		String str = scan.nextLine(); //입력받을 문장
		byte [] arr = str.getBytes();//문자열을 byte데이터로 변경해주는 기능
		fos.write(arr);//파일을 바이트 단위로써내림
	
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}finally {
		try {
			fos.close();
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}
