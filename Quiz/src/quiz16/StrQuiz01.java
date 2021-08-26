package quiz16;

import java.util.Scanner;

public class StrQuiz01 {
	public static void main(String[] args) {
	
	/*
	 * 스캐너를 통해서 id 를 입력받습니다.
	 * 아이디는 공백을 포함해서 받을 수 있습니다.
	 * 단, 공백을 제거한 아이디가 4글자 미만이면 다시 입력받으세요 
	 * 4글자 이상이면 "id가 등록되었습니다" 를 출력하고 종료
	 */
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		
		System.out.print("id를 입력하세요 >");
		
		String id = scan.nextLine();
		String arr = id.replace("-", "");
		
		if (id.length() < 4) {
			System.out.println("공백 제거 4글자 이상의 아이디를 등록해주세요");
			
		} else {
			System.out.println("Id가 등록되었습니다.");
			break;
		}
		}
}
}
