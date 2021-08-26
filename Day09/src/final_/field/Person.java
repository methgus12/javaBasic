package final_.field;

public class Person {
	/*
	 * final 변수는 값이 대입되면 , 변경 할 수 없어서 반드시 초기화를 해야함
	 * 1.직접초기화
	 * 2.생성자를 통한 초기화
	 */
	
	public final String nation="대한민국";
	public final String ssn;
	
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name= name;
		
	}
	
	
	
}
