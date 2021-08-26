package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 상품번호 , 도시락 명 , 가격으로 분리해서 출력
		 */
		
		String str = "123123-456456 GS25(마늘햄쌈) 4,400원";
		String str2 = "111111-222222 GS25(치킨도시락) 5,500원";
		String str3 = "222222-333333 MINISTOP(제육볶음) 5,700";
		
		String pattern = "\\d+-\\d+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);		
		Matcher m2 = p.matcher(str2);
		Matcher m3 = p.matcher(str3);
		
		String pattern2 = "[A-Z]+\\d*+\\([가-힣]+\\)"; 
		Pattern p2 =Pattern.compile(pattern2);
		Matcher mm=p2.matcher(str); 
		Matcher mm2=p2.matcher(str2);
		Matcher mm3=p2.matcher(str3);
		
		String pattern3 = "\\d\\,\\d+원*";
		Pattern p3 = Pattern.compile(pattern3);
		Matcher mmm = p3.matcher(str);
		Matcher mmm2= p3.matcher(str2);
		Matcher mmm3= p3.matcher(str3);
		
		//찾을문장을 배열에 
		String [] arr = {str , str2 , str3};
		int i =0;
		while(i<arr.length) {
			
			
			i++;
		}
		
	}
}
		