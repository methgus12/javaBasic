package review;

import java.util.Scanner;

public class WorkTest11 {
	
	public static void main(String[] args) {
		
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, 
		 * A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int t = 5;
		int sum = 0;
		
		System.out.println(t);
			for (int i =1; i <= t; i++) {
				System.out.print("정수입력>");
				int a = scan.nextInt();
				
				System.out.print("정수입력>");
				int b = scan.nextInt();
				
				if (a >0 && b <10) {
				for(int j =1; j <= t; j++) {
					sum = a+b;
				}
		}
		
			System.out.println("Case #" +i + ":"+ sum);
	}
}
}