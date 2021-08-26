package api.util.token;

import java.util.StringTokenizer;

public class TokenEx {
	
	public static void main(String[] args) {
		//문자열을 특정형태로 잘라 토큰형태로 나타내
		
		String str1="오늘 날씨는 맑고, 매우 추워용";
		String str2 = "2021/03/17";
		
	
		StringTokenizer token = new StringTokenizer(str1);//공백을기준으로 자름

		System.out.println("잘린토큰의 개수>"+ token.countTokens());
		//System.out.println(token.nextToken()); 더 자를게 없을 경우 에러 
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken()); 
			//그 경우 다음이 없다고 나타남
			//즉 다음이 있으면 true , 없으면 false
			
		}
		System.out.println("----------------------------------");
		
		StringTokenizer token2 = new StringTokenizer(str2+ "/");
		System.out.println("잘린토큰의 개수" + token2.countTokens());
		
		while(token2.hasMoreTokens()) {//다음이있는지 확인
			System.out.println(token2.nextToken());

			
		}
	
	}
}
