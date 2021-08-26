package api.util.calendar;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		//Calendar는 일반적인 객체생성이 안됩니다.(싱글톤-객체한개만 만드는것)
		
		Calendar cal =Calendar.getInstance();
		
		int year =cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1; //month는 항상 1이 느려 1플러스 해줘야함
		System.out.println(month);
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		int hour =cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute=cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		
		
		
		
		
	}

}
