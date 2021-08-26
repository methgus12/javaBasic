package basic;

import java.util.Scanner;

public class Quiz07 {

	
	public static void main(String[] args) {
		
		
		/*정수 3개를 입력받습니다.
		순서 상관 없이 가장 큰 값, 중간 값, 가장 작은 값을 구분해서 출력
		단  , 같은 수 인경우는 고려하지 않습니다.
		
		*/
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요>");
		int aa = scan.nextInt();
		
		System.out.print("두번째 정수를 입력하세요>");
		int bb = scan.nextInt();
		
		System.out.print("세번째 정수를 입력하세요>");
		int cc = scan.nextInt();
		
		//내가 한것 처럼 말고 &&을 하는게 훨 씬 간편!!
		if(aa > bb) { 
			if (aa > cc) {
			System.out.println("가장 큰 값은 >" + aa);
		} if (bb > cc) {
			System.out.println("중간 값은 >" + bb);
			System.out.println("가장 작은 값은 >" +cc);
			} else {
				System.out.println("중간 값은 >" + cc);
				System.out.println("가장 작은 값은 >" +bb);
			} 
		} else if (bb > aa) {
			if (bb > cc) {
				System.out.println("가장 큰 값은 >" + bb);
			} if (aa > cc) {
				System.out.println("중간 값은 >" + aa);
				System.out.println("가장 작은 값은 >" +cc);
				} else {
					System.out.println("중간 값은 >" + cc);
					System.out.println("가장 작은 값은 >" +aa);
				} 
				
			
		} else if (cc > aa) {
			if (cc > bb) {
				System.out.println("가장 큰 값은 >" + cc);	
				
			} if (aa > bb) {
				System.out.println("중간 값은 >" + aa);
				System.out.println("가장 작은 값은 >" +bb);
				} else {
					System.out.println("중간 값은 >" + bb);
					System.out.println("가장 작은 값은 >" +aa);
				} 
			
		} else if (aa == bb && bb == cc) {
			System.out.println("모두 같습니다.");	
			
			
		}
	
		
		
		
	}

}
