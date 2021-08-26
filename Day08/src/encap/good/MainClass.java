package encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		
		me.setYear(1997);
		me.setMonth(7);
		me.setDay(18);
		me.setSsn("1111111111111");
		System.out.println(me.getYear() + "년 "+me.getMonth() + "월 " + me.getDay() +"일 " + " 주민번호>" + me.getSsn()) ;
		
		
		
	}

}
