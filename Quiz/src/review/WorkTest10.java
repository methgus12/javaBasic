package review;

import java.util.Scanner;

public class WorkTest10 {
	public static void main(String[] args) {
		
		/*
		 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		
		int n = scan.nextInt();
		
		if (n <= 100000) {
			
			for(int i= n; i <= 1; i-- ) {
				
				System.out.println(i);
			}
		}
	}

}
