package Overriding.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person(); 
		
		p.name = "홍길동";
		p.age=20;
		System.out.println(p.info());
		
		//S, T,E 클래스에서 각각의 고유 정보가 출력될 수있도록 info() 오버라이딩하세요.		
		
		Student s = new Student();
		s.name = "이순신";
		s.age=30;
		s.studentId="123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name ="탁소현";
		t.age=25;
		t.subject="음악";
		System.out.println(t.info());
		
		Employee e = new Employee()  ;
		e.name="홍길자";
		e.age=50;
		e.department ="역사";
		
		System.out.println(e.info());
	}

}
