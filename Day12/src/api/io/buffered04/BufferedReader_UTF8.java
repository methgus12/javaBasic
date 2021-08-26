package api.io.buffered04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;




public class BufferedReader_UTF8 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedReader br= null;
		InputStreamReader is = null;
		
		
	try {
		//fis = new FileInputStream("/Users/sohyeon/file/20210322.txt");
		//is = new InputStreamReader(fis, "EUC-KR"); //첫번째 매개변수 inputstream ,디코딩형식
		//br = new BufferedReader(is);
		
		br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/sohyeon/file/20210322.txt"),"EUC-KR"));
		
		String str ;
		
		while((str = br.readLine()) != null) {
			
			System.out.println(str);
			
		}
	} catch (Exception e) {
		
	}
	}

}
