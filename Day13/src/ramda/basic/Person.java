package ramda.basic;

public class Person {
	
	//사람의 인사하기기능
	public void greeting(Say01 say) {
		say.talking();
	}
	
	//사람의 인사하기 기능2
	//say02의 talking은반환이 있는 유형
	
	public void greeting(Say02 say) {
		String word  = say.talking();
		System.out.println(word);
	}
	
	//사람의 인사하기 기능
	//say03의 talking은 매개변수도 있고 반환도 있는 유형
	public void greeting (Say03 say) {
		String result =say.talking("제이름은 :");
		System.out.println(result);
		
		
	}
	
	public String  greeting(Say04 say) {
		String result = say.talking("Hi", 3);
		return result;
		
		
	}
}
