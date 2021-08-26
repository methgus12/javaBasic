package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * 1.BufferedWriter, Date클래스를 이용해서 file 폴더 경로에 오늘 날짜 ex)20210322.txt로 파일을 씁니다
		 * 2.내용은 아무렇게나 작성하세요
		 * 3.파일을 정상적으로 썼다면 ,BufferedREADER을 이용해서 읽어들이세요 
		 *
		 */
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd") ;
		String result = sdf.format(date);
		
		FileWriter fw=null;
		BufferedWriter bw = null;

		Scanner scan = new Scanner(System.in);
		
		try {
			bw = new BufferedWriter(new FileWriter("/Users/sohyeon/file/"+result+".txt"));
			
			System.out.print("문장을 입력하세요 > ");
			String str= scan.nextLine();
			
			bw.write(str);
			bw.flush();//꼭 !
			System.out.println("파일이 정상 출력되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
				
			} catch (Exception e2) {
				
			}
		}
		
		///////////////파일 읽기 //////////////////////////////////////
		FileReader fr =null;
		BufferedReader br= null;
		
		try {
			br= new BufferedReader(new FileReader("/Users/sohyeon/file/" + result +".txt"));
			
			String str ;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
				
			}
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}

}
