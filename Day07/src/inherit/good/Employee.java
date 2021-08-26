package inherit.good;

public class Employee extends Person{
	
	String name;
	int age;
	String department; //부서
	
	String info() {
		return "이름:" + name + "나이" + age;
		
	}

}
