package inherit.good;

public class Student extends Person {
	
	String name;
	int age;
	String studentId;
	
	String info() {
		return "이름" + name + ",나이 :" + age;
	}

}
