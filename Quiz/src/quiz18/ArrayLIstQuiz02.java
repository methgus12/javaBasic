package quiz18;
import java.util.ArrayList;
import java.util.List;


public class ArrayLIstQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
		 */
		
		
		List<User> list = new ArrayList<>();
		
		User u1 = new User ("홍길동" , 22);
		User u2= new User ("홍길자" , 25);
		
		list.add(u1);
		list.add(u2);
		
		for(User u : list) {
			
			
		}
		
		//list에 저장된 모든 이름,나이를 for문으로 출력
		
		for (int i =0; i < list.size(); i++) {
		
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
		}
		
		for(User u : list) {
			System.out.println(u.getName());
			System.out.println(u.getAge());
		}
		System.out.println("--------------------------------------");
		for(int i =0; i < list.size(); i++) {

			if(list.get(i).getName().equals("홍길자")) {
				
			System.out.println("이름>"+list.get(i).getName());
			System.out.println("나이>"+list.get(i).getAge()); 

			}
			
		}
		
		for (int i =0; i < list.size() ; i++) {
			User u = list.get(i);
			
			if(u.getName().equals("홍길동"));
			list.remove(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
	}
}
