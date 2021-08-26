package encap.good;

public class MyBirth {
	
	private int year ;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉 변수에 접근할때는 클래스 설계자가 미리생성해놓은
	 * getter, setter메서드를 사용합니다.
	 * 
	 * setter 메서드 
	 * 1.은닉변수의 값을 저장하는 용도
	 * 2.접근제어자는 public 으로 선언하고 , 이름이 set + 멤버변수 명으로 지정
	 */
	
	public void setYear(int year) {
		
		//예시로 year는 1950-2021년의 조건을 두면 ,설정가능
		if(year <= 1950 || year >2021) {
			System.out.println("년도는 1950 ~ 2021만 저장됩니다.");
		} else {
			this.year = year;
			this.month= month;
			this.day= day;
			
		}
	}
	/*
	 * getter 메서드의 선언
	 * 1.은닉변수의 값을 조회하는 용도
	 * 2.접근제어자는 public 으로 선언하고 이름은 get + 멤버변수명으로 지정
	 * 
	 */

	public int getYear() {
		return year;
		
	}
	
	/*
	 * 1.month, day, ssn에 getter, setter 생성
	 * 2.month 1-12, day 1-31일까지 저장가능
	 * 3.ssn- 13자리 까지만 저장가능 문자열 .length()
	 * 
	 */
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("달은 1~12까지만 저장됩니다.");
		} else {
			this.month =month;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setDay (int day) {
		if (day < 1 || day >31) {
			System.out.println("일은 1~31일까지 저장됩니다.");
		} else {
			this.day=day;
			
		}
	} public int getDay() {
		return day;
		}
	public void setSsn(String ssn) {
		if(ssn.length() == 13) {//문자열보기 기억
			this.ssn=ssn;
		} else {
			System.out.println("주민번호는 13자리를 입력하세요");
			
		}
	}public String getSsn() {
		return ssn;
	}
	}
