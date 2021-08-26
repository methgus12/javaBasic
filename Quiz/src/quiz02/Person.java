package quiz02;

public class Person {
	String name ;
	int age ;
	int tall;//멤버변수
	
	Person(){
		
	}
	//생성자를 프로그래머가 인위적으로 만들면 , 기본생성자를 자동으로 만들지않습니다.
	//즉습관적으로 만드는 습관을 가지도록 해요
	
	Person(String pName, int pAge , int pTall){
		name =pName;
		age=pAge;
		tall=pTall;
		
	}
	
	void info() {
		
	System.out.println(name);
	System.out.println(age + "세");
	System.out.println("키" + tall);
	System.out.println("------------------------");
	}

}

