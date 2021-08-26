package basic;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		//정수 2개를 입력받아서 어떤 값이 큰수인지 출력
		//만약 같은 수라면 "같은 수 입니다"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int p1 = scan.nextInt();
		
		System.out.print(">");
		int p2 = scan.nextInt();
		
		if (p1 == p2 ) {
			System.out.println("같은수 입니다.");
			
		} else if (p1 > p2) {
			System.out.println(p1);
			
		} else {
			System.out.println(p2);
			
			
		}
		
		
		
	}

}
