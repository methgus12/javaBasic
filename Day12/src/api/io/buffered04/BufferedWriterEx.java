package api.io.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw= null;
		Scanner scan = new Scanner(System.in);
		
		
		try {
			
			//fw = new FileWriter("/Users/sohyeon/file/filetest03.txt");
			//bw= new BufferedWriter(fw);
			
			bw = new BufferedWriter(new FileWriter("/Users/sohyeon/file/filetest03.txt"));
			
			System.out.print("한문장>");
			String str1 = scan.nextLine();
			
			System.out.print("두문장>");
			String str2 = scan.nextLine();
			
			bw.write(str1+ "\r\n" + str2);//파일을쓴다.
			bw.flush();//버퍼를 모아서 보낸다
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				scan.close();
			} catch (Exception e2) {
			}
		}
	}

}
