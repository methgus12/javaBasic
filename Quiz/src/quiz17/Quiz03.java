package quiz17;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		/*
		 *1. 스캐너 이용해서 nextLine() 으로 문장을 받습니다.
		 *2. 입력받은 문장을 토크나이저를 이용해서 공백기준으로 분리.
		 *3. 분리한 토큰의 개수 출력
		 *4. for문으로 아래 출력형식으로 뽑아주세요 
		 *
		 *ex) 1.안녕
		 *    2.하세요.
		 *    3.오늘은
		 * 
		 * 5.분리된 토큰은 배열에 새롭게 저장
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하세요 >");
		String str = scan.nextLine();
	
		
		StringTokenizer token = new StringTokenizer(str);
		System.out.println("잘린토큰의 개수>" + token.countTokens());
		
		
		String [] arr = new String[token.countTokens()];
		
		for(int i =1; token.hasMoreTokens(); i++) {
			
			String word = token.nextToken(); //한번 사용될 때마다 다음으로 이동
			arr[i-1] = word;
			
			System.out.println(i + "." + word);
		}
		
		
		
		
		
		
		
		
		
	
	}

}
