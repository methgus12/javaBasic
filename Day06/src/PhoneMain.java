

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone basic = new Phone();
		
		basic.info();
		
		Phone any = new Phone("빨강");
		any.info();
		
		Phone garo = new Phone(2000000, "화이트");
		garo.info();		
		
		Phone ruru = new Phone("ruru" , "골드" );
		ruru.info();
		
		
		Phone shaomi = new Phone("green" , 900000, "shaomi" );
		shaomi.info();
		
		//모든 멤버변수를 받아서 초기화 하는 생성자
		//green , 900000, 샤오미 를 전달해서 객체생성
		
		System.out.print(basic ==any);
		//false
		
		
		}
}
