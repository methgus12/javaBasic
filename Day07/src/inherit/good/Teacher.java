package inherit.good;

public class Teacher extends  Person{
	String name;
	int age;
	String subject;
	
	String info() {
		return "이름:" + name + "나이:" + age;
		
	}

}
