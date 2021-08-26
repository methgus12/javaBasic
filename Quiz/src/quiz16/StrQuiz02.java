package quiz16;

import java.util.Scanner;

public class StrQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 주민번호 13자리를 입력받습니다.
		 * 주민번호는 -포함해서 받을 수도 있습니다.
		 * 13자리가 아니라면 다시 입력받습니다.
		 * 남자 or 여자인지 구분해서 출력해주면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.print("주민번호를 입력하세요 >");
			String num = scan.next();
			num = num.replace("-", "");
			
			if(num.length() != 13) {
				System.out.println("다시입력하세요");
				
			} else {
				System.out.println("주민번호>" + num);

				char n = num.charAt(6);
				System.out.println(n);
				
				if(n == '1') {
				System.out.println("성별은 남자입니다.");
				} else if (n =='2' ) {
					System.out.println("성별은 여자입니다.");
					
				}
			}break;
			
		}
	}
}
