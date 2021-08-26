package review;

import java.util.Scanner;

public class WorkTest16 {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 입력의 마지막에는 0 두 개가 들어온다.
		 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수입력>");
			int a = scan.nextInt();
			
			
			System.out.print("정수입력>");
			int b = scan.nextInt();
			
			System.out.println((a+b));
			if (a==0 && b==0) {
				break;
			}
			
		}
		
		
	}

}
