package quiz02;

public class PersonMain {
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("이보리" , 2, 60);
		p1.info();
		
		
		 Person p2 = new Person();
		 p2.name = "이혜원";
		 p2.age = 25;
		 p2.tall=169;
		 p2.info();
		 
		 Person p3 = new Person();
		 
		 p3.name = "탁소현";
		 p3.age = 25;
		 p3.tall=158;
		 p3.info();
		 
	}

}
