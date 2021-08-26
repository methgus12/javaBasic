package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		//날짜 포맷클래스
		/*
		 * MM - 월
		 * mm - 분
		 *'월' M 대문자 '분'은 m 소문자
		 * HH -24시형식으로
		 * hh- 12시형식으로
		 * 
		 */
		
		//날짜클래스
		Date date = new Date(); //import 유틸패키지 
		
		//날짜 포맷클래스
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");//형식
		String result = sdf.format(date);
		
		
		System.out.println(result);
		
		sdf = new SimpleDateFormat("yyyyMMdd");
		String result2= sdf.format(date);
		
		System.out.println(result2);
	}

}
