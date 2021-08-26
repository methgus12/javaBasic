package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapQuiz01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("kim", "kkk123");
		map.put("park","park123");
		map.put("lee", "lee111");
		map.put("choi", "choi222");
		
		/*
		 * 1. 입력받은 아이디가 맵에 입력된 키값에 해당하는지 여부를 검사해서
		 *  존재한다면 비밀번화와 값도 비교합니다 . 그다음에 비밀번호가 일치한다면 "로그인성공" 
		 * 을 출력하고 반복문을탈출하세요 .
		 * 
		 * 2.아이디가 맵에 없는 값이라면 "아이디가 없습니다 " 출력
		 * 비밀번호 틀렸다면 "비밀번호가 틀렸습니다 " 출력하고 다시 입력받으세요 

		 */
		
		Scanner scan = new Scanner(System.in);
		
		out:while (true) {
			
			System.out.println("ID 입력>");
			String id = scan.next();
			
			
			while(true) {
			if (map.containsKey(id)) {
				
				String v = map.get(id);
				System.out.println("PassWord 입력>");
				String pw = scan.next();
				
				if(v.contains(pw)) {
					System.out.println("로그인 성공 !");
					break ;
					
				} else {
					System.out.println ("비밀번호가 틀렸습니다. 다시 입력하세요 " );

				}
		
			} else {
				
				System.out.println("아이디가 없습니다. 다시 입력하세요 ");
				continue out;
			}
			
		}
		}
		
		
	}

}
