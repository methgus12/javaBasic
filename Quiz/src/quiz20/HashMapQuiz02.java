package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapQuiz02 {
	
	public static void main(String[] args) {
		
		//map을 이용하는 key는 메뉴 , value는 가격
		Map<String , Integer> map = new HashMap<>(); 
		Scanner scan = new Scanner(System.in);
		
		try {
			
		while (true) {
			
			System.out.println("-------------음식메뉴관리-------------");
			System.out.println("1.신규메뉴등록");//이미 등록된 메뉴인지 확인 후에 메뉴로 등록
			System.out.println("2.메뉴판 전체보기");//메뉴와 가격을 전부 출력
			System.out.println("3.메뉴수정");//변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4.메뉴삭제");//삭제할 메뉴를 받아서 있다면 삭제
			System.out.println("5.종료");//종료
			
			System.out.print("원하시는 관리의 번호를 입력하세요 > ");
			int num = scan.nextInt();
			
			
			if(num ==1) {
				//이미 등록된 메뉴인지 확인 후에 메뉴로 등록
				System.out.print("등록할 메뉴를 입력하세요>");
				String menu = scan.next();
				
				if(!map.containsKey(menu)) {
					System.out.print("등록할 메뉴의 가격을 입력하세요>");
					int price = scan.nextInt();
					
					map.put(menu, price);
					System.out.println(menu + " 새로운 메뉴로 등록되었습니다! ");
		
				} else {
					System.out.println(menu + "은 (는) 이미등록된 메뉴입니다!");
				}

			} else if (num ==2 ) {
				//메뉴와 가격을 전부 출력
				
				Set<Entry<String , Integer>> set = map.entrySet();
				
				for(Entry<String, Integer> e: set) {
					System.out.println("-----------전체메뉴-----------");
					System.out.println("메뉴>" +e.getKey() + ", 가격 > " + e.getValue());
				}
				System.out.println("------------------------------");
				
			} else if (num==3) {
				//변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
				
				System.out.print("가격을 수정할 메뉴를 입력하세요>");
				String menu = scan.next();
				
				if(map.containsKey(menu)) {
					System.out.print ("수정할 가격을 입력하세요>");
					int price = scan.nextInt();
					
					map.put(menu, price);
					System.out.println("가격이 수정되었습니다" +map.toString());
				} else {
					System.out.println("수정할 메뉴가 없습니다.");
				}
				
				
			} else if (num ==4) {
				
				System.out.print("삭제할 메뉴를 입력하세요 >");
				String menu = scan.next();
				
				if(map.containsKey(menu)) {
					map.remove(menu);
					System.out.println(menu + "삭제되었습니다.");
				} else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
				
			} else if (num ==5) {
				System.out.println("메뉴관리를 종료합니다.");
				break;
				//System.exit();
			} else {
				System.out.println("올바른 번호를 다시 입력해주세요");
				continue ;
			}
	
		}
		
	} catch (Exception e) {
		System.out.println("주어진 숫자를 입력하세요");
		
	}

}
}
