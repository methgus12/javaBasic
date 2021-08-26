package basic;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		//성공못한퀴즈복습하기 ㅜㅜ..
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 > ");
		int a = scan.nextInt();
		
		System.out.print("연산을 선택하세요[ +,-,*,/ ] > " );
		String ppp = scan.next();
		
		
		System.out.print("정수2 > ");
		int a2 = scan.nextInt();
		
		switch (ppp) {
		case "+" :
			System.out.println("덧셈의 결과는 " + (a + a2));
			
			break;
			
		case "-" :
			System.out.println("뺄셈의 결과는 " + (a - a2));
			
			break;
			
		case "*" :
			System.out.println("곱하기의 결과는 " + (a * a2));
			
			break;
			
		case "/" :
			System.out.println("나눗의 결과는 " + (a / a2));
			//정수연산이라 정수로 답이 나옴 .
			//실수로 받고싶으면 double 형으로 받음 
			//((double)n1 / n2)  이 모양
			
			break;

		default:
			System.out.println("사칙연산을 입력하세 ");
			System.out.println("[+, -, *, /] ");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
