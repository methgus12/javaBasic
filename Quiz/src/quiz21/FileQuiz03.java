package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.date 클래스를 이용해서 file 경로에 "20210323" file 폴더를 생성합니다
		 * 2.파일명.txt 파일로 파일을 씁니다.(파일명.txt) 
		 * 3.exit를 입력 받을 때까지 엔터를포함해서 실시간으로 파일을 씁니다.
		 * 4.exit로 파일을써졌다면 , 아무방법으로나 파일을 읽으세요
		 */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now =  sdf.format(date);
		
		FileWriter fw=null;
		BufferedWriter bw = null;
		Scanner scan = new Scanner(System.in);
		
		//file.getPath  사용하면 훨씬 좋아용
		try {
			File file = new File("/Users/sohyeon/" + now );
			if ( ! file.exists()) {
				file.mkdir();
				System.out.println("파일 생성성공 !");
			} else {
				System.out.println("해당폴더가 이미 존재합니다.");
			}
			
			
			bw = new BufferedWriter(new FileWriter("/Users/sohyeon/" + now + "/filetest04.txt"));
			System.out.print("원하시는 문장을 입력하세요 > ");
			
			while(true) {
				
				String str = scan.nextLine();
				
				if (str.equals("exit")) break;
				
				bw.write(str + "\r\n"); //줄바
				bw.flush();
			}
		
		System.out.println("파일이 정상 출력되었습니다."); 

		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			try {
				bw.close();
				scan.close();
				
			} catch (Exception e) {
				
			}
		}
		///////////////////////////////////////////////////////
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			br= new BufferedReader(new FileReader("/Users/sohyeon/" + now + "/filetest04.txt"));
			
			String str ;
			while ((str = br.readLine()) != null ) {
				System.out.println(str);
			}
			
		} catch (Exception e3) {
			
		} finally {
			
			try {
				br.close();
			} catch (Exception e) {
				
			}
		}
		
		
	}

}
