package basic;

import java.util.Scanner;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구입할 메뉴는 ?\n [수박, 사과 ,메론 , 토마토, 참외]" );
		System.out.println(" >");
		String mm = scan.next() ; //문자열이라!
		
		
		switch (mm) {
		case "수박":
			System.out.println(mm + "은 3만원입니다.");
			
			break;
			
		case "사과":
			System.out.println(mm + "은 7만원입니다.");
			
			break;
			
		case "메론":
			System.out.println(mm + "은 4만원입니다.");
			break;
	
		case "토마토":
			System.out.println(mm + "은 2만원입니다.");
			
			break;
			
		case "참외":
			System.out.println(mm + "은 1만원입니다.");
			
			break;
		

		default:
			break;
		}
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}


