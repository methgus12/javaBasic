package api.util.token;

import java.util.StringTokenizer;

public class TokenEX02 {
	public static void main(String[] args) {
		
		String str = "2021.03.17 , 수요일 , /bno=30 , id = 홍길자";
		StringTokenizer token = new StringTokenizer(str, ",");//구분자 한개
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
			
			
		}
		
		System.out.println("--------------------------------------");
		//여러 구분자를 이용해서 자를 수 있음
		StringTokenizer token2 = new StringTokenizer(str, ",./");
		
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
			
		}
		
		System.out.println("--------------------------------------");
		//구분자 기준으로 자르고 구분자도 토큰에 포함 !
		
		StringTokenizer token3 = new StringTokenizer(str, ",", true);
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
	}

}
