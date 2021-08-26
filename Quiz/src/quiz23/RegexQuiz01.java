package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		/*
		 * 많이 사용되는 정규표현형식들.. 
		 * \\w 영문자 숫자
		 * \\w+ 영문자숫자 여러개
		 * 
		 * \\d 숫자만
		 * \\d+ 숫자여러개
		 * 
		 * \\d{3} 숫자3개
		 * \\d{3,5} 3개이상 5개이하
		 * 
		 * [0-9] 0~9 사이의문자를 한개찾음
		 * [a-z] a-z 사이의 문자를 한개찾음
		 * [A-Z] A-Z 사이의 문자를 한개찾음
		 * [가-힣] 한글 1개찾음
		 * [가-힣]+ 한글 여러개 찾음
		 * 
		 */
		
		
		/*
		 * 가격 형식만 찾아서 추출하세요 
		 * ex)-원
		 */
		
		String str = "헠4,500원 헐~ 1,200원엏? 6000원ㅋ 120000원ㅎㅎ";
		String pattern = "\\d\\,*\\d+";
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher(str); 
		while(m.find()) {
			
			System.out.println("찾은 인덱스위치>" + m.start());
			System.out.println(" 인덱스위>" + m.end());
			System.out.println("추출>" + m.group());
		}
		
		 
		
	}
}
