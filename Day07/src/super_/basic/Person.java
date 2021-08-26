package super_.basic;

public class Person {
	
	String name;
	int age;
	
	//this 활용하기 this.변수
		//번거롭게 이름 바꾸어서 지정할 필요없음
		
		Person(String name, int age){
			super(); 
			this.name = name;
			this.age=age;
			System.out.println(this.info());
		}
		
		
		Person(String name) {
			//this.name= name;
			//this.age=1;
			
			//더 간결하게 this ()
			this(name,1);
		}
		
		Person() {
			//this.name="이름 없음";
			//this.age=1;
			//위의 내용을한번에 더 간결하게 this();
			
			this("이름없음" , 1);
			
		}
		
	String info() {
		return "이름>" + name + ",나이 >" + age;
	}
	

}
