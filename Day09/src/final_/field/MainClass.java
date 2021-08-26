package final_.field;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "권시민");
//	    p1.nation = "미국";
//	    p2.ssn = "kim시민";	값의 변경이 불가 -> 사용은 가능 !!
		System.out.println("국적>" + p1.nation);
		
		
		Person p2 = new Person( "123", "권율");
		
		
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
		
		
		
		
	}

}
