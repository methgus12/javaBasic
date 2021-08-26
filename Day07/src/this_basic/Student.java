package this_basic;

public class Student extends Person {
	//이름, 나이 , 학번을 전달받아서 초기화하는 생성자를 this 키어드를 사용해서
	
	String studentId;
	
	Student() {
		
	}
	
	Student(String name , int age , String studentId) {
		this.name =name;
		this.age =age;
		this.studentId=studentId;
		
	}
	
	String info() {
		
		return "이름" + name + ",나이 :" + age + ",학번:" + studentId;
		
	}

}
